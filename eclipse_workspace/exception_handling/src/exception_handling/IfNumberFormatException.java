package exception_handling;

public class IfNumberFormatException {
	
	public static void main(String[] args) {
		
//		String numString = "123";
//		int num = Integer.parseInt(numString);
//		System.out.println(num); //123

		// ���ڰ��ƴѰ��� ���ڷ� �����Ϸ��ϸ� : IfNumberFormatException �߻�
//		numString = "ABC";
//		num = Integer.parseInt(numString);
//		System.out.println(num);
		
		
		
		// IfNumberFormatException �������
		String numString = "123";
		if (numString.matches("^[0-9]+$")){
			int num = Integer.parseInt(numString);
			System.out.println(num); //123
		}
		numString = "ABC";
		if (numString.matches("^[0-9]+$")){
			int num = Integer.parseInt(numString);
			System.out.println(num);
		}
	}
}
