package file_io.writefile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import file_io.readfile.ReadAndPrintExam;

/**
 * Java를 이용해 폴더를 만들고 파일을 생성/쓰기 하는 코드
 */
public class WriteExam {

	/**
	 * 파일을 쓴다.
	 * @param parent 파일을 쓸 경로
	 * @param fileName 쓸 파일의 이름
	 * @param append 이어서 쓸 것인지 여부
	 */
	public static void writeFile(String parent, String fileName, boolean append) {

		
		File file = new File(parent, fileName);
		if( ! file.getParentFile().exists()) { //file.getParentFile() = C:\\java\\outputs 
			file.getParentFile().mkdirs(); // mkdirs : make directories
			// mkdir => java만 만들어주고, mkdirs => java, outputs 둘다 만들어줌(이걸사용)
		}	
		
		
		// 이어서 쓰게되면 원본파일이 originalFileDescription에 들어감
		/*
		 * 기존의 파일 내용 써주는 용도
		 */
		List<String> originalFileDescription = new ArrayList<>();
		if( ! append ) {//이어서 쓰는게 아니라면 : 새로운 파일 만들어줌
		//기존의 파일 내용을 보호하기 위해 파일의 이름을 다르게 해줌(덮어쓰기 방지용)
		// -> 코드 실행 할 때 마다java.output(1), java.output(2), java.output(3).. 이런식으로 생성됨
		
		// 그렇다면, 파일을 이어서 쓸 수는 없나? -> 파일을 이어서 쓸수있는 메소드는 없음. 
		// -> java 1.8 미만 : 기존의 파일내용 다 읽어와서 새롭게 파일을 쓰는 방법을 사용할수밖에없다.
		// -> java1.8 되어서야 도입됨 (= 이어쓰기 가능하게됨)
			int index = 2; //이어서 쓰지 않을것이라면.. 영역
			while( file.exists()) {
				file = new File("C:\\java\\outputs", // C:\\java\\outputs = file.getParent()
						"java_output (" + (index++) + ").txt"); // index++ = 2, 해당 반복문 실행 후 그 다음 3이 됨
			}
		}
		else {
			//이어서 쓸 것이라면..영역
			//기존의 파일내용 읽어와서 List<String>으로 반환받고
			originalFileDescription.addAll(ReadAndPrintExam.getAllLines(file));
			//반환받은 내용은 originalFileDesvription에 addAll한다
		}
		
		FileWriter fw = null; //byte 단위로 쓰는것
		BufferedWriter bw = null;// 한줄씩 쓰는것
		
		try { //new 하면서 2개의 파이프가 열림 -> 이후 try에서 나중에 열린(new)거부터 close 해줘야됨
			fw = new FileWriter(file, Charset.forName("UTF-8"));
			bw = new BufferedWriter(fw);
			
			//이어서 쓸것이라면 아래코드 실행
			if(append) {
				for(String originalFileLine : originalFileDescription) {
					bw.write(originalFileLine);
				}
			}
			
			bw.write("파일을 씁니다1. \n");
			bw.write("파일을 씁니다2. \n");
			bw.write("파일을 씁니다3. \n");
			bw.flush();  //bw(=bufferedwriter) : 일단 쓰고, flush 해줄때 한번에 파일에 값이 들어감
		}
		catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		
		finally {
			if (bw != null) {
				try {
					bw.close();
				}
				catch(IOException ioe) {}
			}
			if (fw != null) {
				try {
					fw.close();
				}
				catch(IOException ioe) {}
			}
		}
		System.out.println(file.getAbsolutePath());
	
		
	}
	
	public static void main(String[] args) {
		//처음실행되면 : 파일을 씁니다123. 이 나옴
		writeFile("C:\\java\\outputs", "java_output.txt", false); //false = 이어붙이지말아라
		//두번째 실행되면 : 파일을 씁니다123. 이 2번 나옴
		writeFile("C:\\java\\outputs", "java_output.txt", true); //true = 이어붙여라
		
		// 덮어쓰지 말라는것이므로 ~~~(2) 파일이 생김
		writeFile("C:\\java\\outputs", "java_output.txt", false); 

	}
	
}
