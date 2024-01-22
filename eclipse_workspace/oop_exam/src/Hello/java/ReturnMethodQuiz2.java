package Hello.java;

public class ReturnMethodQuiz2 {

	/**
	 * 분과 초를 모두 초로 반환시키는 기능
	 * @param minutes // 아래 메인함수의 변수인 minutes와는 관련없음 
	 * @param seconds // 아래 메인함수의 변수인 seconds와는 관련없음 
	 * @return
	 */
	public static int getSeconds(int minutes, int seconds) {
		int result = minutes * 60 + seconds;
		return result;
	}
	
	public static void main(String[] args) {
		int minutes = 5;
		int seconds = 50;
		int time = getSeconds(minutes, seconds);
		System.out.println(time);
	}
}
