package exception_handling;

public class IfStringIndexOutOfBoundsException {

	public static void main(String[] args) {
			
		String logoFilePath = "C:\\images\\logo.png";
		// "\\" 는 이스케이프코드가 포함된것. \ 1글자임
		// lastIndexOf : 문자의 마지막 인덱스
		
		/*
		 * 1.logoFilePath 인스턴스에서 logo.png만 추출해 출력
		 */
//		System.out.println(logoFilePath.length()); //18
		
		// substring + indexOf + lastIndexOf
		// 1. // 의 마지막위치 찾아서
		// 2. 그다음 모든것들 출력하는 방법
		
		int lastIndexOfBackSlash = logoFilePath.lastIndexOf("\\") + 1;
//		System.out.println(lastIndexOfBackSlash); // 9
		String filename = logoFilePath.substring(lastIndexOfBackSlash);
		System.out.println(filename);
		
		/*
		 * 2.logoFilePath 인스턴스에서 "images"만 추출해 출력
		 */
		int indexOfBackSlash = logoFilePath.indexOf("\\") + 1;
		int lastIndexOfBackSlash1= logoFilePath.lastIndexOf("\\");
		String word1 = logoFilePath.substring(indexOfBackSlash, lastIndexOfBackSlash);
		System.out.println(word1); 
		
		int indexOfImages = logoFilePath.indexOf("images");
		String directoryName = logoFilePath.substring(indexOfImages, lastIndexOfBackSlash -1);
		System.out.println(directoryName);
				
		/*
		 * 3.logoFilePath 인스턴스에서 user_images 만 추출해 출력(없지만, 동작하도록 예외처리)
		 */
		if(logoFilePath.contains("user_images")){
			int indexOfUserImages = logoFilePath.indexOf("user_images");
//		if (indexOfUserImages >= 0) { // 이게 -1이라면 이값은 없는값이다.
			directoryName = logoFilePath.substring(indexOfUserImages, lastIndexOfBackSlash -1); 
		// indexOfUserImages = -1 이 나옴(값이 없으므로) -> -1 이라는 인덱스는 존재하지않기때문에 예외발생
			System.out.println(directoryName);
		}
	
		
		/*
		 * 4.logoFilePath 인스턴스에서 확장자("png") 만 추출해 출력
		 *  점의 마지막 인덱스 구하기
		 */
		int point = logoFilePath.lastIndexOf(".")+1;
		String word3 = logoFilePath.substring(point);
		System.out.println(word3); 

		
		/*
		 * 5.donwloadFilePath 인스턴스에서 파일의 확장자를 추출해 출력
		 */
		// 윈도우는 반드시 확장자가 있지만, 리눅스 등등은 확장자가 없는 파일이 존재함
		String downloadFilePath = "C:\\images\\logo";
		if(downloadFilePath.contains(".")) {
			int lastIndexOfDot = downloadFilePath.lastIndexOf(".") + 1; //확장자는 . 의 유무로 찾기 때문
			String extensionName = downloadFilePath.substring(lastIndexOfDot);
			System.out.println(extensionName);
		}
	}	
}

