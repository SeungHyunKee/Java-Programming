package newapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.HashMap;
import java.util.Map;

public class MakingCalendar {

	/**
	 * ���޹��� ��¥�� ù��° ��¥���� ��������¥������ ��� (��������) - ��¥�ڵ鸵 ����
	 * @param date ������ �Ǵ� ��¥
	 */
	public static void printCalendar(LocalDate date) {
		//1st. date �ν��Ͻ��� YearMonth�� ����
		YearMonth yearMonth = YearMonth.from(date); //��,���� ����
		
		//2nd. ù��° ��¥�� ���Ѵ�
		LocalDate firstDay = yearMonth.atDay(1); //���޹��� ��¥�� ���������� ������� ù°�����ϱ�
		
		//3rd. date �ν��Ͻ��� ���� �� ����(��ĥ) ���Ѵ�
		int days = date.lengthOfMonth();
		
		//4th. �ݺ��ϸ� ��¥�� ������ ����Ѵ�
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
	 * ������ ������, '���� ����� ���� ������' ���ϱ�
	 * @param localDate ����
	 * @return
	 */
	public static Map<String, Object> getClosestWorkingDay(LocalDate localDate) {
		
		//0. localDate�� �Ϸ縦 ���Ѵ�
		localDate = localDate.plusDays(1);
		
		//1st. ������ ������ ���Ѵ�
		DayOfWeek dayOfWeek = localDate.getDayOfWeek();
		
		int dayCount = 1; // ~�� �ڿ� ��۵˴ϴ�' �� �˷��ֱ� ����
		
		
		//2nd. �Ϸ縦 ���� ��¥�� �������� �˻��Ѵ�
		while(dayOfWeek == DayOfWeek.SATURDAY 
				|| dayOfWeek == DayOfWeek.SUNDAY) {
			//3rd. ���� �����̶�� �Ϸ縦 �� ���Ѵ�
			localDate = localDate.plusDays(1);
			dayOfWeek = localDate.getDayOfWeek();
			dayCount++;
		}		
		
		//��ȯ�� ������(day, count) ��Ű�� ������ : �÷��� ���! Map
		Map<String, Object> result = new HashMap<>();
		result.put("workingDay", localDate);
		result.put("dayCount", dayCount);
		
		//4th. ���� ������ �ƴ϶�� ���� ����� ��ȯ�Ѵ�
		return result; 
	
	}
	
	
	public static void main(String[] args) {
		
		Map<String, Object> closestWorkingDay = getClosestWorkingDay(LocalDate.now());
		System.out.println(closestWorkingDay.get("workingDay") + "�Ͽ� ����� �Ϸ�˴ϴ�.");
		System.out.println(closestWorkingDay.get("dayCount") + "�� �ڿ� ����� �Ϸ�˴ϴ�.");
		System.out.println("===============================================");

		closestWorkingDay = getClosestWorkingDay(LocalDate.of(2024, 2, 9)); //�ݿ���
		System.out.println(closestWorkingDay.get("workingDay") + "�Ͽ� ����� �Ϸ�˴ϴ�."); //2�� 12�� (������)
		System.out.println(closestWorkingDay.get("dayCount") + "�� �ڿ� ����� �Ϸ�˴ϴ�.");
		System.out.println("===============================================");

		
		printCalendar(LocalDate.now());
		
//		LocalDate now = LocalDate.now();
		//����ð��� �Է��غ���
		LocalDate now = LocalDate.of(2024, 1, 15);
		
		//�������
		System.out.println(now.getDayOfWeek().name()); //LocatDate, LocalDateTime ���
		
		YearMonth yearMonth = YearMonth.from(now);
		//�̹����� ù��° �� ���ϱ�
		LocalDate firstDay = yearMonth.atDay(1); // LocalDate, LocalDateTime ���
		System.out.println(firstDay);
		System.out.println(firstDay.getDayOfWeek().name());
		
		//�̹����� �������� ���ϱ�
		LocalDate lastDay = yearMonth.atEndOfMonth(); // LocalDate, LocalDateTime ���
		System.out.println(lastDay);
		System.out.println(lastDay.getDayOfWeek().name());
		
		//�̹����� �� ��ĥ���� ���ϱ�
		int lengthOfDays = now.lengthOfMonth(); // LocalDate ���
		System.out.println(lengthOfDays);
		
		//�̹��ش� �� ��ĥ���� ���ϱ�
		int lengthOfYears = now.lengthOfYear(); // LocalDate ���
		System.out.println(lengthOfYears);
	}
}
