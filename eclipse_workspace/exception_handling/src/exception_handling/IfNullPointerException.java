package exception_handling;

public class IfNullPointerException {

	public static void main(String[] args) {
		
	// 1. NullPointerException이 발생하는 원인
	String name = null;
	//NullPointerException - null.equals("이름")
	System.out.println(name.equals("이름"));
	//Exception in thread "main" java.lang.NullPointerException: 
	//Cannot invoke "String.equals(Object)" because "name" is null
	//at exception_handling.IfNullPointerException.main(IfNullPointerException.java:8)

	// 2. NullPointerException 방지방법
	if(name != null) { //인스턴스 참조하기 전 null인지 확인
		System.out.println(name.equals("이름")); //name ==null이므로 이코드 실행x
	}
	
	}
}
