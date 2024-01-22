package Hello.java;

/**
 * ������� ���
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
			System.out.println("���డ��!");
		}
		else {
			System.out.println("���������ڤФ�");
		}
	}
}
