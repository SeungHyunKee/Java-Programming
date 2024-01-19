package hello_java_world;

public class ArithmaticOperator {

	public static void main(String[] args) {

		// 산술연산자 - 스스로에게 연산하기
		/*
		int number1 = 10;
		number1 = number1 + 2;
		System.out.println(number1); //12
		
		int number2 = 10;
		number2 = number2 -2;
		System.out.println(number2); // 8
		
		int number3 = 10;
		number3 = number3 * 2;
		System.out.println(number3); // 20
		
		int number4 = 10;
		number4 = number4 / 4;
		System.out.println(number4); //2
		
		int number5 = 10;
		number5 = number5 % 4;
		System.out.println(number5); //2
		*/
		
		// 위의 코드를 간결하게(스스로에게 연산하기를 단항연산자로 하기) -> 단항연산자
		int number1 = 10;
		number1 += 2;
		System.out.println(number1); //12
		
		int number2 = 10;
		number2 -= 2;
		System.out.println(number2); // 8
		
		int number3 = 10;
		number3 *= 2;
		System.out.println(number3); // 20
		
		int number4 = 10;
		number4 /= 4;
		System.out.println(number4); //2
		
		int number5 = 10;
		number5 %= 4;
		System.out.println(number5); //2
		
		
		
		
		int num1 = 10;
		int num2 = 20;
		
		//스스로에게 1을 더하고 빼는 코드

		System.out.println(num1++); //10 후처리
		System.out.println(num1); //11 
		System.out.println(num1--); //11 후처리
		System.out.println(num1); //10 
		System.out.println(--num1); //9 전처리
		

		
		System.out.println(num2++); //20
		System.out.println(num2); //21
		num1--;
		num2--;
		System.out.println(num1); //10 뺀 이후에 출력했으므로
		System.out.println(num2); // 20
		System.out.println(num1--); //10
		System.out.println(num2--); //20


	


	}

}
