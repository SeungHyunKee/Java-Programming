package hello_java_world;

public class OperatorExam {

	public static void main(String[] args) {
		//1. ���� a�� ���� 10���� ũ�� 20���� ������?
		int a = 10;
		boolean is11To19 = a > 10 && a < 20;
		System.out.println(is11To19); // false
		
		//2. ���� b�� ¦���ΰ�?
		int b = 12345;
		boolean isEven = b % 2 == 0;
		System.out.println(isEven); // false

		//3. ���� c�� 0���� ū ¦���ΰ�?
		int c = - 4576;
		boolean isEven2 = c > 0 && c % 2 == 0;
		System.out.println(isEven2); // false
		
		//4. ���� d�ǰ��� 2�Ǵ� 5�� ����ΰ�?
		int d = 35;
		boolean isMultiple2Or5 = d % 2 == 0 || d % 5 == 0;
		System.out.println(isMultiple2Or5); //true
		
		//5. son�� �θ�԰� �Բ� 12�� �̻� �������� ��ȭ�� �����ֳ�?
		int son = 7;
		int parent = 40;
		boolean isAvailable = son >= 12 || parent >= 12;
		System.out.println(isAvailable); //true
		
		// 6. ���� e�� ���� 3�� ����� �ƴѰ�?
		int e = 35;
		boolean isNotMultiple3 = e % 3 != 0; //���1
		System.out.println(isNotMultiple3); //true
		
		isNotMultiple3 = !(e % 3 == 0);   //���2
		System.out.println(isNotMultiple3); //true

 

	}

}
