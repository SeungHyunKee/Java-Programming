package hello_java_world;

public class IfExam1 {

	public static void main(String[] args) {
//		int number = 6;
//		if(number == 5) {
//			//number �� 5�� ���� ��� ����� �ڵ�
//			System.out.println("���ڰ� 5�� �����ϴ�.");
//		}
//		else {
//			//number�� 5�� �ƴҰ�� ����� �ڵ�
//			System.out.println("���ڰ� 5�� �ƴմϴ�.");
//		}
		
		
		//������ ����
		int number = 7;
		
		if (number == 5) {
			//number�� 5�ϰ��
			System.out.println("���ڰ� 5�� �����ϴ�.");
		}
		else if(number ==7) {
			//number�� 7�ϰ��
			System.out.println("���ڰ� 7�� �����ϴ�.");
		}
		else {
			//number�� 5, 7�� �ƴҰ�� ����
			System.out.println("���ڰ� 5, 7�� �ƴմϴ�.");
		}
		
		System.out.println(Math.random());
		
		
		
		//������ �̿��� ���ٿ� ���� ������
		
		//doubleŸ���� ����
		double randomNumber = Math.random(); //0.9341804727320385
		
		//double Ÿ���� ������ ������ ��ȯ : 0~99
		int answer = (int)(randomNumber * 100);
		int value = 60;
		 
		if(answer == value) {
			System.out.println("�����Դϴ�!");
		}
		else if(answer > value) {
			System.out.println("UP!"); // UP!
		}
		else if (answer < value) {
			System.out.println("DOWN!");
		}
		
		System.out.println("������" + answer +"�Դϴ�."); //������91�Դϴ�.

		
		
		
	}
}
