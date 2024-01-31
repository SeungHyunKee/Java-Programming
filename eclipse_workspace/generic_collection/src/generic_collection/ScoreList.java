package generic_collection;

public class ScoreList<T> {
	
	/**
	 * ScoreList�� ������ �迭
	 */
	private Object[] scoreArray;
	
	/**
	 * �迭 ���� ����ִ� �����۵��� �� <br/>
	 * �迭�� ���̿ʹ� ���谡 ����.
	 */
	private int size;
	
	/**
	 * ������
	 */
	public ScoreList() {
		this.scoreArray = new Object[2];
	}
	
	/**
	 * scoreArray�迭�� ���� �߰��Ѵ�.
	 * add(T score)�� ȣ�� �� ������ size 1�� ������
	 * @param score ���׸��� �Ҵ�� Ÿ���� �ν��Ͻ� Ȥ�� ��
	 */
	public void add(T score) {
		if ( size >= this.scoreArray.length) {
			Object[] tempScoreArray = new Object[scoreArray.length + 2];
			System.arraycopy(scoreArray, 0, //0��° this.scoreArray�� ����
							 tempScoreArray, 0, // tempScoreArray�� 0��°�� copy�Ѵ�
							 scoreArray.length);
			//(�����迭, �����迭���� ���°���� �����Ұ���, �����迭�� ���� ���ο� �迭, 
			// ���ο�迭�� ���°���� �����Ұ��ΰ�, �����迭���� ������ �����Ұ�����)
			scoreArray = tempScoreArray; // temoScoreArray�� �޸𸮸� this.scoreArray�� �ٲ��
		}
		scoreArray[size] = score; //scoreArray�� [0]�� �ε����� score�� �־��
		size += 1;
	}
	
	/**
	 * scoreArray�迭���� index�� �Ҵ�� �� ��ȯ
	 * @param index ��ȯ��ų �迭�� �ε���
	 * @return �ε����� ����ִ� �ν��Ͻ� Ȥ�� ��
	 */
	public T get(int index) {
//		return null; //�ƹ�ư T�� ���۷���Ÿ���̱�x���� null return
		if (index >= this.size) {
			throw new IndexOutOfBoundsException(index);
		}
		return (T) this.scoreArray[index];
	}
	
	/**
	 * scoreArray �迭�� �ν��Ͻ� Ȥ�� ���� ����ִ� ����
	 * ��)
	 * <pre>
	 *   int[] scoreArray = new int[100];
	 *   scoreArray[0] = 100;
	 *   scoreArray[1] = 100;
	 *   size()����� 2 ��ȯ��
	 * </pre>
	 * @return scoreArray �迭�� �ν��Ͻ� Ȥ�� ���� ����ִ� ����
	 */
	public int size() {
		return this.size;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("ScoreList[");
		for(int i = 0; i < size; i++) { //�����Ͱ� �ִ¸�ŭ�� �ݺ��ϱ� ����
			sb.append(scoreArray[i] + ",");
		}
		sb.append("]");
		
		return sb.toString();
	}
}
