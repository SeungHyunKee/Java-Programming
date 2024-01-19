package hello_java_world;

public class OperatorExam {

	public static void main(String[] args) {
		//1. 변수 a의 값이 10보다 크고 20보다 작은가?
		int a = 10;
		boolean is11To19 = a > 10 && a < 20;
		System.out.println(is11To19); // false
		
		//2. 변수 b는 짝수인가?
		int b = 12345;
		boolean isEven = b % 2 == 0;
		System.out.println(isEven); // false

		//3. 변수 c는 0보다 큰 짝수인가?
		int c = - 4576;
		boolean isEven2 = c > 0 && c % 2 == 0;
		System.out.println(isEven2); // false
		
		//4. 변수 d의값은 2또는 5의 배수인가?
		int d = 35;
		boolean isMultiple2Or5 = d % 2 == 0 || d % 5 == 0;
		System.out.println(isMultiple2Or5); //true
		
		//5. son은 부모님과 함께 12세 이상 관람과의 영화를 볼수있나?
		int son = 7;
		int parent = 40;
		boolean isAvailable = son >= 12 || parent >= 12;
		System.out.println(isAvailable); //true
		
		// 6. 변수 e의 값은 3의 배수가 아닌가?
		int e = 35;
		boolean isNotMultiple3 = e % 3 != 0; //방법1
		System.out.println(isNotMultiple3); //true
		
		isNotMultiple3 = !(e % 3 == 0);   //방법2
		System.out.println(isNotMultiple3); //true

 

	}

}
