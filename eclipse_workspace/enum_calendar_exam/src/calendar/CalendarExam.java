package calendar;

import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {
		
		//���������� ���ؼ� type�߷�(var)�� ����� �� ����
		// ex) Calendar nowDateTime -> var nowDateTime ���� ��� ����
		//�Ķ����, ����������� var ��� ����(�ڹ�10���� ����)
		
		Calendar nowDateTime = Calendar.getInstance();
//		var nowDateTime = Calendar.getInstance();
		System.out.println(nowDateTime);
		int year = nowDateTime.get(Calendar.YEAR);
		System.out.println(year);
		
		// ��¥ ���� ��� 1 
		Calendar past = Calendar.getInstance();
//		var past = Calendar.getInstance();
		past.set(Calendar.YEAR, 1970);
		past.set(Calendar.MONTH, 0);
		past.set(Calendar.DAY_OF_MONTH, 1);
		past.set(Calendar.HOUR, 0);
		past.set(Calendar.MINUTE, 0);
		past.set(Calendar.SECOND, 0);

		System.out.println(past);
		
		//��¥ ���� ���2
		past.set(2022,  3-1,  1,  1,  50,  17);

		
		

	}
}
