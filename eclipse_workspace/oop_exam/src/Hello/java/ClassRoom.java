package Hello.java;

public class ClassRoom {

	public static void main(String[] args) {
		
		Calculator �л�1 = new Calculator();
		�л�1.korScore = 100;
		�л�1.mathScore = 90;
		�л�1.engScore = 80;
		�л�1.progScore = 70;

		int sum1 = �л�1.getSumScore();
		int average1 = �л�1.getAverageScore();
		String grade1 =�л�1.getGrade();
		
		System.out.println(sum1);
		System.out.println(average1);
		System.out.println(grade1);
		
		
		// �л�1�� 2�� ���� �ּҸ� �ٶ󺸰� ����
		System.out.println(�л�1); //Hello.java.Calculator@6e2c634b
		
		Calculator �л�2 = �л�1; // �л�1�� �������ִ� �޸� �ּҸ� �л�2���� �־���
		
		System.out.println(�л�2); //Hello.java.Calculator@6e2c634b

		�л�2.korScore = 0;
	}
}
