package Hello.java;

public class methodExample {

	// for�ݺ��� �������� : �޼ҵ� ���� Ǯ���
	
	// 1. 1���� 100���� �� ���ؼ� ���
	public static void one2HundredSum() {
		int one2Hundred = 0;
		for (int i=1; i<101; i++) {
			one2Hundred += i;
		}
		System.out.println(one2Hundred);
	}
	
	// 2. 1���� 100�� Ȧ���� �� ���ؼ� ���
	public static void oddSum() {
		int oddNum = 0;
		for (int i = 1; i<101; i++) {
			if (i % 2 == 1) {
				oddNum += i;
			}
		}
		System.out.println(oddNum);

	}
	
	// 3. 1���� 100�� 3,5,6�� ����� ���
	public static void tripleNum() {
		for (int i = 1; i < 101; i++) {
			if (i % 3 == 0 && i % 5 == 0 && i % 6 == 0) {
				System.out.println(i);
			}
		}
	}
	
	// 4. ��ž�ױ�
	public static void stars() {
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
		one2HundredSum();
		oddSum();
		tripleNum();
		stars();
	}

}
