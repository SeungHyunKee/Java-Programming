package Hello.java;

public class Zoo {

	public static void main(String[] args) {
		
		//Animal Ÿ���� ����(�ν��Ͻ�)�� ����� Ȱ��
		
		//  ������ ����� ����  :    �ڷ��� �����̸�   =   ��;
		// �ν��Ͻ� ����� ���� : �ڷ��� �ν��Ͻ��� �̸� = new �ڷ���();
		
		Animal �Ҵ� = new Animal();  // Animal�� �����ϰ� new �ڿ��� ����
		�Ҵ�.name = "Ǫ�ٿ�"; // Animal Ÿ���� �ν��Ͻ��� �������
		�Ҵ�.hello();
		
		Animal �����Ҵ� = new Animal();
		�����Ҵ�.name = "Ǫ�ٿ� ģ��";
		�����Ҵ�.hello();
	}
}
