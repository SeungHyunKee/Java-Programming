package Hello.java;

/**
 * 교재 p168 문제
 */
public class ReturnMethodQuiz1 {

	/**
	 * 수행시간(초)을 파람리터로 받아서, 분(minutes) 만 구해 반환시킴
	 * @param processTime 수행시간(초)
	 * @return 수행시간(초)를 분(minutes)으로 변환한 결과
	 */
	public static int getMinutes(int processTime) {
		int processMinutes = processTime / 60;
		return processMinutes;
	}
	
	/**
	 * 수행시간(초)을 파람리터로 받아서, 분을 제외한 나머지 초(seconds)만구해 반환시킴
	 * @param processTime 수행시간(초)
	 * @return 수행시간(초)을 분을 제외한 나머지 초(seconds)로 변환한 결과
	 */
	public static int getSeconds(int processTime) {
		int processSeconds = processTime % 60;
		return processSeconds;
	}
	
	
	public static void main(String[] args) {
		int processTime = 145;
		int minutes = getMinutes(processTime);
		int seconds = getSeconds(processTime);
		
		System.out.println(minutes); // 2
		System.out.println(seconds); // 25
	}

}
