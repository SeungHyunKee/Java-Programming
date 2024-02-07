package fp_java.ch01anonymousclass;

public class Main {

	//nested class -> private, public, default, protected 모두 가능함
	public static class SubMain{
		
	}
			
	public static void main(String[] args) {
		
		Main main = new Main();
		System.out.println(main); //fp_java.ch01anonymousclass.Main@49097b5d

		
		SubMain subMain = new SubMain();
		System.out.println(subMain); //fp_java.ch01anonymousclass.Main$SubMain@37a71e93 
									//($ 붙음 -> Main 이라는 클래스의 SubMain의 인스턴스이다)

		
		// 익명클래스를 인터페이스로 바로 만들기
		Computable computer = new Computable() {  // (인터페이스는(추상메소드) 바로 인스턴스로 만들 수 없다)
			@Override
			public int add(int num1, int num2) {
				return num1 + num2;
			}
		};
		System.out.println(computer); //fp_java.ch01anonymousclass.Main$1@7106e68e (익명클래스로 만든 객체 : $ 붙음)

		Computable computer2 = new Computable() {  
			@Override
			public int add(int num1, int num2) {
				return num1 + num2;
			}
		};
		System.out.println(computer2); // fp_java.ch01anonymousclass.Main$2@6576fe71 -> $2 : 2번째로 만든 익명클래스

		
		Computable computer3 = new Computable() {  
			@Override
			public int add(int num1, int num2) {
				return num1 + num2;
			}
		};
		System.out.println(computer3); //fp_java.ch01anonymousclass.Main$3@300ffa5d -> $3 : 3번째로 만든 익명클래스
		
//		클래스안의 클래스로 만든 인터페이스라는 의미 = $ 

	}
}
