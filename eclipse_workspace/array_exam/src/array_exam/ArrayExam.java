package array_exam;

public class ArrayExam {

	public static void main(String[] args) {
		int[] scoreArray = new int[7];
		
		System.out.println(scoreArray); // [I@49097b5d
        // [I@49097b5d : [ = �迭�̴�, I = int Ÿ���̴�, @49097b5d = �ؽð�
		
		// scoreArray = 560; // �̷������� ���� �� ���� ����. �迭�� �ݵ�� �ε����� �����ؼ� �� �۴��ϰ� ��ȸ��
		scoreArray[0] = 1;
		scoreArray[1] = 2;
		scoreArray[2] = 3;
		scoreArray[3] = 4;
		scoreArray[4] = 5;
		scoreArray[5] = 6;
		scoreArray[6] = 7;
		System.out.println(scoreArray); // [I@49097b5d (�迭�� �޸𸮰� ��ü��)
		//���� �˰������
		System.out.println(scoreArray.length); //7, length : �迭�� �������
		//������ �Ҵ��������
		int score = scoreArray[4];
		System.out.println(score); // 5

		
		
		//�迭��ȸ(for)
		
		//for������� ��� 1. (�ʱⰪ; �ݺ�����üũ; ������) {...}
		// �ݺ��� �Ҷ� �ݺ����ȿ��� index ��ȣ�� �ʿ��� ��� ���
		int sum = 0;
		for(int i = 0; i < scoreArray.length; i++) {
			System.out.println(scoreArray[i]);
			sum += scoreArray[i];
			System.out.println(sum);
		}
		System.out.println(sum);

		//for������� ��� 2. for-each (����for)
		//���� : for(������Ÿ��(=�迭���ִ� Ÿ��) �����ۺ����� : �迭)
		// �ݺ��� �Ҷ� �ݺ����ȿ��� index ��ȣ�� �ʿ���� ��� ���
		for(int score2 : scoreArray) { // �迭�� �ִ� ���� score2�� �־���
			System.out.println("for-each: " + score2);
//			for-each: 1
//			for-each: 2
//			for-each: 3
//			for-each: 4
//			for-each: 5
//			for-each: 6
//			for-each: 7
		}
		
		
		
		// String �迭
		String[] names = new String[3];
		System.out.println(names); //[Ljava.lang.String;@6e2c634b
		names[0] = "���";
		names[1] = "�ٳ���";
		//�迭�ǰ��� ������ �̾ƿ�����, StringŸ���� ������ ����������
		String name = names[1];
		System.out.println(name); //�ٳ���
		
		//�迭�� ����� ���� Ÿ���� ����. �迭Ÿ�Ե� �迭�� ����� ����!
		// �迭�� ��ȸ�Ҷ�, index�� ������ �ϹǷ� �迭�� Ÿ�԰� ������� for���ȿ��� int �������
		for (int i = 0; i <names.length; i++) {
			System.out.println(names[i]);
//			 ���
//			 �ٳ���
//			 null
			
		}
		
		//for-each
		for(String name2 : names) {
			System.out.println("for-each: " + name2);
//			for-each: ���
//			for-each: �ٳ���
//			for-each: null
		}
		
	}

}
