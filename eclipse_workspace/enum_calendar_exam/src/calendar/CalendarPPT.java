package calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarPPT {

	public static void main(String[] args) {
	
		// Calendar �ν��Ͻ� ��������
		Calendar nowCal = Calendar.getInstance();
		
		// ���� ��,��,�� ��,��,�� ���ϱ�
		System.out.println(nowCal.get(Calendar.YEAR));
		System.out.println(nowCal.get(Calendar.MONTH)+1);
		System.out.println(nowCal.get(Calendar.DAY_OF_MONTH));
		System.out.println(nowCal.get(Calendar.HOUR));
		System.out.println(nowCal.get(Calendar.MINUTE));
		System.out.println(nowCal.get(Calendar.SECOND));

		//1�Ͽ��� ~ 7�����
		System.out.println(nowCal.get(Calendar.DAY_OF_WEEK));
		
		
		//���� ��,��,�ϸ� ���ڿ��� �������� -> ���� ��¥ / �ð�
		Date now = Calendar.getInstance().getTime();
		System.out.println(now);
		
		//��¥���� ����
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		//��¥�� ���˿� ���� ����
		String formatDate = format.format(now);
		
		//���
		System.out.println(formatDate);
		
		
		//Calendar �̿��� ��¥ ����
		nowCal.set(2022,01,01); //��¥����
		nowCal.add(Calendar.DAY_OF_MONTH, 10); //��¥�� 10�� ���ϱ�
		nowCal.add(Calendar.DAY_OF_MONTH, -20); //��¥���� 20�� ����

	}
	
}
