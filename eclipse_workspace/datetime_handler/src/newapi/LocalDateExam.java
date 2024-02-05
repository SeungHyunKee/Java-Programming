package newapi;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class LocalDateExam {

	public static void main(String[] args) {
		
		LocalDate nowDate = LocalDate.now();
		DateTimeFormatter dateFormatter =
				//DateTimeFormatter : ����ð��� ����Ÿ������ �ٲ���
				DateTimeFormatter.ofPattern("yyyy�� MM�� dd��");
		String strNowDate = dateFormatter.format(nowDate);
		System.out.println(nowDate); //2024-02-05
		System.out.println(strNowDate); //2024�� 02�� 05��

		nowDate = LocalDate.of(2022, 1,1);
		nowDate = nowDate.plusDays(10);
		nowDate = nowDate.plusMonths(2);
		nowDate = nowDate.plusYears(3);
		dateFormatter =
				DateTimeFormatter.ofPattern("yyyy�� MM�� dd��");
		strNowDate = dateFormatter.format(nowDate);
		System.out.println(nowDate); //2025-03-11
		System.out.println(strNowDate); //2025�� 03�� 11��
		
		//��¥�� ��¥���� ���� ���ϱ�
		// Ƽ���� �� �� '���� ~�ð� ~�� ��' �˷��ٶ� ��밡��
		LocalDate startDate = LocalDate.of(2022,  1, 1);
		LocalDate endDate = LocalDate.of(2023,  5, 20);
		Period between = Period.between(startDate, endDate);
		System.out.println(between.getYears() + "," 
							+ between.getMonths() + "," 
								+ between.getDays());
	}
}
