package Hello.java;

/**
 * 섭씨를 파라미터로 받아 화씨를 반환하는 메소드 만들어 호출, 결과 출력
 */
public class ReturnMethodQuiz3 {

	public static int getCelsiusToFahrenheit(int celsius) {
		int farenheit = celsius * 9 / 5 + 32;
		return farenheit;
		
	}
	
	public static void main(String[] args) {
		int celsius = 30;
		int farenheit = getCelsiusToFahrenheit(celsius);
		System.out.println(farenheit);	
	}
}
