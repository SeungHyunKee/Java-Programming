package generic_collection;

public class DynamicArray {

	public static void main(String[] args) {
		
		int[] scoreArray = new int[10];
		scoreArray[0] = 100;
		scoreArray[1] = 90;
		scoreArray[2] = 80;
		scoreArray[3] = 70;
		scoreArray[4] = 60;
		scoreArray[5] = 50;
		scoreArray[6] = 40;
		scoreArray[7] = 30;
		scoreArray[8] = 20;
		scoreArray[9] = 10;
		//scoreArray에 값 하나를 더 넣으려면 어떻게 해야 하나?
		// 학급의 학생 : 10명, 선생은 학생 10명의 학생점수를 관리하고있었다
		// int[] scoreArray = new int[10]; 이라고 썼을것
		// 학기가 종료되기 전에 1명의 학생이 전학을 왔다. 
		// -> 11명의 학생점수를 관리해야한다 -> 어떻게 해야할까?
		
		//방법1. 실패
		int[] scoreArray2 = new int[scoreArray.length + 1];
//		scoreArray2 = scoreArray;
		
		/*
		 * 배열에 데이터 추가하는 방법
		*/
		// System.arraycopy (원본배열, 원본배열에서 몇번째부터 복사할건지, 원본배열을 받을 새로운 배열, 
		// 새로운배열의 몇번째부터 복사할것인가, 원본배열에서 어디까지 복사할것인지)
		System.arraycopy(scoreArray, 0, scoreArray2, 0, scoreArray.length); //아래 3줄을 한줄로 처리
		for(int i = 0; i < scoreArray.length; i++) {
			scoreArray2[i] = scoreArray[i];
		}
		
		for(int score : scoreArray2) {
			System.out.println(score);
		}
		
		System.out.println(scoreArray2.length); // 1
		// 배열은 레퍼런스타입, 래퍼런스타입은 메모리를 들고다니므로 메모리 자체를 복사한것
		// 즉, 메모리인덱스 한개를 socreArray2에 전달해준것 (int[] scoreArray2 = new int[2];)

		//방법2. 성공
		scoreArray2[0] = scoreArray[0];
		System.out.println(scoreArray2.length); //2
		System.out.println(scoreArray[0]);	//100	
		System.out.println(scoreArray2[0]); //100
		
		scoreArray2[0] = 99;
		System.out.println(scoreArray[0]);	//100	
		System.out.println(scoreArray2[0]); //99

		
		
	}
}
