package Hello.java;

/**
 * 비행기요금 계산
 */
public class ReturnMethodQuiz5 {

	public static int getFlightFare(int age, int adultOneWayFlightFare, int kidOneWayFlightFare) {
		
		int money = 0;	
		if (age>=19) {
			money = adultOneWayFlightFare;
		}
		else {
			money = kidOneWayFlightFare;
		}
		return money;
	}
	
	public static void main(String[] args) {
		int money = 1_000_000;
		
		int father = 40;
		int mother = 36;
		int daughter = 11;
		
		int adultOneWayFlightFare = 300_000;
		int kidOneWayFlightFare = 120_000;
		
		int flightFare = getFlightFare(father, adultOneWayFlightFare, kidOneWayFlightFare);
		flightFare += getFlightFare(mother, adultOneWayFlightFare, kidOneWayFlightFare);
		flightFare += getFlightFare(daughter, adultOneWayFlightFare, kidOneWayFlightFare);
		

		if (flightFare <= money) {
			System.out.println("여행가자!");
		}
		else {
			System.out.println("다음에가자ㅠㅠ");
		}
	}
}
