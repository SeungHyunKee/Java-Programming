package calendar;

import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {
		
		//지역변수에 한해서 type추론(var)을 사용할 수 있음
		// ex) Calendar nowDateTime -> var nowDateTime 으로 사용 가능
		//파라미터, 멤버변수에는 var 사용 못함(자바10부터 가능)
		
		Calendar nowDateTime = Calendar.getInstance();
//		var nowDateTime = Calendar.getInstance();
		System.out.println(nowDateTime);
		int year = nowDateTime.get(Calendar.YEAR);
		System.out.println(year);
		
		// 날짜 변경 방법 1 
		Calendar past = Calendar.getInstance();
//		var past = Calendar.getInstance();
		past.set(Calendar.YEAR, 1970);
		past.set(Calendar.MONTH, 0);
		past.set(Calendar.DAY_OF_MONTH, 1);
		past.set(Calendar.HOUR, 0);
		past.set(Calendar.MINUTE, 0);
		past.set(Calendar.SECOND, 0);

		System.out.println(past);
		
		//날짜 변경 방법2
		past.set(2022,  3-1,  1,  1,  50,  17);

		
		

	}
}
