package hello_java_world;

public class HelloJava {
	/**
	 * Document(�ּ�)
	 * �ּ� : �ڵ��� ������ ���� ����, �ڵ� ������� ���谡 ����
	 * 
	 * Java������ �����Ű�� ���� �ڵ�
	 * 	public static void main(String[] args) {
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Hello, Java World!");
		
		/* Multiline �ּ�
		 */
		
		// Singleline �ּ�
		
		//int�� number ������ ����.
		int number; 
		//number������ ���� �Ҵ�
		number = 10; //number�� int���̱� ������ �Ҽ���(3.14)�� �� �� ���� 
		// int number = 20; // �̹� ���� �Ҵ��߱⶧���� ���� ����
		
		
		byte byteNumber = 1; //-128 ~ +127
		byteNumber = 2;
		System.out.println(byteNumber);
		
		short shortNumber = 10; // -32,678 ~ +32,767
		shortNumber = 11;
		System.out.println(shortNumber);
		
		int intNumber = 20; // 3_000_000_000 �� 30���� int�� ���� ����
		intNumber = 21;
		System.out.println(intNumber);
		
		// L : f���ͷ�(�빮��, �ҹ��� �Ѵ� ����) ���̴� ���� : �ڹ� ���� �⺻Ÿ���� int
		// int������ -21��~+21��. <- �̹����� long�� �������� L �ٿ���ߵ�. 
		// �� ������ ��� -30��~+30���� L�Ⱥٿ��൵ ��
		long longNumber = 30L; 
		longNumber = 31L;
		System.out.println(longNumber);
		
		// �ε��Ҽ����� ������ ����� �Ҵ�
		float floatNumber = 10.55f;
		System.out.println(floatNumber);
		
		double doubleNumber = 11.556;
		System.out.println(doubleNumber);
		
		
		char letter = 'A';
		System.out.println(letter);
		System.out.println(letter + 1);

		
		letter = 'B';
		System.out.println(letter);
		
		letter = '1'; //����
		System.out.println(letter);
		
		
		boolean areYouStudent = true;
		System.out.println(areYouStudent);
		
		boolean areYouDesigner = false;
		System.out.println(areYouDesigner);
		
		
		// ����� ���ǿ� �Ҵ�
		final int SPEED_OF_LIGHT = 299_972_458;
		System.out.println(SPEED_OF_LIGHT);
//		SPEED_OF_LIGHT = 10;// ����
		System.out.println(Math.PI);
		System.out.println(Math.E);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

		
		
		//����ȯ
		int normalNumber = Integer.MAX_VALUE;
		long bigNumber = normalNumber;
		System.out.println(normalNumber);
		System.out.println(bigNumber);

		// ũ�Ⱑ ū long���� ���� ���� int������ �ڿ������� ����ȯ�� �Ұ���
//		long bigNumber = Long.MAX_VALUE;
//		int normalNumber = bigNumber; //����
//		System.out.println(bigNumber);
//		System.out.println(normalNumber);

		// ����� ����ȯ
		long bigNumber1 = Integer.MAX_VALUE + 2L; // -2147483647
		int normalNumber1 = (int) bigNumber1;
		System.out.println(bigNumber1); // 2147483648
		System.out.println(normalNumber1); // -2147483648

		
		// ���� -> �ε��Ҽ��� ����ȯ : ������ ����ȯ
		int num = 10;
		float fnum = num;
		double dnum = num;
		
		System.out.println(num);
		System.out.println(fnum);
		System.out.println(dnum);
		
		// �ε��Ҽ��� -> ���� : ����� ����ȯ (�Ҽ������� Ż����)
		float fnum1 = 10.9f;
		int num1 = (int) fnum1;
		System.out.println(fnum1); //10.9
		System.out.println(num1); //10
		////////???//////////
		double dnum1 = 11.15;
		num1 = (int) dnum1;
		System.out.println(dnum1); // 11.15
		System.out.println(num1); // 11
		
		
		// �ε��Ҽ��� �Ҽ��� ó��
		double dnum2 = 29.37;
		double dnum3 = dnum2 * 10; // double�� ����ȯ ��
		System.out.println(dnum3); //293.7

		dnum3 = Math.round(dnum3);
		System.out.println(dnum3); //294.0
		
		double dnum4 = dnum3 / 10; // double�� ����ȯ ��
		System.out.println(dnum4); // 29.4

		
		// ���ڿ� -> ���ڷ� �ٲܼ� ������?
		// ���ڿ��� ���ڷ� �ٲٴ°��� ����ȯ���� ������ ����
		
		//10�̶�� ���ڸ� 10�̶�� ���ڷ� ����
		String numberString = "10";
		byte byteNumber1 = Byte.parseByte(numberString);
		System.out.println(byteNumber1);
		
		//char�� �������� �ƴ� ���ڿ��̹Ƿ�, ��ȯ�Ϸ��� �ϸ� ������ �߻�
		// �ε��Ҽ����� ��������
		
		
		//������
		int number1 = 10;
		
		int addedNumber = number1 + 2;
		System.out.println(addedNumber);; // 12
		
		int subtractedNumber = number1 - 3;
		System.out.println(subtractedNumber); // 7
		
		int multipliedNumber = number * 3;
		System.out.println(multipliedNumber); // 30
		
		int devidedNumber = number1 / 3;
		System.out.println(devidedNumber); // 3
		
		double devidedNumber1 = number1 / 3.0; //(int / double = double)�� ���� double�� �����⶧���� devidedNumber1�� double������ �ٲ���ߵ�
		System.out.println(devidedNumber1); // 3.3
		
		int devidedRemainNumber = number % 3;
		System.out.println(devidedRemainNumber);  //1
	
		
	}
}
