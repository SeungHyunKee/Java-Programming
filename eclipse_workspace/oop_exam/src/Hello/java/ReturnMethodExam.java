package Hello.java;

public class ReturnMethodExam {

	/**
	 * ���ڸ� ���ϴ� ����ŭ ���� ����� ��ȯ
	 * @param num ���� ����
	 * @param time ���� Ƚ��
	 * @return ���ڸ� ���� ���
	 */
	public static int getMultiply(int num, int time) { // intŸ���̹Ƿ� ���ο� ����Ű���尡 ������ ������
		int result = num * time;
		return result;
		
	}
		
	public static void main(String[] args) {
		// �޼ҵ� ȣ��
		int multiplyResult = getMultiply(10,4);
		System.out.println(multiplyResult); //40
		
		multiplyResult = getMultiply(20, 6);
		System.out.println(multiplyResult); //120
	}

}
