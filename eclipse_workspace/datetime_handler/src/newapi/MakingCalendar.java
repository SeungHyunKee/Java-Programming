package newapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.HashMap;
import java.util.Map;

public class MakingCalendar {

	/**
	 * 전달받은 날짜의 첫번째 날짜부터 마지막날짜까지를 출력 (요일포함) - 날짜핸들링 연습
	 * @param date 기준이 되는 날짜
	 */
	public static void printCalendar(LocalDate date) {
		//1st. date 인스턴스를 YearMonth로 변경
		YearMonth yearMonth = YearMonth.from(date); //년,월이 나옴
		
		//2nd. 첫번째 날짜를 구한다
		LocalDate firstDay = yearMonth.atDay(1); //전달받은 날짜가 언제인지에 상관없이 첫째날구하기
		
		//3rd. date 인스턴스의 월의 총 길이(며칠) 구한다
		int days = date.lengthOfMonth();
		
		//4th. 반복하며 날짜와 요일을 출력한다
		System.out.println(firstDay);
		System.out.println(firstDay.getDayOfWeek().name());
		for (int i = 0; i < days-1; i++) {
			firstDay = firstDay.plusDays(1);
			System.out.println(firstDay);
			System.out.println(firstDay.getDayOfWeek().name());
		}
		System.out.println("===============================================");
	}
	
	
	/**
	 * 금일을 제외한, '가장 가까운 다음 영업일' 구하기
	 * @param localDate 오늘
	 * @return
	 */
	public static Map<String, Object> getClosestWorkingDay(LocalDate localDate) {
		
		//0. localDate에 하루를 더한다
		localDate = localDate.plusDays(1);
		
		//1st. 오늘의 요일을 구한다
		DayOfWeek dayOfWeek = localDate.getDayOfWeek();
		
		int dayCount = 1; // ~일 뒤에 배송됩니다' 를 알려주기 위해
		
		
		//2nd. 하루를 더한 날짜가 휴일인지 검사한다
		while(dayOfWeek == DayOfWeek.SATURDAY 
				|| dayOfWeek == DayOfWeek.SUNDAY) {
			//3rd. 만약 휴일이라면 하루를 더 더한다
			localDate = localDate.plusDays(1);
			dayOfWeek = localDate.getDayOfWeek();
			dayCount++;
		}		
		
		//반환을 여러개(day, count) 시키고 싶을때 : 컬렉션 사용! Map
		Map<String, Object> result = new HashMap<>();
		result.put("workingDay", localDate);
		result.put("dayCount", dayCount);
		
		//4th. 만약 휴일이 아니라면 더한 결과를 반환한다
		return result; 
	
	}
	
	
	public static void main(String[] args) {
		
		Map<String, Object> closestWorkingDay = getClosestWorkingDay(LocalDate.now());
		System.out.println(closestWorkingDay.get("workingDay") + "일에 배송이 완료됩니다.");
		System.out.println(closestWorkingDay.get("dayCount") + "일 뒤에 배송이 완료됩니다.");
		System.out.println("===============================================");

		closestWorkingDay = getClosestWorkingDay(LocalDate.of(2024, 2, 9)); //금요일
		System.out.println(closestWorkingDay.get("workingDay") + "일에 배송이 완료됩니다."); //2월 12일 (월요일)
		System.out.println(closestWorkingDay.get("dayCount") + "일 뒤에 배송이 완료됩니다.");
		System.out.println("===============================================");

		
		printCalendar(LocalDate.now());
		
//		LocalDate now = LocalDate.now();
		//현재시간도 입력해보기
		LocalDate now = LocalDate.of(2024, 1, 15);
		
		//현재요일
		System.out.println(now.getDayOfWeek().name()); //LocatDate, LocalDateTime 사용
		
		YearMonth yearMonth = YearMonth.from(now);
		//이번달의 첫번째 날 구하기
		LocalDate firstDay = yearMonth.atDay(1); // LocalDate, LocalDateTime 사용
		System.out.println(firstDay);
		System.out.println(firstDay.getDayOfWeek().name());
		
		//이번달의 마지막날 구하기
		LocalDate lastDay = yearMonth.atEndOfMonth(); // LocalDate, LocalDateTime 사용
		System.out.println(lastDay);
		System.out.println(lastDay.getDayOfWeek().name());
		
		//이번달은 총 며칠인지 구하기
		int lengthOfDays = now.lengthOfMonth(); // LocalDate 사용
		System.out.println(lengthOfDays);
		
		//이번해는 총 며칠인지 구하기
		int lengthOfYears = now.lengthOfYear(); // LocalDate 사용
		System.out.println(lengthOfYears);
	}
}
