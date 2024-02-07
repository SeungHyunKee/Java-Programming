package fp_java.ch01anonymousclass;

public interface Computable {
	
	public int add(int num1, int num2);
	
	// public void printMessage(); //�̷��ԵǸ� �߻�޼ҵ� 2���� �Ǳ⶧���� Computable Ŭ������ ���ٷ� ǥ���� �� ���Ե�
	// �߻�޼ҵ尡 �ݵ�� '1��' �� �����ؾ� ���ٷ� �� �� �����Ƿ� ���� �߻�޼ҵ尡 2���� �ȴٸ� ���ٷ� �� �� ����
	
	/**
	 * �������̽��� printMessage �⺻�ڵ带 �ۼ��� ��
	 * default Ű���带 ���� �տ� ���̸� (;�� ������ �ȵǰ�, �߰�ȣ{}�ݵ�� �־���ߵ�(�߰�ȣ �� ������ �Ƚᵵ ��))
	 * �������̽��� ����� ������ �� �ִ�
	 * implementable class���� overriding �����ϴ�
	 * overriding�� ������ ������ �⺻�ڵ尡 ���۵�
	 */
	default public void printMessage() {
		System.out.println("�⺻ �޽����Դϴ�.");
	}
}
