package hello_java_world;

public class IfExam1 {

	public static void main(String[] args) {
//		int number = 6;
//		if(number == 5) {
//			//number 가 5와 같을 경우 실행될 코드
//			System.out.println("숫자가 5와 같습니다.");
//		}
//		else {
//			//number가 5가 아닐경우 실행될 코드
//			System.out.println("숫자가 5가 아닙니다.");
//		}
		
		
		//변수의 범위
		int number = 7;
		
		if (number == 5) {
			//number가 5일경우
			System.out.println("숫자가 5와 같습니다.");
		}
		else if(number ==7) {
			//number가 7일경우
			System.out.println("숫자가 7과 같습니다.");
		}
		else {
			//number가 5, 7이 아닐경우 실행
			System.out.println("숫자가 5, 7이 아닙니다.");
		}
		
		System.out.println(Math.random());
		
		
		
		//난수를 이용해 업다운 게임 만들어보기
		
		//double타입의 난수
		double randomNumber = Math.random(); //0.9341804727320385
		
		//double 타입의 난수를 정수로 변환 : 0~99
		int answer = (int)(randomNumber * 100);
		int value = 60;
		 
		if(answer == value) {
			System.out.println("정답입니다!");
		}
		else if(answer > value) {
			System.out.println("UP!"); // UP!
		}
		else if (answer < value) {
			System.out.println("DOWN!");
		}
		
		System.out.println("정답은" + answer +"입니다."); //정답은91입니다.

		
		
		
	}
}
