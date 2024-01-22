package Hello.java;

import java.util.Scanner;

public class UpandDownGame {

	/**
	 * UpandDown 게임을 시작한다.
	 * @param args
	 */
	public static void startGame() {
		// Ctrl + shift + o -> import 단축키 
		
		// 키보드의 입력을 변수로 받아올수있도록 도와주는 코드
		Scanner keyboard = new Scanner(System.in);
		
		//난수 생성(0.0000000)
		double randomNumber = Math.random();
		
		//난수를 0~99 사이의 정수로 변환
		int answer = (int) (randomNumber * 100);
		
		//사용자가 입력하는 값을 할당받을 변수 선언
		int value = 0;
		
		while(true) {
			System.out.println("숫자를 입력하세요.");
			//사용자가 keyboard변수를 이용해 숫자를 입력한 후
			// enter를 입력하면 value변수에 값이 할당됨
			value = keyboard.nextInt();
			
			//컴퓨터가 만든 난수와 사용자가입력한 숫자가 일치하는지 확인하고
			//일치한다면 '정답입니다' 출력
			if(answer == value) {
				System.out.println("정답입니다");
				break; //무한반복 종료시킴
			}
			//컴퓨터가만든 난수와 사용자가입력한숫자 비교했을때
			//사용자가입력한값이 더 작다면 'Up!" 출력		
			else if (answer > value) {
				System.out.println("Up!");
			}
			// 컴퓨터가 만든 난수와 사용자입력숫자 비교시
			//일치하지도않고, 사용자가 입력한값이 더 작지 않다면
			//"Down!" 출력
			else {
				System.out.println("Down!");
			}
		}
	}
	
	
	public static void main(String[] args) {
		//startGame 호출
		startGame(); 
		startGame();
		startGame();
		startGame();
		startGame();

	}

}
