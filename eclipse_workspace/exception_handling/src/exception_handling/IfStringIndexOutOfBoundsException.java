package exception_handling;

public class IfStringIndexOutOfBoundsException {

	public static void main(String[] args) {
			
		String logoFilePath = "C:\\images\\logo.png";
		// "\\" �� �̽��������ڵ尡 ���ԵȰ�. \ 1������
		// lastIndexOf : ������ ������ �ε���
		
		/*
		 * 1.logoFilePath �ν��Ͻ����� logo.png�� ������ ���
		 */
//		System.out.println(logoFilePath.length()); //18
		
		// substring + indexOf + lastIndexOf
		// 1. // �� ��������ġ ã�Ƽ�
		// 2. �״��� ���͵� ����ϴ� ���
		
		int lastIndexOfBackSlash = logoFilePath.lastIndexOf("\\") + 1;
//		System.out.println(lastIndexOfBackSlash); // 9
		String filename = logoFilePath.substring(lastIndexOfBackSlash);
		System.out.println(filename);
		
		/*
		 * 2.logoFilePath �ν��Ͻ����� "images"�� ������ ���
		 */
		int indexOfBackSlash = logoFilePath.indexOf("\\") + 1;
		int lastIndexOfBackSlash1= logoFilePath.lastIndexOf("\\");
		String word1 = logoFilePath.substring(indexOfBackSlash, lastIndexOfBackSlash);
		System.out.println(word1); 
		
		int indexOfImages = logoFilePath.indexOf("images");
		String directoryName = logoFilePath.substring(indexOfImages, lastIndexOfBackSlash -1);
		System.out.println(directoryName);
				
		/*
		 * 3.logoFilePath �ν��Ͻ����� user_images �� ������ ���(������, �����ϵ��� ����ó��)
		 */
		if(logoFilePath.contains("user_images")){
			int indexOfUserImages = logoFilePath.indexOf("user_images");
//		if (indexOfUserImages >= 0) { // �̰� -1�̶�� �̰��� ���°��̴�.
			directoryName = logoFilePath.substring(indexOfUserImages, lastIndexOfBackSlash -1); 
		// indexOfUserImages = -1 �� ����(���� �����Ƿ�) -> -1 �̶�� �ε����� ���������ʱ⶧���� ���ܹ߻�
			System.out.println(directoryName);
		}
	
		
		/*
		 * 4.logoFilePath �ν��Ͻ����� Ȯ����("png") �� ������ ���
		 *  ���� ������ �ε��� ���ϱ�
		 */
		int point = logoFilePath.lastIndexOf(".")+1;
		String word3 = logoFilePath.substring(point);
		System.out.println(word3); 

		
		/*
		 * 5.donwloadFilePath �ν��Ͻ����� ������ Ȯ���ڸ� ������ ���
		 */
		// ������� �ݵ�� Ȯ���ڰ� ������, ������ ����� Ȯ���ڰ� ���� ������ ������
		String downloadFilePath = "C:\\images\\logo";
		if(downloadFilePath.contains(".")) {
			int lastIndexOfDot = downloadFilePath.lastIndexOf(".") + 1; //Ȯ���ڴ� . �� ������ ã�� ����
			String extensionName = downloadFilePath.substring(lastIndexOfDot);
			System.out.println(extensionName);
		}
	}	
}

