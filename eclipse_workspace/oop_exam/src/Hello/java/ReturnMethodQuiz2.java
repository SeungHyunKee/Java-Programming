package Hello.java;

public class ReturnMethodQuiz2 {

	/**
	 * �а� �ʸ� ��� �ʷ� ��ȯ��Ű�� ���
	 * @param minutes // �Ʒ� �����Լ��� ������ minutes�ʹ� ���þ��� 
	 * @param seconds // �Ʒ� �����Լ��� ������ seconds�ʹ� ���þ��� 
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
