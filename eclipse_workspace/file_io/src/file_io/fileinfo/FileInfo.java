package file_io.fileinfo;

import java.io.File;
import java.util.Date;

public class FileInfo {

	public static void main(String[] args) {

		File file = new File("C:\\Java Exam", "Java Exam.txt");
//		File file = new File("C:\\Java Exam");
//		File file = new File("C:\\"); // ->.listFiles() : nullpointer�߻� (�ڹٰ� C����̺꿡 �����Ҽ����� ���Ƴ���) 

		//������ �����ϸ� true, �ƴϸ� false
		boolean isFileExists = file.exists();
		System.out.println("isFileExists >" + isFileExists); 
		
		//�о�� File �ν��Ͻ��� �����̶�� true, ������� false
		boolean isFile = file.isFile();
		System.out.println("isFile >" + isFile); 

		//�о�� File �ν��Ͻ��� ����(���丮)��� true, �����̶�� false
		boolean isDirectory = file.isDirectory();
		System.out.println("isDirectory >" + isDirectory);

		//File�ν��Ͻ��� ����Ű���ִ� ���� �Ǵ� ������ '��ü���'
		String fileAbsolutePath = file.getAbsolutePath();
		System.out.println("fileAbsolutePath >" + fileAbsolutePath);

		//File �ν��Ͻ��� ����Ű�� �ִ� ���� ������� �����̸�, 
		// �����̶�� Ȯ���� ������ Ÿ���� �̸�
		String fileName = file.getName();
		System.out.println("fileName >" + fileName);

		// file �ν��Ͻ��� ����Ű�� �ִ� ������ ũ��(byte�� ������)
		// 1byte = 1, 
		// 1kb = 1024(windows���� 1024, windows �ƴҰ�� 1000) 
		// 1 mb = 1024*1024, 
		// 1gb = 1024*1024*1024
		// 1tb = 1024*1024*1024*1024
		// 1pb = 1024*1024*10241024*1024
		long length = file.length();
		System.out.println("length >" + length);

		//������ ���������� ������ ��¥�� �ð�
		// ��ǻ���� �ð����� : 1970�� 1�� 1�� 00:00:00 �̶����� �귯�� �� �� ������
		// (KST �ڸ���Ÿ��)-> 1970�� 1�� 1�� 09:00:00  
		// �� �� * 1000�ؼ� ������ -> ���ڰ� ����
		long lastModifiedTime = file.lastModified(); //long�� ��¥�� �ð� ��ȯ��Ŵ
		System.out.println("lastModifiedTime >" + lastModifiedTime);
		// long Ÿ���� ��¥�� �ð��� -> ���ڷ� �� ��¥�� �ð����� ��ȯ
		Date date = new Date(lastModifiedTime);
		System.out.println("lastModifiedTime(Date) >" + date);
		
		/*getParent 2����
		getParent() : �θ������� ��ΰ� '���ڿ�'�� ����
		getParentFile(); -> �θ������� �ٸ� ���ϵ��� '�����ν��Ͻ�'�� ����
		*/
		//���������� �����ϴ� '�θ�(����)������ ���'�� '���ڿ�' �� ����
		String parentPath = file.getParent();	
		System.out.println("parentPath >" + parentPath);

		//���������� �����ϴ� �θ�(����)������ ���ο� File �ν��Ͻ�
		File parentFile = file.getParentFile();
		System.out.println("parentFile >" + parentFile);
		System.out.println("parentFileAbsolutePath >" + parentFile.getAbsolutePath());

		
		// File �ν��Ͻ��� �����϶�, �������ο� �����ϴ� ��� ������ ���ϸ�� ��ȯ
		File[] listFileArray = file.listFiles(); //listFiles() : �迭�� ��ȯ����
		// ������ �ƴ� ���Ͼȿ� �ٸ� ������ ������ ������, 
		// listFileArray�� null���� -> NullPointerException �߻�
		for(File item : listFileArray) {
			System.out.println("listFileArray >" + item.getAbsolutePath());
		}		
	}
}
