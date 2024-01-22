package Hello.java;

public class ClassRoom {

	public static void main(String[] args) {
		
		Calculator 학생1 = new Calculator();
		학생1.korScore = 100;
		학생1.mathScore = 90;
		학생1.engScore = 80;
		학생1.progScore = 70;

		int sum1 = 학생1.getSumScore();
		int average1 = 학생1.getAverageScore();
		String grade1 =학생1.getGrade();
		
		System.out.println(sum1);
		System.out.println(average1);
		System.out.println(grade1);
		
		
		// 학생1과 2는 같은 주소를 바라보고 있음
		System.out.println(학생1); //Hello.java.Calculator@6e2c634b
		
		Calculator 학생2 = 학생1; // 학생1이 가지고있는 메모리 주소를 학생2에게 넣어줌
		
		System.out.println(학생2); //Hello.java.Calculator@6e2c634b

		학생2.korScore = 0;
	}
}
