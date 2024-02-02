package enum_exam;

public class CalcOperator {

	public int get(CalcType type, int num1, int num2) {
		
		// Enum�� ������� �߰����ָ� �Ʒ� ��¹� �ѹ��� �ۼ��Ͽ� 
		// add,sub,mul,div ���� ����Ʈ ���ص� ���ٸ����� ����� �� ����
		System.out.println(type.getSymbol() + "�� �մϴ�.");
		
		if ( type == CalcType.ADD ) {
			return num1 + num2;
		} else if (type == CalcType.SUB) {
			return num1 - num2;
		}else if (type == CalcType.MUL) {
			return num1 * num2;
		}else if (type == CalcType.DIV) {
			return num1 / num2;
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		CalcOperator calc = new CalcOperator();
		
//		int gender = 2;
		
		int result = calc.get(CalcType.ADD, 10, 5);
		System.out.println(result);
		
		result = calc.get(CalcType.SUB, 10, 5);
		System.out.println(result);
		
		result = calc.get(CalcType.MUL, 10, 5);
		System.out.println(result);
		
		result = calc.get(CalcType.DIV, 10, 5);
		System.out.println(result);
		
	}
}
