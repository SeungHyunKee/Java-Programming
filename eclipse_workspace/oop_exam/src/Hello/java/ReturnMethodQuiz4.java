package Hello.java;

/**
 * if else, 메소드 를 활용한 성적분류 
 */
public class ReturnMethodQuiz4 {

	/**
	 * 점수들의 합계를 구한다
	 * @param kor
	 * @param eng
	 * @param math
	 * @param prog
	 * @return 점수들의 총 합
	 */
	public static int getSum(int kor, int eng, int math, int prog) {
		int sum = kor + eng + math + prog ;
		return sum;
	}	
	
	/**
	 * 성적의 평균을 구한다 
	 * @param sum 성적의 합
	 * @param subjectCount 과목의 개수
	 * @return 성적의 평균
	 */
	public static int getAverage(int sum, int subjectCount) {
		int average = sum / subjectCount;
		return average;
	
	}
	
	/**
	 * 평균의 등급을 구한다
	 * @param average 평균 성적
	 * @return 평균 성적에 알맞는 등급
	 */
	public static String getGrade(int average) {
		String grade = "";
		
		if (average >= 95) {
			grade = "A+";
		}
		else if(average >= 90) {
			grade = "A";
		}
		else if(average >= 85) {
			grade = "B+";
		}
		else if(average >= 80) {
			grade = "B";
		}
		else if(average >= 70) {
			grade = "C";
		}
		else {
			grade = "F";
		}
		
		return grade;
	}
	
	public static void main(String[] args) {
		int korScore = 90;
		int engScore = 88;
		int mathScore = 70;
		int progScore = 80;
		int subjectCount = 4;
		
		// 순서1. 과목별 합계를 구한다.
		int sum = getSum(korScore, engScore, mathScore, progScore);
		// 순서2. 평균점수를 구한다.
		int average = getAverage(sum, subjectCount);
		// 순서3. 등급을 구한다.
		String grade = getGrade(average);
				
		System.out.println(grade);
	}
}
