package Hello.java;

/**
 * ������ �Ķ���ͷ� �޾� ȭ���� ��ȯ�ϴ� �޼ҵ� ����� ȣ��, ��� ���
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
