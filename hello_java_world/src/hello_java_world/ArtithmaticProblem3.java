package hello_java_world;

public class ArtithmaticProblem3 {

	public static void main(String[] args) {

		int celsius = 30;
		int farhrenheit = 0;
		
		// ���� 30���� ȭ���µ��� �����ϸ� ȭ�� 86���� ��
		// �����µ��� ȭ���� ������ fahrenheit������ �Ҵ��ϰ� ���
		//�������: (���� �� 9/5) + 32 = ȭ��
		
		farhrenheit = (celsius * 9/5) + 32;
		
//		//����, ������ (���� �� 1.5) + 32 = ȭ�� ���?
//		//��� 1
//		farhrenheit = (int) ((celsius * 1.5) + 32);
//		//��� 2
//		//farhrenhiet�� double�� �����ϰ�, �Ʒ� �ڵ� ����
//		farhrenheit = (celsius * 1.5) + 32;

		System.out.println(farhrenheit);
	}

}
