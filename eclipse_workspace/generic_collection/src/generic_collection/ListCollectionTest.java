package generic_collection;

import java.util.List;
import java.util.ArrayList;

public class ListCollectionTest {

	public static void main(String[] args) {
		List<Integer> scoreList = new ArrayList<>();
		//1.List�� ������ �߰�
		scoreList.add(100);
		scoreList.add(90);
		scoreList.add(80);
		scoreList.add(70);
		scoreList.add(60);
		System.out.println(scoreList); //[100, 90, 80, 70, 60]
		System.out.println(scoreList.size()); //5
		
		//2.List ������ ��ȸ - �����Ͱ������� : get
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
		
		//3.List �ݺ������� ��ȸ
		for (int i = 0; i<scoreList.size(); i++) {
			score = scoreList.get(i);
			System.out.println(score);  // 2�� ��°���� ����. 2���ڵ带 ª���Ѱ�
		}
		
		//4. List ������ ����
		//ArrayList�� removeƯ¡ : 3���ε����� ��������, �ε���4�� 3���� �ٲ�.
		// �ε���5�� 4, �ε���6�� 5�� �ٲ� (= �ε����� �ϳ��� ������)
		scoreList.remove(3);
		System.out.println(scoreList); // [100, 90, 80, 60]
		System.out.println(scoreList.size()); // 4
		
		//5. List ������ ��λ��� - scoreList ���δ� ����. = �ִ� ������ ���� ������
		scoreList.clear();
		System.out.println(scoreList); //[]
		System.out.println(scoreList.size()); //0
		
		//6. List�� ����ִ��� Ȯ��
		System.out.println(scoreList.isEmpty()); //��������Ƿ� true
		System.out.println(scoreList);  //[]
		System.out.println(scoreList.size()); //0
		
		//7.�� ���翩�� Ȯ��
		if ( ! scoreList.contains(90) ) { //scoreList�� 90�� ���ٸ� ���� �־��
			scoreList.add(90); // ����ִ� ����Ʈ�����̹Ƿ�, 90�� �����Ƿ� �����
		}
		System.out.println(scoreList);  //[90]
		System.out.println(scoreList.size()); //1
		
		//8.����Ʈ ����
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
