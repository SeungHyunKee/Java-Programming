package hello_java_world;

public class FamilyTravel {

	public static void main(String[] args) {
	// �Ƶ��� ���� �����ϴ� ���� : 19��
	// ���ΰ� �Ƶ� ���� -> ���(���� ����)���ϱ�	
		int money = 1_000_000;
		int cost = 0;
		int father = 40;
		int mother = 36;
		int daughter = 11;
		int adultOnewayFlightFare = 300_000;
		int kidOnewayFlightFare = 120_000;
		int[] arr = {father, mother, daughter};
		
//		//Ǯ��1
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
//			System.out.println("���డ��!");
//		}
//		else {
//			System.out.println("������ ���� �Ф�");
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
			System.out.println("���డ��!");
		}
		else {
			System.out.println("������ ���� �Ф�");
		}
		
		/* Ǯ��2
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
			System.out.println("���డ��!");
		}
		else {
			System.out.println("������ ���� �Ф�");
		}*/
	    
		
//		 Ǯ��3 : ���׿����ڷ� Ǫ�� ���
//		 father�� ���� 19���� ũ�ų� ���ٸ� adultOnewayFlightFare�� �Ҵ��ϰ�, 
//		 �׷��� �ʴٸ� kidOnewayFlightFare�� �Ҵ��Ѵ�. 
//		 ���׿����� ���� - ����? ������ true�϶� �� : ������ false�϶� ��
		int flightFare = 0;
		flightFare += father >= 19 ? adultOnewayFlightFare : kidOnewayFlightFare;
		flightFare += mother >= 19 ? adultOnewayFlightFare : kidOnewayFlightFare;
		flightFare += daughter >= 19 ? adultOnewayFlightFare : kidOnewayFlightFare;

		if(flightFare <= money) {
			System.out.println("���డ��!");
		}
		else {
			System.out.println("������ ���ڤФ�");
		}
	}

}
