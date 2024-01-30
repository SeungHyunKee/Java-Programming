package exception_handling;

import java.io.File;
import java.nio.file.Files;
import java.util.List;

import exception_handling.exceptions.ReadFailException;

import java.io.IOException;

public class TryCatchExamUserException {

	//���� ȣ���ϴ� �꿡�� ��������(try-catch)�ϱ� *�̷��� ���� �����ϴ� ����� �����Ұ� *
	public static List<String> readFile(File path) throws IOException { 
		return Files.readAllLines(path.toPath()); //File�� toPath�� ��ȯ���� ���� -> �̰� ������ ���� : IOException
	}
	
	
	
	// ����ڿ���ó�� 2��° ����
	// try-catch �ȿ��� ������ �߻��� ���� �����ִ°�
	public static List<String> readFile2(File path){
		try {
			return Files.readAllLines(path.toPath());
		}
		catch (IOException ioe) {
			throw new ReadFailException("������ ���� �� �����ϴ�.", ioe); //exception_handling.exceptions.ReadFailException: ������ ���� �� �����ϴ�.
		}
	}
	
		
	
	//��Ÿ�Ӱ��� ����
	public static int convertToInt(String str) throws Exception {
		
		try {
			int number = Integer.parseInt(str);
			return number;
		}
		catch(NumberFormatException nfe) {
//			Exception exception = new Exception( str + "�� ���ڷ� ��ȯ�� �� �����ϴ�." );
			
			// Exception��� RuntimeException���� �ۼ��ϸ�, Exception�� �ٸ��� ������ ������ ���� : ���ܸ� ��ȯ���� ������ ����
			Exception exception = new Exception( 
										str + "�� ���ڷ� ��ȯ�� �� �����ϴ�.", nfe); 
										//,nfe : NumberformatException�� RuntimeException���� ���μ� ���ܸ� ������
			
			//throw : ���ܸ� �߻���Ŵ (���ܰ� ������, jvm������. ��, ȣ���� �����ڵ�� ����)
			throw exception; // ��� ���ܸ� ������ �޼ҵ带 �����Ų��. throw �Ʒ� �ٸ� �ڵ带 �ۼ��ص� ����ȵ�(dead code)
		}		
		// throw�� �ϴ�����, return�� �ϴ����� finally���� ������ �ݵ�� ���� �� (������, thorw �ϱ����� �����߰� finally�ϰ� throw ��)
		finally {
			System.out.println("��ȯ�� �Ϸ�Ǿ����ϴ�.");
		}
	}
	
	
	public static void main(String[] args) {
		
		// �ý��� ����̺꿡�� Ư����ο� �ִ� ���� �Ǵ� ������ �о�´�.
		File imageFile = new File("c:\\sdfsdfsdf"); //������ �����ִ��� �ñ��Ҷ� ��ȣ�����ʰ� ������ �̸������� ctrl space
		
		//����2
//		readFile(imageFile) 
		readFile2(imageFile);
		
		
		
		try {
			int num = convertToInt("AAA"); //exceptionŸ���� ���ܸ� �����Ƿ� �ݵ�� try~catch�� �ۼ�����ߵ�(�Ⱦ��� ��������ü�� �ȵ�)
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage()); //"AAA�� ���ڷ� ��ȯ�� �� �����ϴ�."
		}
		
		try {
			Files.readAllLines(imageFile.toPath()); // ���Ͽ� �ִ� ������� �� �о�ͼ� ���ڿ�Ÿ������ �ٲ��
		}
		catch(IOException ioe) {
			String message = ioe.getMessage(); // catch �� �ۼ��� IOException�� ���� ����(java.nio.file.NoSuchFileException)�� �ٸ� �� �ִ�
			System.out.println(message); // java.nio.file.NoSuchFileException -> IOException�� ��ӹ޴� Ŭ���� FileSystemException
			
			//���� ���� ���� ���(ȣ�� ����)
			ioe.printStackTrace();
		}
		// ������ �߻��ϰ�, �߻������ʰ� finally����� �����
		finally { 
			System.out.println("File�� �а� finally�� ����Ǿ����ϴ�.");
		}
				
		
//		Class.forName //-> ������ �������� ã�¹�� : ctrl + space

		try { //try�� �ݵ�� catch�� �����. ȥ�������� ����!
			Class.forName("exception_handling.IfArrayIndexOutOfBoundsException"); 
			Files.readAllLines(imageFile.toPath()); 
		}
//		catch(ClassNotFoundException cnfe){ //cnfe : �빮�ڸ� ��� �����ֱ�
//			String message = cnfe.getMessage();
//			System.out.println(message);
//			
//			//���� ���� ���� ���(ȣ�� ����)
//			cnfe.printStackTrace();
//		}
//		catch(IOException ioe) {
//			String message = ioe.getMessage(); 
//			System.out.println(message);
//			
//			//���� ���� ���� ���(ȣ�� ����)
//			ioe.printStackTrace();
//		}
		
		//catch�� 1���� ���� ��� (����ô��� ������ ���� ������� ó���� �� ��� �Ʒ��� ���� ��)
		catch(ClassNotFoundException | IOException cnfe){ // ���� �������� ����ó���ϴ� �̷���Ȳ������ cnfe�� �ƴ�, 'ex' ��� ��
			String message = cnfe.getMessage();
			System.out.println(message);
			
			//���� ���� ���� ���(ȣ�� ����)
			cnfe.printStackTrace();
		}
	}
}
