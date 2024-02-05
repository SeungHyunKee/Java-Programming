package newapi;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeExam {

	public static void main(String[] args) {
		
		LocalTime nowTime = LocalTime.now();
		DateTimeFormatter timeFormatter = 
				DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		String strNowTime = timeFormatter.format(nowTime);
		System.out.println(nowTime); //09:37:26.154997400
		System.out.println(strNowTime); //09시 37분 26초
		
		
		nowTime = LocalTime.of(00, 00, 01); //00시00분01초 에서 더하기
		nowTime = nowTime.plusHours(10);
		nowTime = nowTime.plusMinutes(5);
		nowTime = nowTime.plusSeconds(55);
		timeFormatter = 
				DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		strNowTime = timeFormatter.format(nowTime);
		System.out.println(nowTime); // 10:05:56
		System.out.println(strNowTime); // 10시 05분 56초
		
	}
}
