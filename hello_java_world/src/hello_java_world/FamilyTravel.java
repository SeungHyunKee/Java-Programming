package hello_java_world;

public class FamilyTravel {

	public static void main(String[] args) {
	// 아동과 성인 구분하는 연령 : 19세
	// 성인과 아동 구분 -> 비용(변수 만들어서)더하기	
		int money = 1_000_000;
		int cost = 0;
		int father = 40;
		int mother = 36;
		int daughter = 11;
		int adultOnewayFlightFare = 300_000;
		int kidOnewayFlightFare = 120_000;
		int[] arr = {father, mother, daughter};
		
//		//풀이1
//		if (father >= 19) {
//			cost += adultOnewayFlightFare;
//		}
//		else {
//			cost += kidOnewayFlightFare;
//		}
//		
//		if (mother >= 19) {
//			cost += adultOnewayFlightFare;
//		}
//		else {
//			cost += kidOnewayFlightFare;
//		}
//		if (daughter >= 19) {
//			cost += adultOnewayFlightFare;
//		}
//		else {
//			cost += kidOnewayFlightFare;
//		}
//		
//		if (cost <= money) {
//			System.out.println("여행가자!");
//		}
//		else {
//			System.out.println("다음에 가자 ㅠㅠ");
//		}
		
		
		for (int i = 0; i<arr.length; i++) {
			if ( arr[i] >= 19) {
				cost += adultOnewayFlightFare;
			} 
			else {
				cost += kidOnewayFlightFare;
			}
		}
		
		if (cost <= money) {
			System.out.println("여행가자!");
		}
		else {
			System.out.println("다음에 가자 ㅠㅠ");
		}
		
		/* 풀이2
		int adult = 0;
		int kid = 0;
		if(father >= 19) {
			adult++;
		}
		else {
			kid++;
		}
		if(mother >= 19) {
			adult++;
		}
		else {
			kid++;
		}

		if(daughter >= 19) {
			adult++;
		}
		else {
			kid++;
		}
		
		cost += adult * adultOnewayFlightFare
		cost += kid * kidOnewayFlightFare

		if (cost <= money) {
			System.out.println("여행가자!");
		}
		else {
			System.out.println("다음에 가자 ㅠㅠ");
		}*/
	    
		
//		 풀이3 : 삼항연산자로 푸는 방법
//		 father의 값이 19보다 크거나 같다면 adultOnewayFlightFare를 할당하고, 
//		 그렇지 않다면 kidOnewayFlightFare를 할당한다. 
//		 삼항연산자 문법 - 조건? 조건이 true일때 값 : 조건이 false일때 값
		int flightFare = 0;
		flightFare += father >= 19 ? adultOnewayFlightFare : kidOnewayFlightFare;
		flightFare += mother >= 19 ? adultOnewayFlightFare : kidOnewayFlightFare;
		flightFare += daughter >= 19 ? adultOnewayFlightFare : kidOnewayFlightFare;

		if(flightFare <= money) {
			System.out.println("여행가자!");
		}
		else {
			System.out.println("다음에 가자ㅠㅠ");
		}
	}

}
