package Hello.java;

public class Calculator {
	
	// 정의하기 (멤버변수)
	int korScore;
	int engScore;
	int mathScore;
	int progScore;
	
	int sumScore;
	int averageScore;
	String grade;
	
	public int getSumScore() {
		// sumScore에 타입이 없다 = 재할당 하는것!
		sumScore = korScore + engScore + mathScore + progScore;
		return sumScore;
	}
	
	public int getAverageScore() {
		averageScore = sumScore / 4;
		return averageScore;
	}
	
	public String getGrade() {
		if (averageScore >= 95) {
			grade = "A+";
		}
		else if (averageScore >= 90) {
			grade = "A";
		}
		else if (averageScore >= 85) {
			grade = "B+";
		}
		else if (averageScore >= 80) {
			grade = "B";
		}
		else if (averageScore >= 70) {
			grade = "C";
		}
		else {
			grade = "F";
		}
		return grade;
	}

}
