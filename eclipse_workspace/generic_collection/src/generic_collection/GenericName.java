package generic_collection;
/**
 * ScoreList를 사용할 클래스
 */
public class GenericName {

	public static void main(String[] args) {
		//만든 제네릭을 전달하지않으면, score.add 했을때 전부 최상위 클래스인 object가 뜸
		// 반드시 제네릭을 타입옆에 명시해주기 
		// (클래스명이 있다면 바로옆에 명시해주기, 단 17이후로는 생성자쪽에서는 생략가능)
		// 단, 좌측에는 반드시 명시해줘야됨 (우측생성자에는 생략 후 <>만 작성)
		ScoreList<Integer> score = new ScoreList<>();
		//Integer 이라는 클래스타입이 -> ScpreList의 T값 전부에게 전달됨
		score.add(100);
		score.add(90);
		score.add(80);
		score.add(70);
		score.add(60);
		
		//Integer score1 = score.get(0); //<- 이 이론적으로는 맞지만, 
		// Integer와 int는 동일한 것이므로 int로 작성
		int score1 = score.get(0);
		int score2 = score.get(1);
		int score3 = score.get(2);
		int score4 = score.get(3);
		int score5 = score.get(4);
		
		System.out.println(score1);
		System.out.println(score2);
		System.out.println(score3);
		System.out.println(score4);
		System.out.println(score5);
		
		int size = score.size();
		System.out.println(size);
		
		System.out.println(score);
	}
	
}
