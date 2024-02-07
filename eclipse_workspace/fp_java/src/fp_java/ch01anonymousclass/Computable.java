package fp_java.ch01anonymousclass;

public interface Computable {
	
	public int add(int num1, int num2);
	
	// public void printMessage(); //이렇게되면 추상메소드 2개가 되기때문에 Computable 클래스를 람다로 표현할 수 없게됨
	// 추상메소드가 반드시 '1개' 만 존재해야 람다로 쓸 수 있으므로 만약 추상메소드가 2개가 된다면 람다로 쓸 수 없음
	
	/**
	 * 인터페이스의 printMessage 기본코드를 작성한 것
	 * default 키워드를 가장 앞에 붙이면 (;로 끝나면 안되고, 중괄호{}반드시 넣어줘야됨(중괄호 안 내용은 안써도 됨))
	 * 인터페이스도 기능을 구현할 수 있다
	 * implementable class에서 overriding 가능하다
	 * overriding을 해주지 않으면 기본코드가 동작됨
	 */
	default public void printMessage() {
		System.out.println("기본 메시지입니다.");
	}
}
