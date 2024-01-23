package Hello.java;

public class DollClawMachine {
	boolean isInsertCoin;
	int dolls;

	public void isInsertCoin() {
		if (dolls > 0) {
			isInsertCoin = true;
		}
	}

	public int doGame() {
		if (isInsertCoin) {
			// Math.random()���� 0,1�� �ϳ� �����ϰ� ����
			double randomNumber = Math.random(); //0.xxxx ~ 0.9xxx
			int result = (int) ((randomNumber * 10) % 2);
			if (result == 1) {
				System.out.println("������ �̾ҽ��ϴ�.");
				// ���� ������ �̾������(result =1) dolls -1 ���� (��ü������������ ���ִ°�)
				dolls -= result; 
				isInsertCoin = false;
				return result;
			} 
			else {
				System.out.println("������ ���� ���߽��ϴ�.");
				isInsertCoin = false;
				return 0;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		DollClawMachine game = new DollClawMachine();
		game.isInsertCoin = true;
		game.dolls = 5;
		
		game.isInsertCoin();
		int result = game.doGame();
		
		System.out.println("���� ���� ������ : " + game.dolls + "�� �Դϴ�.");
		System.out.println("���� ���� ������ : " + result + "�� �Դϴ�.");

	}

}
