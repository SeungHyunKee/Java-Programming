package array_exam;

public class ArrayExam {

	public static void main(String[] args) {
		int[] scoreArray = new int[7];
		
		System.out.println(scoreArray); // [I@49097b5d
        // [I@49097b5d : [ = 배열이다, I = int 타입이다, @49097b5d = 해시값
		
		// scoreArray = 560; // 이런식으로 값을 줄 수는 없음. 배열은 반드시 인덱스로 접근해서 값 핼당하고 조회함
		scoreArray[0] = 1;
		scoreArray[1] = 2;
		scoreArray[2] = 3;
		scoreArray[3] = 4;
		scoreArray[4] = 5;
		scoreArray[5] = 6;
		scoreArray[6] = 7;
		System.out.println(scoreArray); // [I@49097b5d (배열의 메모리값 자체임)
		//길이 알고싶으면
		System.out.println(scoreArray.length); //7, length : 배열의 멤버변수
		//변수값 할당받으려면
		int score = scoreArray[4];
		System.out.println(score); // 5

		
		
		//배열순회(for)
		
		//for문만들기 방법 1. (초기값; 반복조건체크; 증감식) {...}
		// 반복을 할때 반복문안에서 index 번호가 필요한 경우 사용
		int sum = 0;
		for(int i = 0; i < scoreArray.length; i++) {
			System.out.println(scoreArray[i]);
			sum += scoreArray[i];
			System.out.println(sum);
		}
		System.out.println(sum);

		//for문만들기 방법 2. for-each (향상된for)
		//문법 : for(아이템타입(=배열에있는 타입) 아이템변수명 : 배열)
		// 반복을 할때 반복문안에서 index 번호가 필요없는 경우 사용
		for(int score2 : scoreArray) { // 배열에 있는 값을 score2에 넣어줌
			System.out.println("for-each: " + score2);
//			for-each: 1
//			for-each: 2
//			for-each: 3
//			for-each: 4
//			for-each: 5
//			for-each: 6
//			for-each: 7
		}
		
		
		
		// String 배열
		String[] names = new String[3];
		System.out.println(names); //[Ljava.lang.String;@6e2c634b
		names[0] = "사과";
		names[1] = "바나나";
		//배열의값을 변수로 뽑아오려면, String타입의 변수를 만들어줘야함
		String name = names[1];
		System.out.println(name); //바나나
		
		//배열로 만들수 없는 타입은 없음. 배열타입도 배열로 만들수 있음!
		// 배열을 순회할때, index를 가지고 하므로 배열의 타입과 상관없이 for문안에는 int 써줘야함
		for (int i = 0; i <names.length; i++) {
			System.out.println(names[i]);
//			 사과
//			 바나나
//			 null
			
		}
		
		//for-each
		for(String name2 : names) {
			System.out.println("for-each: " + name2);
//			for-each: 사과
//			for-each: 바나나
//			for-each: null
		}
		
	}

}
