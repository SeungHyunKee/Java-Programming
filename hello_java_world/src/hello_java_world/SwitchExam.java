package hello_java_world;

public class SwitchExam {

	public static void main(String[] args) {
		// switch (상태값) {}
		// 상태값 = 숫자 or 문자열만 들어갈 수 있음
		int value = 0;
		
		switch(value) {
			// 현재상태값(value)의 값이 0이라면 여기부터 시작해라 
			case 0:
				System.out.println("현재 상태값은 0입니다.");

			// 현재상태값(value)의 값이 1이라면 여기부터 시작해라 
			case 1:
				System.out.println("현재 상태값은 1입니다.");
				break; // 흐름종료 -> 중괄호 끝으로 바로 감
			// 현재상태값(value)의 값이 2이라면 여기부터 시작해라 
			case 2:
				System.out.println("현재 상태값은 2입니다.");
				
			// 현재상태값(value)의 값이 3 or 4라면 여기부터 시작해라 	
			case 3:
			case 4:
				System.out.println("현재 상태값은 3 or 4입니다.");
		
			// 현재상태값의 값이 0,1,2,3,4 모두 아니거나 
			// 모든 흐름이 종료되었을때 가장 마지막에 실행되는 영역
			default: 	
				System.out.println("흐름이 종료되었습니다.");
		}
		
		
		//밥짓기 Switch문 예제
		String status = "뚜껑을 연다.";
		switch (status) {
			case "뚜껑을 연다." :
				System.out.println("밥솥을 꺼내세요.");
			case "밥솥을 꺼낸다." :
				System.out.println("쌀을 꺼내세요.");
			case "쌀을꺼낸다." :
				System.out.println("밥솥에 쌀을 부으세요.");
			case "밥솥에 쌀을 붓는다." :
				System.out.println("물을 부으세요");
		}
		
	}

}
