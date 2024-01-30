package exception_handling;

public class IfArrayIndexOutOfBoundsException {

	public static void main(String args[]) {
		// 배열의 정의
		int[] scores = {100, 200, 300};
		//1.배열 예외발생
		System.out.println(scores[0]); //100
		System.out.println(scores[1]); //200
		System.out.println(scores[2]); //300
		
		//System.out.println(scores[3]); //ArrayIndexOutOfBoundsException
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		//at exception_handling.IfArrayIndexOutOfBoundsException.main(IfArrayIndexOutOfBoundsException.java:11)

		//2. 배열 예외 방지 방법
		// -> 참조 전 배열의 길이 계산
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
