package enum_exam;

public enum CalcType {
	
	//상수들(Enum) 만들어주기 : 전부 대문자로 작성
//	ADD, SUB, MUL, DIV;
	// ADD, SUB, MUL, DIV; 자체가 상수인 인스턴스임

	// 값을 가지는 인스턴스도 만들 수 있다
	ADD("+"), SUB("-"), MUL("*"), DIV("/");  

	private String symbol; 
	
	
	//public은 아래와 같은 생성자에 붙일 수 없음 
	// 이렇게 하면 Enum도 멤버변수를 가질 수 있지만, 잘 안씀
	CalcType(String str) {
		this.symbol = str;
	}
	
	public String getSymbol() {
		return this.symbol;
	}
	
	//자바에서 대문자로 시작한다는 의미 == reference type라는 의미
	//> 즉, == 로 연산불가능
    
	//enum은 단 1개의 인스턴스만 만들 수 있다
	//enum의 인스턴스가 만들어지는 시간 = 인스턴스를 '정의'할때
	
	
}
