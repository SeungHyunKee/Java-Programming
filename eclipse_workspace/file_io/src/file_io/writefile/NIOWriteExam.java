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
		
		
//		//�����Ķ����(�Ķ���Ϳ��� ��������) - ��ġ �迭�� ��ó��
//		// �����Ķ���� : �׻� �Ķ������ ���� �;ߵ�
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
		
	
		//�̾�� ���� ���� �߰�
		boolean append = true;
		
		
		//������ �ִ��� ����°�
		File file = new File("C:\\outputs2", "java_output2.txt");
		if( ! file.getParentFile().exists()) { //file.getParentFile() = C:\\java\\outputs 
			file.getParentFile().mkdirs(); // mkdirs : make directories
			// mkdir => java�� ������ְ�, mkdirs => java, outputs �Ѵ� �������(�̰ɻ��)
		}	
		
		//�̾���°� �ƴ϶�� ���ϸ� ���� �ۼ��ϱ� ���� �Ʒ��ڵ� �ۼ�
		if( ! append ) {
			int index = 2; //�̾ ���� �������̶��.. ����
			while( file.exists()) {
				file = new File(file.getParent(), // C:\\java\\outputs = file.getParent()
						"java_outputs2 (" + (index++) + ").txt"); 
						// index++ = 2, �ش� �ݺ��� ���� �� �� ���� 3�� ��
			}
		}
		
		//���Ͽ� �� ����
		List<String> fileDesc = new ArrayList<>();
		fileDesc.add("������ ���ϴ�1");
		fileDesc.add("������ ���ϴ�2");
		fileDesc.add("������ ���ϴ�3");

		//������ ����
		try {
//			Set<StandardOpenOption> defaultOption = 
//					Set.of(StandardOpenOption.CREATE,
//							StandardOpenOption.TRUNCATE_EXISTING,
//							StandardOpenOption.WRITE);
			if( ! append) {
				Files.write(file.toPath(), fileDesc, Charset.forName("UTF-8"));

			}
			else { //�̾��
				
				Files.write(file.toPath(), fileDesc,
						Charset.forName("UTF-8"), StandardOpenOption.APPEND);
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(file.getAbsolutePath());
	}
}
