package Hello.java;

import java.util.Scanner;

public class UpandDownGame {

	/**
	 * UpandDown ������ �����Ѵ�.
	 * @param args
	 */
	public static void startGame() {
		// Ctrl + shift + o -> import ����Ű 
		
		// Ű������ �Է��� ������ �޾ƿü��ֵ��� �����ִ� �ڵ�
		Scanner keyboard = new Scanner(System.in);
		
		//���� ����(0.0000000)
		double randomNumber = Math.random();
		
		//������ 0~99 ������ ������ ��ȯ
		int answer = (int) (randomNumber * 100);
		
		//����ڰ� �Է��ϴ� ���� �Ҵ���� ���� ����
		int value = 0;
		
		while(true) {
			System.out.println("���ڸ� �Է��ϼ���.");
			//����ڰ� keyboard������ �̿��� ���ڸ� �Է��� ��
			// enter�� �Է��ϸ� value������ ���� �Ҵ��
			value = keyboard.nextInt();
			
			//��ǻ�Ͱ� ���� ������ ����ڰ��Է��� ���ڰ� ��ġ�ϴ��� Ȯ���ϰ�
			//��ġ�Ѵٸ� '�����Դϴ�' ���
			if(answer == value) {
				System.out.println("�����Դϴ�");
				break; //���ѹݺ� �����Ŵ
			}
			//��ǻ�Ͱ����� ������ ����ڰ��Է��Ѽ��� ��������
			//����ڰ��Է��Ѱ��� �� �۴ٸ� 'Up!" ���		
			else if (answer > value) {
				System.out.println("Up!");
			}
			// ��ǻ�Ͱ� ���� ������ ������Է¼��� �񱳽�
			//��ġ�������ʰ�, ����ڰ� �Է��Ѱ��� �� ���� �ʴٸ�
			//"Down!" ���
			else {
				System.out.println("Down!");
			}
		}
	}
	
	
	public static void main(String[] args) {
		//startGame ȣ��
		startGame(); 
		startGame();
		startGame();
		startGame();
		startGame();

	}

}
