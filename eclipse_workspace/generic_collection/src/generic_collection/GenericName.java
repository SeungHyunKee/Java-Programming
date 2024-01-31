package generic_collection;
/**
 * ScoreList�� ����� Ŭ����
 */
public class GenericName {

	public static void main(String[] args) {
		//���� ���׸��� ��������������, score.add ������ ���� �ֻ��� Ŭ������ object�� ��
		// �ݵ�� ���׸��� Ÿ�Կ��� ������ֱ� 
		// (Ŭ�������� �ִٸ� �ٷο��� ������ֱ�, �� 17���ķδ� �������ʿ����� ��������)
		// ��, �������� �ݵ�� �������ߵ� (���������ڿ��� ���� �� <>�� �ۼ�)
		ScoreList<Integer> score = new ScoreList<>();
		//Integer �̶�� Ŭ����Ÿ���� -> ScpreList�� T�� ���ο��� ���޵�
		score.add(100);
		score.add(90);
		score.add(80);
		score.add(70);
		score.add(60);
		
		//Integer score1 = score.get(0); //<- �� �̷������δ� ������, 
		// Integer�� int�� ������ ���̹Ƿ� int�� �ۼ�
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
