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
			// Math.random()으로 0,1중 하나 랜덤하게 생성
			double randomNumber = Math.random(); //0.xxxx ~ 0.9xxx
			int result = (int) ((randomNumber * 10) % 2);
			if (result == 1) {
				System.out.println("인형을 뽑았습니다.");
				// 만약 인형을 뽑았을경우(result =1) dolls -1 해줌 (전체인형개수에서 빼주는것)
				dolls -= result; 
				isInsertCoin = false;
				return result;
			} 
			else {
				System.out.println("인형을 뽑지 못했습니다.");
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
		
		System.out.println("남은 인형 개수는 : " + game.dolls + "개 입니다.");
		System.out.println("뽑은 인형 개수는 : " + result + "개 입니다.");

	}

}
