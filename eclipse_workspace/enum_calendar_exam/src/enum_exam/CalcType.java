package enum_exam;

public enum CalcType {
	
	//�����(Enum) ������ֱ� : ���� �빮�ڷ� �ۼ�
//	ADD, SUB, MUL, DIV;
	// ADD, SUB, MUL, DIV; ��ü�� ����� �ν��Ͻ���

	// ���� ������ �ν��Ͻ��� ���� �� �ִ�
	ADD("+"), SUB("-"), MUL("*"), DIV("/");  

	private String symbol; 
	
	
	//public�� �Ʒ��� ���� �����ڿ� ���� �� ���� 
	// �̷��� �ϸ� Enum�� ��������� ���� �� ������, �� �Ⱦ�
	CalcType(String str) {
		this.symbol = str;
	}
	
	public String getSymbol() {
		return this.symbol;
	}
	
	//�ڹٿ��� �빮�ڷ� �����Ѵٴ� �ǹ� == reference type��� �ǹ�
	//> ��, == �� ����Ұ���
    
	//enum�� �� 1���� �ν��Ͻ��� ���� �� �ִ�
	//enum�� �ν��Ͻ��� ��������� �ð� = �ν��Ͻ��� '����'�Ҷ�
	
	
}
