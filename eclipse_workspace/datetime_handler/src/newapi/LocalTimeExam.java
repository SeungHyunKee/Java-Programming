package newapi;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeExam {

	public static void main(String[] args) {
		
		LocalTime nowTime = LocalTime.now();
		DateTimeFormatter timeFormatter = 
				DateTimeFormatter.ofPattern("HH�� mm�� ss��");
		String strNowTime = timeFormatter.format(nowTime);
		System.out.println(nowTime); //09:37:26.154997400
		System.out.println(strNowTime); //09�� 37�� 26��
		
		
		nowTime = LocalTime.of(00, 00, 01); //00��00��01�� ���� ���ϱ�
		nowTime = nowTime.plusHours(10);
		nowTime = nowTime.plusMinutes(5);
		nowTime = nowTime.plusSeconds(55);
		timeFormatter = 
				DateTimeFormatter.ofPattern("HH�� mm�� ss��");
		strNowTime = timeFormatter.format(nowTime);
		System.out.println(nowTime); // 10:05:56
		System.out.println(strNowTime); // 10�� 05�� 56��
		
	}
}
