package exception_handling;

public class IfArrayIndexOutOfBoundsException {

	public static void main(String args[]) {
		// �迭�� ����
		int[] scores = {100, 200, 300};
		//1.�迭 ���ܹ߻�
		System.out.println(scores[0]); //100
		System.out.println(scores[1]); //200
		System.out.println(scores[2]); //300
		
		//System.out.println(scores[3]); //ArrayIndexOutOfBoundsException
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		//at exception_handling.IfArrayIndexOutOfBoundsException.main(IfArrayIndexOutOfBoundsException.java:11)

		//2. �迭 ���� ���� ���
		// -> ���� �� �迭�� ���� ���
		if (scores.length > 0) {
			System.out.println(scores[0]); // 100
		}
		if (scores.length > 1) {
			System.out.println(scores[1]); // 200
		}
		if (scores.length > 2) {
			System.out.println(scores[2]); // 300
		}
		if (scores.length > 3) {
			System.out.println(scores[3]);
		}

	}

}
