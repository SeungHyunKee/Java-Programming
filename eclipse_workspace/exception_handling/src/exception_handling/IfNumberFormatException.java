package exception_handling;

public class IfNumberFormatException {
	
	public static void main(String[] args) {
		
//		String numString = "123";
//		int num = Integer.parseInt(numString);
//		System.out.println(num); //123

		// 숫자가아닌값을 숫자로 변경하려하면 : IfNumberFormatException 발생
//		numString = "ABC";
//		num = Integer.parseInt(numString);
//		System.out.println(num);
		
		
		
		// IfNumberFormatException 방지방법
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
