package file_io.writefile;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class NIOWriteExam {

	public static void main(String[] args) {
		
		
//		//가변파라미터(파라미터에만 쓸수있음) - 마치 배열인 것처럼
//		// 가변파라미터 : 항상 파라미터의 끝에 와야됨
//		public static int getSum(int age, int ... numbers) {
//			System.out.println(numbers);
//			
//			int sum = 0;
//			for(int i : numbers){
//				System.out.println(i);
//				sum += 1;
//			}
//			return sum;
//		}
//		
//		public static void main(String[] args) {
//		
//			int sum = getSum(1,2,3);
//			int sum = getSum(1);
//			System.out.println(sum);
//		}
		
	
		//이어쓰기 위한 변수 추가
		boolean append = true;
		
		
		//파일이 있는지 물어보는것
		File file = new File("C:\\outputs2", "java_output2.txt");
		if( ! file.getParentFile().exists()) { //file.getParentFile() = C:\\java\\outputs 
			file.getParentFile().mkdirs(); // mkdirs : make directories
			// mkdir => java만 만들어주고, mkdirs => java, outputs 둘다 만들어줌(이걸사용)
		}	
		
		//이어서쓰는게 아니라면 파일명 새로 작성하기 위해 아래코드 작성
		if( ! append ) {
			int index = 2; //이어서 쓰지 않을것이라면.. 영역
			while( file.exists()) {
				file = new File(file.getParent(), // C:\\java\\outputs = file.getParent()
						"java_outputs2 (" + (index++) + ").txt"); 
						// index++ = 2, 해당 반복문 실행 후 그 다음 3이 됨
			}
		}
		
		//파일에 쓸 내용
		List<String> fileDesc = new ArrayList<>();
		fileDesc.add("파일을 씁니다1");
		fileDesc.add("파일을 씁니다2");
		fileDesc.add("파일을 씁니다3");

		//파일을 쓴다
		try {
//			Set<StandardOpenOption> defaultOption = 
//					Set.of(StandardOpenOption.CREATE,
//							StandardOpenOption.TRUNCATE_EXISTING,
//							StandardOpenOption.WRITE);
			if( ! append) {
				Files.write(file.toPath(), fileDesc, Charset.forName("UTF-8"));

			}
			else { //이어쓰기
				
				Files.write(file.toPath(), fileDesc,
						Charset.forName("UTF-8"), StandardOpenOption.APPEND);
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(file.getAbsolutePath());
	}
}
