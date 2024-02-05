package newapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExam {

	public static void main(String[] args) {
		
		LocalDateTime nowDateTime = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = 
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		String strNowDateTime = dateTimeFormatter.format(nowDateTime);
		
		System.out.println(nowDateTime); // 2024-02-05T09:32:13.327533200
		System.out.println(strNowDateTime); //2024-02-05 09:32:13

		
		nowDateTime = LocalDateTime.of(2022, 2, 1, 11, 39, 11);
		nowDateTime = nowDateTime.plusDays(10);
		nowDateTime = nowDateTime.plusMonths(10);
		nowDateTime = nowDateTime.plusYears(20);
		nowDateTime = nowDateTime.plusHours(30);
		nowDateTime = nowDateTime.plusMinutes(40);
		nowDateTime = nowDateTime.plusSeconds(50);

		dateTimeFormatter = 
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		strNowDateTime = dateTimeFormatter.format(nowDateTime);
		System.out.println(nowDateTime);  //2042-12-12T18:20:01
		System.out.println(strNowDateTime); //2042-12-12 18:20:01
	}
}
