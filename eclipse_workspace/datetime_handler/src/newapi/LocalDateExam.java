package newapi;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class LocalDateExam {

	public static void main(String[] args) {
		
		LocalDate nowDate = LocalDate.now();
		DateTimeFormatter dateFormatter =
				//DateTimeFormatter : 현재시간을 문자타입으로 바꿔줌
				DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		String strNowDate = dateFormatter.format(nowDate);
		System.out.println(nowDate); //2024-02-05
		System.out.println(strNowDate); //2024년 02월 05일

		nowDate = LocalDate.of(2022, 1,1);
		nowDate = nowDate.plusDays(10);
		nowDate = nowDate.plusMonths(2);
		nowDate = nowDate.plusYears(3);
		dateFormatter =
				DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		strNowDate = dateFormatter.format(nowDate);
		System.out.println(nowDate); //2025-03-11
		System.out.println(strNowDate); //2025년 03월 11일
		
		//날짜와 날짜사이 차이 구하기
		// 티켓팅 할 때 '오픈 ~시간 ~초 전' 알려줄때 사용가능
		LocalDate startDate = LocalDate.of(2022,  1, 1);
		LocalDate endDate = LocalDate.of(2023,  5, 20);
		Period between = Period.between(startDate, endDate);
		System.out.println(between.getYears() + "," 
							+ between.getMonths() + "," 
								+ between.getDays());
	}
}
