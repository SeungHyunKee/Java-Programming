package exception_handling;

import java.io.File;
import java.nio.file.Files;
import java.util.List;

import exception_handling.exceptions.ReadFailException;

import java.io.IOException;

public class TryCatchExamUserException {

	//나를 호출하는 얘에게 예외위임(try-catch)하기 *이렇게 예외 위임하는 방법은 지양할것 *
	public static List<String> readFile(File path) throws IOException { 
		return Files.readAllLines(path.toPath()); //File을 toPath로 변환시켜 진행 -> 이게 던지는 예외 : IOException
	}
	
	
	
	// 사용자예외처리 2번째 이점
	// try-catch 안에도 에러가 발생한 원인 적어주는것
	public static List<String> readFile2(File path){
		try {
			return Files.readAllLines(path.toPath());
		}
		catch (IOException ioe) {
			throw new ReadFailException("파일을 읽을 수 없습니다.", ioe); //exception_handling.exceptions.ReadFailException: 파일을 읽을 수 없습니다.
		}
	}
	
		
	
	//런타임관련 예제
	public static int convertToInt(String str) throws Exception {
		
		try {
			int number = Integer.parseInt(str);
			return number;
		}
		catch(NumberFormatException nfe) {
//			Exception exception = new Exception( str + "는 숫자로 변환할 수 없습니다." );
			
			// Exception대신 RuntimeException으로 작성하면, Exception와 다르게 에러가 나오지 않음 : 예외를 변환시켜 던졌기 때문
			Exception exception = new Exception( 
										str + "는 숫자로 변환할 수 없습니다.", nfe); 
										//,nfe : NumberformatException을 RuntimeException으로 감싸서 예외를 던진것
			
			//throw : 예외를 발생시킴 (예외가 던져짐, jvm쪽으로. 즉, 호출한 메인코드로 던짐)
			throw exception; // 즉시 예외를 던지고 메소드를 종료시킨다. throw 아래 다른 코드를 작성해도 실행안됨(dead code)
		}		
		// throw를 하던말던, return을 하던말던 finally문은 언제나 반드시 실행 됨 (실제론, thorw 하기전에 잠깐멈추고 finally하고 throw 함)
		finally {
			System.out.println("변환이 완료되었습니다.");
		}
	}
	
	
	public static void main(String[] args) {
		
		// 시스템 드라이브에서 특정경로에 있는 파일 또는 폴더를 읽어온다.
		File imageFile = new File("c:\\sdfsdfsdf"); //생성자 뭐가있는지 궁금할땐 괄호쓰지않고 생성자 이름만쓰고 ctrl space
		
		//이점2
//		readFile(imageFile) 
		readFile2(imageFile);
		
		
		
		try {
			int num = convertToInt("AAA"); //exception타입의 예외를 받으므로 반드시 try~catch문 작성해줘야됨(안쓰면 컴파일자체가 안됨)
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage()); //"AAA는 숫자로 변환할 수 없습니다."
		}
		
		try {
			Files.readAllLines(imageFile.toPath()); // 파일에 있는 내용들을 다 읽어와서 문자열타입으로 바꿔라
		}
		catch(IOException ioe) {
			String message = ioe.getMessage(); // catch 에 작성한 IOException와 실제 예외(java.nio.file.NoSuchFileException)는 다를 수 있다
			System.out.println(message); // java.nio.file.NoSuchFileException -> IOException을 상속받는 클래스 FileSystemException
			
			//아주 상세한 예외 목록(호출 스택)
			ioe.printStackTrace();
		}
		// 에러가 발생하건, 발생하지않건 finally블록은 실행됨
		finally { 
			System.out.println("File을 읽고 finally가 실행되었습니다.");
		}
				
		
//		Class.forName //-> 빠르게 에러종류 찾는방법 : ctrl + space

		try { //try는 반드시 catch가 따라옴. 혼자있을수 없음!
			Class.forName("exception_handling.IfArrayIndexOutOfBoundsException"); 
			Files.readAllLines(imageFile.toPath()); 
		}
//		catch(ClassNotFoundException cnfe){ //cnfe : 대문자만 골라서 적어주기
//			String message = cnfe.getMessage();
//			System.out.println(message);
//			
//			//아주 상세한 예외 목록(호출 스택)
//			cnfe.printStackTrace();
//		}
//		catch(IOException ioe) {
//			String message = ioe.getMessage(); 
//			System.out.println(message);
//			
//			//아주 상세한 예외 목록(호출 스택)
//			ioe.printStackTrace();
//		}
		
		//catch를 1개만 쓰는 방법 (쓰고봤더니 에러를 같은 방식으로 처리를 할 경우 아래와 같이 씀)
		catch(ClassNotFoundException | IOException cnfe){ // 보통 여러개의 예외처리하는 이런상황에서는 cnfe이 아닌, 'ex' 라고 씀
			String message = cnfe.getMessage();
			System.out.println(message);
			
			//아주 상세한 예외 목록(호출 스택)
			cnfe.printStackTrace();
		}
	}
}
