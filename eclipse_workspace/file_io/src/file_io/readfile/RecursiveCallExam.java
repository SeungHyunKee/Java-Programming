package file_io.readfile;

import java.io.File;

/**
 * �޼ҵ� ���ȣ�� ����
 */
public class RecursiveCallExam {

	public static File findFile(String fileName, File from) {
		if(from == null) {
			from = new File("C:\\"); //C���� ã�ƶ�
		}
		
		if(from.exists()&&from.isDirectory()) {
			File[] itemDir = from.listFiles();
			
			//���� Ȯ�ο� �ڵ�
			System.out.println(from.getAbsolutePath());
			
			if (itemDir != null) {
				for(File item : itemDir) { 
						if(item.isDirectory()) { //��ȸ�ϰ��ִ°� �������, findFile �ض� 
							File result = findFile(fileName, item);
							if ( result != null) { //****
								return result;
							}
//							return findFile(fileName, item);     // item �ָ� �װɷ� ã�ƶ�
						}
						else if (item.getName().equals(fileName)){ //���� ã�����ϴ� �����̸��� ������
							System.out.println(item.getAbsolutePath());
							return item;//������ ��ȯ���Ѷ�
						}
				}
			}
		}
		// ���޹����� ������ �ƴϰ� �����̶��, 
		else if (from.getName().equals(fileName)) {
			System.out.println(from.getAbsolutePath());
			return from;
		}
		
		//�� �����ôµ� ���ٸ�, null ��ȯ
		return null;
	}
	
	
	/**
	 * dir�Ʒ��� �ִ� ��� �׸��(������������)�� ����Ѵ�.
	 * @param dir Ž���� ������ (����)���
	 */
	public static void printAllItems(File dir) {
		if(dir.exists()&&dir.isDirectory()) {
			File[] itemDir = dir.listFiles();
			
			//���� Ȯ�ο� �ڵ�
			System.out.println(dir.getAbsolutePath());
			
			if (itemDir != null) {
				for(File item : itemDir) {
						if(item.isDirectory()) {
							printAllItems(item);
						}
						else {
							System.out.println(item.getAbsolutePath());
						}
				}
			}
		}
		else if (dir.isFile()) {
			System.out.println(dir.getAbsolutePath());
		}
	}
	
	
	
	public static String join(String startStr, String joinStr) {
		if(startStr.length() >= 100) {
			return startStr; //join�� �ƴ� �׳� startStr�� ��ȯ���Ѷ�
			// length >100 �϶� ������ starStr�� = 128, 
			// -> main�ڵ��� String resultString = join("A", "");�� ���� A 128�� ��µ�
		}
		startStr += joinStr;
		System.out.println(startStr);
		
		//�����Ҷ� join�� ȣ���ϸ� �̰Ŷ��� '���ȣ��'�̴� 
		// (�ڱ�(join)�� �ڱ�(join)�� ȣ�������Ƿ�)
		return join(startStr, startStr); //�ڱⰡ �ڱ⸦ ȣ���ؼ� ��ȯ��Ų��
		
	}
	
	
	public static void infinityCall(int value) {
		if(value == 3) {
			return;
		}
		System.out.println("infinityCall ȣ���." + value);
		//���ȣ�� (�޼ҵ尡 �ڱ��ڽ��� �ٽ� ������)
		//infinityCall �ȿ��� infinityCall �� ȣ��
		infinityCall(++value);
	}	
	
	public static void main(String[] args) {
		
//		while ���� �ݺ�
//		while(true) {
//			infinityCall(); //������ �ݺ��Ǹ� ȣ��Ǵ� infinityCall
//		}
//		Exception in thread "main" java.lang.StackOverflowError

		//���ȣ��
		//infinityCall(0);
	
//		String resultString = join("A", "");
//		System.out.println(resultString);
		
		printAllItems( new File("C:\\Program Files (x86)"));
		
		
		File file = findFile("goods.csv", null); //findFile(String fileName, File from)
		System.out.println(file.getAbsolutePath());
		
	}
	
	
}
