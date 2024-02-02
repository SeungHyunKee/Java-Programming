package calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarPPT {

	public static void main(String[] args) {
	
		// Calendar 인스턴스 가져오기
		Calendar nowCal = Calendar.getInstance();
		
		// 현재 연,월,일 시,분,초 구하기
		System.out.println(nowCal.get(Calendar.YEAR));
		System.out.println(nowCal.get(Calendar.MONTH)+1);
		System.out.println(nowCal.get(Calendar.DAY_OF_MONTH));
		System.out.println(nowCal.get(Calendar.HOUR));
		System.out.println(nowCal.get(Calendar.MINUTE));
		System.out.println(nowCal.get(Calendar.SECOND));

		//1일요일 ~ 7토요일
		System.out.println(nowCal.get(Calendar.DAY_OF_WEEK));
		
		
		//현재 연,월,일만 문자열로 가져오기 -> 현재 날짜 / 시간
		Date now = Calendar.getInstance().getTime();
		System.out.println(now);
		
		//날짜포맷 지정
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		//날짜를 포맷에 맞춰 변경
		String formatDate = format.format(now);
		
		//출력
		System.out.println(formatDate);
		
		
		//Calendar 이용해 날짜 변경
		nowCal.set(2022,01,01); //날짜지정
		nowCal.add(Calendar.DAY_OF_MONTH, 10); //날짜에 10일 더하기
		nowCal.add(Calendar.DAY_OF_MONTH, -20); //날짜에서 20일 빼기

	}
	
}
