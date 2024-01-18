package hello_java_world;

public class ArtithmaticProblem3 {

	public static void main(String[] args) {

		int celsius = 30;
		int farhrenheit = 0;
		
		// 섭씨 30도를 화씨온도로 변경하면 화씨 86도가 됨
		// 섭씨온도를 화씨로 변경해 fahrenheit변수에 할당하고 출력
		//변경공식: (섭씨 × 9/5) + 32 = 화씨
		
		farhrenheit = (celsius * 9/5) + 32;
		
//		//만약, 공식이 (섭씨 × 1.5) + 32 = 화씨 라면?
//		//방법 1
//		farhrenheit = (int) ((celsius * 1.5) + 32);
//		//방법 2
//		//farhrenhiet를 double로 선언하고, 아래 코드 수행
//		farhrenheit = (celsius * 1.5) + 32;

		System.out.println(farhrenheit);
	}

}
