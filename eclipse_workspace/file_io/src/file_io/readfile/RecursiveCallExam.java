package file_io.readfile;

import java.io.File;

/**
 * 메소드 재귀호출 예제
 */
public class RecursiveCallExam {

	public static File findFile(String fileName, File from) {
		if(from == null) {
			from = new File("C:\\"); //C부터 찾아라
		}
		
		if(from.exists()&&from.isDirectory()) {
			File[] itemDir = from.listFiles();
			
			//폴더 확인용 코드
			System.out.println(from.getAbsolutePath());
			
			if (itemDir != null) {
				for(File item : itemDir) { 
						if(item.isDirectory()) { //순회하고있는게 폴더라면, findFile 해라 
							File result = findFile(fileName, item);
							if ( result != null) { //****
								return result;
							}
//							return findFile(fileName, item);     // item 주면 그걸로 찾아라
						}
						else if (item.getName().equals(fileName)){ //내가 찾고자하는 파일이름과 같으면
							System.out.println(item.getAbsolutePath());
							return item;//같으면 반환시켜라
						}
				}
			}
		}
		// 전달받은게 폴더가 아니고 파일이라면, 
		else if (from.getName().equals(fileName)) {
			System.out.println(from.getAbsolutePath());
			return from;
		}
		
		//다 뒤져봤는데 없다면, null 반환
		return null;
	}
	
	
	/**
	 * dir아래에 있는 모든 항목들(하위폴더포함)을 출력한다.
	 * @param dir 탐색을 시작할 (폴더)경로
	 */
	public static void printAllItems(File dir) {
		if(dir.exists()&&dir.isDirectory()) {
			File[] itemDir = dir.listFiles();
			
			//폴더 확인용 코드
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
			return startStr; //join이 아닌 그냥 startStr을 반환시켜라
			// length >100 일때 마지막 starStr값 = 128, 
			// -> main코드의 String resultString = join("A", "");로 가서 A 128개 출력됨
		}
		startStr += joinStr;
		System.out.println(startStr);
		
		//리턴할때 join을 호출하면 이거또한 '재귀호출'이다 
		// (자기(join)가 자기(join)를 호출했으므로)
		return join(startStr, startStr); //자기가 자기를 호출해서 반환시킨다
		
	}
	
	
	public static void infinityCall(int value) {
		if(value == 3) {
			return;
		}
		System.out.println("infinityCall 호출됨." + value);
		//재귀호출 (메소드가 자기자신을 다시 실행함)
		//infinityCall 안에서 infinityCall 또 호출
		infinityCall(++value);
	}	
	
	public static void main(String[] args) {
		
//		while 무한 반복
//		while(true) {
//			infinityCall(); //무한히 반복되며 호출되는 infinityCall
//		}
//		Exception in thread "main" java.lang.StackOverflowError

		//재귀호출
		//infinityCall(0);
	
//		String resultString = join("A", "");
//		System.out.println(resultString);
		
		printAllItems( new File("C:\\Program Files (x86)"));
		
		
		File file = findFile("goods.csv", null); //findFile(String fileName, File from)
		System.out.println(file.getAbsolutePath());
		
	}
	
	
}
