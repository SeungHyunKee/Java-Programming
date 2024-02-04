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
 * Java�� �̿��� ������ ����� ������ ����/���� �ϴ� �ڵ�
 */
public class WriteExam {

	/**
	 * ������ ����.
	 * @param parent ������ �� ���
	 * @param fileName �� ������ �̸�
	 * @param append �̾ �� ������ ����
	 */
	public static void writeFile(String parent, String fileName, boolean append) {

		
		File file = new File(parent, fileName);
		if( ! file.getParentFile().exists()) { //file.getParentFile() = C:\\java\\outputs 
			file.getParentFile().mkdirs(); // mkdirs : make directories
			// mkdir => java�� ������ְ�, mkdirs => java, outputs �Ѵ� �������(�̰ɻ��)
		}	
		
		
		// �̾ ���ԵǸ� ���������� originalFileDescription�� ��
		/*
		 * ������ ���� ���� ���ִ� �뵵
		 */
		List<String> originalFileDescription = new ArrayList<>();
		if( ! append ) {//�̾ ���°� �ƴ϶�� : ���ο� ���� �������
		//������ ���� ������ ��ȣ�ϱ� ���� ������ �̸��� �ٸ��� ����(����� ������)
		// -> �ڵ� ���� �� �� ����java.output(1), java.output(2), java.output(3).. �̷������� ������
		
		// �׷��ٸ�, ������ �̾ �� ���� ����? -> ������ �̾ �����ִ� �޼ҵ�� ����. 
		// -> java 1.8 �̸� : ������ ���ϳ��� �� �о�ͼ� ���Ӱ� ������ ���� ����� ����Ҽ��ۿ�����.
		// -> java1.8 �Ǿ�� ���Ե� (= �̾�� �����ϰԵ�)
			int index = 2; //�̾ ���� �������̶��.. ����
			while( file.exists()) {
				file = new File("C:\\java\\outputs", // C:\\java\\outputs = file.getParent()
						"java_output (" + (index++) + ").txt"); // index++ = 2, �ش� �ݺ��� ���� �� �� ���� 3�� ��
			}
		}
		else {
			//�̾ �� ���̶��..����
			//������ ���ϳ��� �о�ͼ� List<String>���� ��ȯ�ް�
			originalFileDescription.addAll(ReadAndPrintExam.getAllLines(file));
			//��ȯ���� ������ originalFileDesvription�� addAll�Ѵ�
		}
		
		FileWriter fw = null; //byte ������ ���°�
		BufferedWriter bw = null;// ���پ� ���°�
		
		try { //new �ϸ鼭 2���� �������� ���� -> ���� try���� ���߿� ����(new)�ź��� close ����ߵ�
			fw = new FileWriter(file, Charset.forName("UTF-8"));
			bw = new BufferedWriter(fw);
			
			//�̾ �����̶�� �Ʒ��ڵ� ����
			if(append) {
				for(String originalFileLine : originalFileDescription) {
					bw.write(originalFileLine);
				}
			}
			
			bw.write("������ ���ϴ�1. \n");
			bw.write("������ ���ϴ�2. \n");
			bw.write("������ ���ϴ�3. \n");
			bw.flush();  //bw(=bufferedwriter) : �ϴ� ����, flush ���ٶ� �ѹ��� ���Ͽ� ���� ��
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
		//ó������Ǹ� : ������ ���ϴ�123. �� ����
		writeFile("C:\\java\\outputs", "java_output.txt", false); //false = �̾���������ƶ�
		//�ι�° ����Ǹ� : ������ ���ϴ�123. �� 2�� ����
		writeFile("C:\\java\\outputs", "java_output.txt", true); //true = �̾�ٿ���
		
		// ����� ����°��̹Ƿ� ~~~(2) ������ ����
		writeFile("C:\\java\\outputs", "java_output.txt", false); 

	}
	
}
