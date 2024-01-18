package hello_java_world;

public class SwitchExam {

	public static void main(String[] args) {
		// switch (���°�) {}
		// ���°� = ���� or ���ڿ��� �� �� ����
		int value = 0;
		
		switch(value) {
			// ������°�(value)�� ���� 0�̶�� ������� �����ض� 
			case 0:
				System.out.println("���� ���°��� 0�Դϴ�.");

			// ������°�(value)�� ���� 1�̶�� ������� �����ض� 
			case 1:
				System.out.println("���� ���°��� 1�Դϴ�.");
				break; // �帧���� -> �߰�ȣ ������ �ٷ� ��
			// ������°�(value)�� ���� 2�̶�� ������� �����ض� 
			case 2:
				System.out.println("���� ���°��� 2�Դϴ�.");
				
			// ������°�(value)�� ���� 3 or 4��� ������� �����ض� 	
			case 3:
			case 4:
				System.out.println("���� ���°��� 3 or 4�Դϴ�.");
		
			// ������°��� ���� 0,1,2,3,4 ��� �ƴϰų� 
			// ��� �帧�� ����Ǿ����� ���� �������� ����Ǵ� ����
			default: 	
				System.out.println("�帧�� ����Ǿ����ϴ�.");
		}
		
		
		//������ Switch�� ����
		String status = "�Ѳ��� ����.";
		switch (status) {
			case "�Ѳ��� ����." :
				System.out.println("����� ��������.");
			case "����� ������." :
				System.out.println("���� ��������.");
			case "����������." :
				System.out.println("��ܿ� ���� ��������.");
			case "��ܿ� ���� �״´�." :
				System.out.println("���� ��������");
		}
		
	}

}
