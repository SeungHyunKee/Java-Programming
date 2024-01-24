package vending_machine_explain;

public class Customer {

	/**
	 * ���� ���� �� (������� = �Ķ������� ����)
	 */
	int wallet;
		
	/**
	 * ���̰��� ��ǰ����
	 */
	Product product;
	
	/**
	 * ������
	 */ 
	public Customer(int wallet) {  // ���������� wallet, stock = �Ķ����
		// musk�� ���ϴ� this�� �ٿ���ߵ�
		// �����ڿ��� this�� �ǹ� : �����ڰ� ������� �ν��Ͻ�
		this.wallet = wallet; // �����ڰ� ������� musk�� wallet�� �Ķ���ͷ� ���� wallet(200_000)�� �־��
		this.product = new Product(); // �̻��¿����� ������ ��ٱ��϶�� ����(�ƹ��͵� ���� ����(�Ʒ� �߰��ڵ� �Ⱦ���))
	}
		
	
	/**
	 * �����Ѵ� - price�� �Ķ���ͷ� �޾ƿ�
	 */
	public void pay(int price) {
		// ���� ���� �������ִ� �� - ����(�����ݶ�) ���� < 0 �̸� ���� �Ұ����ϹǷ� �޼ҵ� �������
		if ( this.wallet - price <= 0) {
				return; //�޼ҵ� �������
		}
		this.wallet -= price; // �ƴ϶��, ���� ������ ���Ǳݾ׸��� ���ֱ�
	}
		
	/**
	 * ���� stock�� ��ǰ�� �ϳ� �����Ѵ�
	 */
	public void addStock(String name, int price) {
		// ���� �����ݶ� ������ ���� �ִ��� Ȯ�� (�������� ���ٸ� ������ �� ������ ������Ŵ)	
		// ���� �����ݶ� ���������� ���ٸ�
		if(this.product.name == null) {
			// ���̰����� �ִ� ��ǰ�� ������ �����ݶ� ���� ������ ä����
			this.product.name = name; //�����ݶ�
			this.product.price = price; //1600
			this.product.quantity = 1; //���� stock +1
		}
		// ���� �����ݶ� ���������� �ִٸ�(= null�� �ƴ϶�� = �������� �ִٸ�) -> ������ ������Ŵ
		else {
			this.product.quantity++; // ���̰��� �����ݶ��� ������ 1�� ���� ��Ŵ
		}
		
	}

}
