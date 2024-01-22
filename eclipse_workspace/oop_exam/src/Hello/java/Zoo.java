package Hello.java;

public class Zoo {

	public static void main(String[] args) {
		
		//Animal 타입의 변수(인스턴스)를 만들어 활용
		
		//  변수를 만드는 문법  :    자료형 변수이름   =   값;
		// 인스턴스 만드는 문법 : 자료형 인스턴스의 이름 = new 자료형();
		
		Animal 팬더 = new Animal();  // Animal을 동일하게 new 뒤에도 써줌
		팬더.name = "푸바오"; // Animal 타입의 인스턴스가 만들어짐
		팬더.hello();
		
		Animal 랫서팬더 = new Animal();
		랫서팬더.name = "푸바오 친구";
		랫서팬더.hello();
	}
}
