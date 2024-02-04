package file_io.readfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;


/**
 * ������ �о� ������ ����ϴ� �ڵ�
 */
public class ReadAndPrintExam {
	
	public static List<String> getAllLines(File file){
				
		if (file.exists() && file.isFile()) {
		
			FileReader reader = null;
			BufferedReader bufferedReader = null;
			try {
				// ������ ����Ʈ ������ �о���� FileReader�� ���� (������ ����)
				reader = new FileReader(file, Charset.forName("UTF-8"));
				// ������ ���� ������ �о���� BufferedReader ����
				bufferedReader = new BufferedReader(reader);
				// ������ ���δ����� �о�� �Ҵ��ϱ� ���� String ���� ����(������ ����)				
				
				List<String> lineList = new ArrayList<>();
				
				/*
				 * ���������� ���ֱ� ����
				 */
				String line = null;  
				// ������ ���� �� ����(EOF : end of file) �ݺ��ϸ� line ������ �� �� �� �о����
				while((line = bufferedReader.readLine()) != null ) {; //readLine : ���� �д°�
					lineList.add(line+ "\n"); //���������о lineList�� �־��ֱ�
				}
				return lineList;
			}
		
			catch (IOException ioe) { // ������ �дٰ� ���� �߻��ϸ� ���� �޽����� ���
				System.out.println(ioe.getMessage());
				ioe.printStackTrace();
			}	
			// ������ ������ �о��ų� ���ܰ� �߻����� ��� : FileReader�� �ݾ��ش�. 
			// �ݴ� ������ �� ������ �ݴ�� �ϴ°� ������
			finally { // ������ ������ �о��ų� ���ܰ� �߻����� ��� BufferedReader, reader ������ �ݾ��ش�
				if(bufferedReader != null) {
					try {
						bufferedReader.close(); //������ ������ �ݴ� �뵵 
						// (�ȴݾ��ָ� �޸� ������ ����. �������� �޸𸮰� ��� ������ �����Ƿ�
					}
					catch(IOException ioe) {} //close�Ҷ� �������� �� �� �ִ� ����� ���⶧���� �̷��� ���ִ°� �ּ���
				}	
				if(reader != null) {
					try {
						reader.close();
					}
					catch(IOException ioe) {}
					}
				}
			}
		//�� �� ����Ʈ ��ȯ(nullPointerException ���� ����)
		return new ArrayList<>();
		}
	
	
	public static void main(String[] args) {
		
		File file = new File("C:\\Java exam", "Java Exam.txt");
		
		if (file.exists() && file.isFile()) {
		
			FileReader reader = null;
			BufferedReader bufferedReader = null;
			try {
				// ������ ����Ʈ ������ �о���� FileReader�� ���� (������ ����)
				reader = new FileReader(file, Charset.forName("UTF-8"));
				// ������ ���� ������ �о���� BufferedReader ����
				bufferedReader = new BufferedReader(reader);
				// ������ ���δ����� �о�� �Ҵ��ϱ� ���� String ���� ����(������ ����)				
				String line = null;
				// ������ ���� �� ����(EOF : end of file) �ݺ��ϸ� line ������ �� �� �� �о����
				while((line = bufferedReader.readLine()) != null ) {; //readLine : ���� �д°�

					System.out.println(line);
				}
			}
		
			catch (IOException ioe) { // ������ �дٰ� ���� �߻��ϸ� ���� �޽����� ���
				System.out.println(ioe.getMessage());
				ioe.printStackTrace();
			}	
			// ������ ������ �о��ų� ���ܰ� �߻����� ��� : FileReader�� �ݾ��ش�. 
			// �ݴ� ������ �� ������ �ݴ�� �ϴ°� ������
			finally { // ������ ������ �о��ų� ���ܰ� �߻����� ��� BufferedReader, reader ������ �ݾ��ش�
				if(bufferedReader != null) {
					try {
						bufferedReader.close(); //������ ������ �ݴ� �뵵 
						// (�ȴݾ��ָ� �޸� ������ ����. �������� �޸𸮰� ��� ������ �����Ƿ�
					}
					catch(IOException ioe) {} //close�Ҷ� �������� �� �� �ִ� ����� ���⶧���� �̷��� ���ִ°� �ּ���
				}	
				if(reader != null) {
					try {
						reader.close();
					}
					catch(IOException ioe) {}
					}
				}
			}
		}
	}

