package Hello.java;

/**
 * 동물을 표현
 */
public class Animal {

	// 멤버변수
	// 동물의 이름
	String name;
	
	// 동물이 인사하는것 : 메소드(인스턴스메소드)에는 static 붙이지 않는다
	public void hello() {
		System.out.println(name + " 입니다. 반가워요.");
	}

}


