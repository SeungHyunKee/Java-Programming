package Hello.java;

public class Hello {

//	sayHello라는 메소드 만들기
//	public static void 메소드이름(보통 동사로 시작, 이름은 반드시 소문자로 시작)
	/**
	 * "안녕하세요?" 를 출력하는 메소드 (정의하는 부분)
	 */
	public static void sayHello() {
		System.out.println("안녕하세요?");
		
	}
	
	
	/**
	 * 이름을 파라미터로 전달하면, "이름씨, 안녕하세요"를 출력한다.
	 * @param name 출력하고싶은 이름
	 */
	public static void printHello(String name) {
			System.out.println(name + "씨, 안녕하세요?");
	}
	public static void main (String[] args) {
		printHello("스타크"); //String name 에 "스타크" 할당
		printHello("헐크"); //String name 에 "헐크" 할당
		printHello("그루트"); //String name 에 "그루트" 할당
//		print + Ctrl + space -> 코드 도움말 알려줌
		printHello("김ㅇㅇ");
	}
	
	
	
	/**
	 * 클래스 파일을 실행시키는 메소드
	 * @param args (파라미터)
	 */
//	public static void main(String[] args) {
//		// Ctrl + Alt + 방향키 위/아래 -> 위/아래로 라인이 복사가 됨
//		sayHello(); // 메소드 호출하는 문법 (메소드 호출하기위해서는 메소드 이름으로 호출!!)
//		System.out.println("반갑습니다.");
//		sayHello();
//		sayHello();
//		sayHello();
//		sayHello();
//		sayHello();
//	}
}
