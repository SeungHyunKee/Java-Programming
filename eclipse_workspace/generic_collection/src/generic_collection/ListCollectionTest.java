package generic_collection;

import java.util.List;
import java.util.ArrayList;

public class ListCollectionTest {

	public static void main(String[] args) {
		List<Integer> scoreList = new ArrayList<>();
		//1.List에 데이터 추가
		scoreList.add(100);
		scoreList.add(90);
		scoreList.add(80);
		scoreList.add(70);
		scoreList.add(60);
		System.out.println(scoreList); //[100, 90, 80, 70, 60]
		System.out.println(scoreList.size()); //5
		
		//2.List 데이터 조회 - 데이터가져오기 : get
		int score = scoreList.get(0);
		System.out.println(score); //100
		score = scoreList.get(1);
		System.out.println(score);	//90	
		score = scoreList.get(2);
		System.out.println(score);	//80
		score = scoreList.get(3);
		System.out.println(score);  //70
		score = scoreList.get(4);
		System.out.println(score); //60
		
//		score = scoreList.get(5); 
//		System.out.println(score);	//IndexOutOfBoundsException
		
		//3.List 반복데이터 조회
		for (int i = 0; i<scoreList.size(); i++) {
			score = scoreList.get(i);
			System.out.println(score);  // 2번 출력결과와 동일. 2번코드를 짧게한것
		}
		
		//4. List 데이터 삭제
		//ArrayList의 remove특징 : 3번인덱스가 지워지만, 인덱스4가 3으로 바뀜.
		// 인덱스5는 4, 인덱스6은 5로 바뀜 (= 인덱스가 하나씩 땡겨짐)
		scoreList.remove(3);
		System.out.println(scoreList); // [100, 90, 80, 60]
		System.out.println(scoreList.size()); // 4
		
		//5. List 데이터 모두삭제 - scoreList 전부다 지움. = 있던 데이터 전부 날려라
		scoreList.clear();
		System.out.println(scoreList); //[]
		System.out.println(scoreList.size()); //0
		
		//6. List가 비어있는지 확인
		System.out.println(scoreList.isEmpty()); //비어있으므로 true
		System.out.println(scoreList);  //[]
		System.out.println(scoreList.size()); //0
		
		//7.값 존재여부 확인
		if ( ! scoreList.contains(90) ) { //scoreList에 90이 없다면 값을 넣어라
			scoreList.add(90); // 비어있는 리스트상태이므로, 90이 없으므로 실행됨
		}
		System.out.println(scoreList);  //[90]
		System.out.println(scoreList.size()); //1
		
		//8.리스트 복사
		System.out.println(System.identityHashCode(scoreList)); //664740647
		System.out.println(scoreList);  //[90]
		System.out.println(scoreList.size()); //1
		
		List<Integer> scoreList2 = new ArrayList<>();
		scoreList2.addAll(scoreList);
		System.out.println(System.identityHashCode(scoreList2)); //804564176
		System.out.println(scoreList2);  //[90]
		System.out.println(scoreList2.size()); //1
	}
}
