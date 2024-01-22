package Hello.java;

public class ReturnMethodExam {

	/**
	 * 숫자를 원하는 수만큼 곱한 결과를 반환
	 * @param num 곱할 숫자
	 * @param time 곱할 횟수
	 * @return 숫자를 곱한 결과
	 */
	public static int getMultiply(int num, int time) { // int타입이므로 내부에 리턴키워드가 없으면 에러남
		int result = num * time;
		return result;
		
	}
		
	public static void main(String[] args) {
		// 메소드 호출
		int multiplyResult = getMultiply(10,4);
		System.out.println(multiplyResult); //40
		
		multiplyResult = getMultiply(20, 6);
		System.out.println(multiplyResult); //120
	}

}
