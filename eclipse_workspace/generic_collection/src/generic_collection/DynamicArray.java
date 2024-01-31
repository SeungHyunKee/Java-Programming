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
		//scoreArray�� �� �ϳ��� �� �������� ��� �ؾ� �ϳ�?
		// �б��� �л� : 10��, ������ �л� 10���� �л������� �����ϰ��־���
		// int[] scoreArray = new int[10]; �̶�� ������
		// �бⰡ ����Ǳ� ���� 1���� �л��� ������ �Դ�. 
		// -> 11���� �л������� �����ؾ��Ѵ� -> ��� �ؾ��ұ�?
		
		//���1. ����
		int[] scoreArray2 = new int[scoreArray.length + 1];
//		scoreArray2 = scoreArray;
		
		/*
		 * �迭�� ������ �߰��ϴ� ���
		*/
		// System.arraycopy (�����迭, �����迭���� ���°���� �����Ұ���, �����迭�� ���� ���ο� �迭, 
		// ���ο�迭�� ���°���� �����Ұ��ΰ�, �����迭���� ������ �����Ұ�����)
		System.arraycopy(scoreArray, 0, scoreArray2, 0, scoreArray.length); //�Ʒ� 3���� ���ٷ� ó��
		for(int i = 0; i < scoreArray.length; i++) {
			scoreArray2[i] = scoreArray[i];
		}
		
		for(int score : scoreArray2) {
			System.out.println(score);
		}
		
		System.out.println(scoreArray2.length); // 1
		// �迭�� ���۷���Ÿ��, ���۷���Ÿ���� �޸𸮸� ���ٴϹǷ� �޸� ��ü�� �����Ѱ�
		// ��, �޸��ε��� �Ѱ��� socreArray2�� �������ذ� (int[] scoreArray2 = new int[2];)

		//���2. ����
		scoreArray2[0] = scoreArray[0];
		System.out.println(scoreArray2.length); //2
		System.out.println(scoreArray[0]);	//100	
		System.out.println(scoreArray2[0]); //100
		
		scoreArray2[0] = 99;
		System.out.println(scoreArray[0]);	//100	
		System.out.println(scoreArray2[0]); //99

		
		
	}
}
