package hello_java_world;

public class ArithmaticOperator {

	public static void main(String[] args) {

		// ��������� - �����ο��� �����ϱ�
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
		
		// ���� �ڵ带 �����ϰ�(�����ο��� �����ϱ⸦ ���׿����ڷ� �ϱ�) -> ���׿�����
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
		
		//�����ο��� 1�� ���ϰ� ���� �ڵ�

		System.out.println(num1++); //10 ��ó��
		System.out.println(num1); //11 
		System.out.println(num1--); //11 ��ó��
		System.out.println(num1); //10 
		System.out.println(--num1); //9 ��ó��
		

		
		System.out.println(num2++); //20
		System.out.println(num2); //21
		num1--;
		num2--;
		System.out.println(num1); //10 �� ���Ŀ� ��������Ƿ�
		System.out.println(num2); // 20
		System.out.println(num1--); //10
		System.out.println(num2--); //20


	


	}

}
