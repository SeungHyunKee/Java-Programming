package string_exercise;

public class StringExam {

	public static void changeStr(String str) {
		str += "바뀌었을까요?";
		System.out.println(str); //2nd 원본입니다. 출력
	}
	  
	public static void main(String[] args) {
		String message = "원본입니다.";
		changeStr(message);
		System.out.println(message); // 1st 원본입니다. 바뀌었을까요? 출력

	}

}
