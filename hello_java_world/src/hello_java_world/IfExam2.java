package hello_java_world;

public class IfExam2 {

	public static void main(String[] args) {
		
		/*
		 * 1.만약, 나이가 15세 이상이고, 19세 미만이면
		 * 	'엔드게임'영화를 관람할 수 있다. 
		 */
		int age = 16;
		
		if (age >= 15 && age < 19)  {
			System.out.println("엔드게임 영화를 관람할 수 있다.");
		}
		 
		/*
		 * 2. 만약, 지금 시간이 오후 1시(13)시가 지났고,
		 * 내 체크카드에 8000원보다 많은돈이 있다면
		 * 식당에서 점심식사를 할수있다.
		 * 그렇지않다면 편의점에서 라면을 사먹을수있다.
		 */
		int hour = 13; // 현재시간
		int creditCard = 6000; //체크카드에 남아있는 잔액
		
		if (hour > 13 && creditCard > 8000) {
			System.out.println("식당에서 점심식사를 할 수 있습니다.");
		}
		else {
			System.out.println("편의점에서 라면을 사먹을수 있습니다.");
		}

		
		/*
		 * 3. 만약 나이가 19세 이상이면 "범죄도시" 영화를 관람할수있고
		 * 나이가 15세이상 19세미만이면 엔드게임 영화를 관람할수있고
		 * 나이가 12세이상이고 15세미만이면 '해리포터'영화를 관람할수있고
		 * 그렇지않다면 '뽀로로 극장판 공룡섬 대모험'을 관람할수있다.
		 */
		int age2 = 14;
		if (age2 >= 19) {
			System.out.println("범죄도시 영화를 관람할 수 있다.");
		}
//		else if (age2 >= 15 && age2 < 19) { //위에서 19세 걸러줬으니, 굳이 age2<19표현은 쓸필요 없다
		else if (age2 >= 15) { 
			System.out.println("엔드게임 영화를 관람할 수 있다.");
		}
		else if (age2 >= 12) {
			System.out.println("엔드게임 영화를 관람할 수 있다.");
		}
		else {
			System.out.println("\"뽀로로 극장판 공룡섬 대모험\"을 관람할 수 있다.");
		}
		
	}

}
