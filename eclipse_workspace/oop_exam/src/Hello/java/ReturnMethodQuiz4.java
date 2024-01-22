package Hello.java;

/**
 * if else, �޼ҵ� �� Ȱ���� �����з� 
 */
public class ReturnMethodQuiz4 {

	/**
	 * �������� �հ踦 ���Ѵ�
	 * @param kor
	 * @param eng
	 * @param math
	 * @param prog
	 * @return �������� �� ��
	 */
	public static int getSum(int kor, int eng, int math, int prog) {
		int sum = kor + eng + math + prog ;
		return sum;
	}	
	
	/**
	 * ������ ����� ���Ѵ� 
	 * @param sum ������ ��
	 * @param subjectCount ������ ����
	 * @return ������ ���
	 */
	public static int getAverage(int sum, int subjectCount) {
		int average = sum / subjectCount;
		return average;
	
	}
	
	/**
	 * ����� ����� ���Ѵ�
	 * @param average ��� ����
	 * @return ��� ������ �˸´� ���
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
		
		// ����1. ���� �հ踦 ���Ѵ�.
		int sum = getSum(korScore, engScore, mathScore, progScore);
		// ����2. ��������� ���Ѵ�.
		int average = getAverage(sum, subjectCount);
		// ����3. ����� ���Ѵ�.
		String grade = getGrade(average);
				
		System.out.println(grade);
	}
}
