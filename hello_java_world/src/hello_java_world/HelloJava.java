package hello_java_world;

public class HelloJava {
	/**
	 * Document(주석)
	 * 주석 : 코드의 설명을 위한 영역, 코드 실행과는 관계가 없음
	 * 
	 * Java파일을 실행시키기 위한 코드
	 * 	public static void main(String[] args) {
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Hello, Java World!");
		
		/* Multiline 주석
		 */
		
		// Singleline 주석
		
		//int형 number 변수를 정의.
		int number; 
		//number변수에 값을 할당
		number = 10; //number은 int형이기 때문에 소수점(3.14)은 들어갈 수 없다 
		// int number = 20; // 이미 값을 할당했기때문에 쓸수 없음
		
		
		byte byteNumber = 1; //-128 ~ +127
		byteNumber = 2;
		System.out.println(byteNumber);
		
		short shortNumber = 10; // -32,678 ~ +32,767
		shortNumber = 11;
		System.out.println(shortNumber);
		
		int intNumber = 20; // 3_000_000_000 즉 30억을 int에 쓰면 에러
		intNumber = 21;
		System.out.println(intNumber);
		
		// L : f리터럴(대문자, 소문자 둘다 가능) 붙이는 이유 : 자바 정수 기본타입은 int
		// int범위는 -21억~+21억. <- 이범위를 long에 넣을때는 L 붙여줘야됨. 
		// 이 범위를 벗어난 -30억~+30억은 L안붙여줘도 됨
		long longNumber = 30L; 
		longNumber = 31L;
		System.out.println(longNumber);
		
		// 부동소수점형 변수의 선언과 할당
		float floatNumber = 10.55f;
		System.out.println(floatNumber);
		
		double doubleNumber = 11.556;
		System.out.println(doubleNumber);
		
		
		char letter = 'A';
		System.out.println(letter);
		System.out.println(letter + 1);

		
		letter = 'B';
		System.out.println(letter);
		
		letter = '1'; //글자
		System.out.println(letter);
		
		
		boolean areYouStudent = true;
		System.out.println(areYouStudent);
		
		boolean areYouDesigner = false;
		System.out.println(areYouDesigner);
		
		
		// 상수의 정의와 할당
		final int SPEED_OF_LIGHT = 299_972_458;
		System.out.println(SPEED_OF_LIGHT);
//		SPEED_OF_LIGHT = 10;// 에러
		System.out.println(Math.PI);
		System.out.println(Math.E);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

		
		
		//형변환
		int normalNumber = Integer.MAX_VALUE;
		long bigNumber = normalNumber;
		System.out.println(normalNumber);
		System.out.println(bigNumber);

		// 크기가 큰 long형의 값을 작은 int형으로 자연스러운 형변환은 불가능
//		long bigNumber = Long.MAX_VALUE;
//		int normalNumber = bigNumber; //에러
//		System.out.println(bigNumber);
//		System.out.println(normalNumber);

		// 명시적 형변환
		long bigNumber1 = Integer.MAX_VALUE + 2L; // -2147483647
		int normalNumber1 = (int) bigNumber1;
		System.out.println(bigNumber1); // 2147483648
		System.out.println(normalNumber1); // -2147483648

		
		// 정수 -> 부동소수점 형변환 : 묵시적 형변환
		int num = 10;
		float fnum = num;
		double dnum = num;
		
		System.out.println(num);
		System.out.println(fnum);
		System.out.println(dnum);
		
		// 부동소수점 -> 정수 : 명시적 형변환 (소수점이하 탈락함)
		float fnum1 = 10.9f;
		int num1 = (int) fnum1;
		System.out.println(fnum1); //10.9
		System.out.println(num1); //10
		////////???//////////
		double dnum1 = 11.15;
		num1 = (int) dnum1;
		System.out.println(dnum1); // 11.15
		System.out.println(num1); // 11
		
		
		// 부동소수점 소수점 처리
		double dnum2 = 29.37;
		double dnum3 = dnum2 * 10; // double로 형변환 됨
		System.out.println(dnum3); //293.7

		dnum3 = Math.round(dnum3);
		System.out.println(dnum3); //294.0
		
		double dnum4 = dnum3 / 10; // double로 형변환 됨
		System.out.println(dnum4); // 29.4

		
		// 문자열 -> 숫자로 바꿀수 있을까?
		// 문자열을 숫자로 바꾸는것은 형변환과는 관련이 없음
		
		//10이라는 문자를 10이라는 숫자로 변경
		String numberString = "10";
		byte byteNumber1 = Byte.parseByte(numberString);
		System.out.println(byteNumber1);
		
		//char은 정수형이 아닌 문자열이므로, 변환하려고 하면 에러가 발생
		// 부동소수점도 마찬가지
		
		
		//연산자
		int number1 = 10;
		
		int addedNumber = number1 + 2;
		System.out.println(addedNumber);; // 12
		
		int subtractedNumber = number1 - 3;
		System.out.println(subtractedNumber); // 7
		
		int multipliedNumber = number * 3;
		System.out.println(multipliedNumber); // 30
		
		int devidedNumber = number1 / 3;
		System.out.println(devidedNumber); // 3
		
		double devidedNumber1 = number1 / 3.0; //(int / double = double)이 값이 double이 나오기때문에 devidedNumber1을 double형으로 바꿔줘야됨
		System.out.println(devidedNumber1); // 3.3
		
		int devidedRemainNumber = number % 3;
		System.out.println(devidedRemainNumber);  //1
	
		
	}
}
