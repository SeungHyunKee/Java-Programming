package string_exercise;

public class StringExam {

	public static void changeStr(String str) {
		str += "�ٲ�������?";
		System.out.println(str); //2nd �����Դϴ�. ���
	}
	  
	public static void main(String[] args) {
		String message = "�����Դϴ�.";
		changeStr(message);
		System.out.println(message); // 1st �����Դϴ�. �ٲ�������? ���

	}

}
