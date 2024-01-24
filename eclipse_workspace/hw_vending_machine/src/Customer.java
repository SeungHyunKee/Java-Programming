package vending_machine;

public class Customer {
	/**
	 * ���� ���� �� (������� = �Ķ������� ����)
	 */
	int wallet;
		
	/**
	 * ���̰��� ��ǰ����
	 */
	//int stock;
	// ���Ǳ�� ������ ���� ���� Ÿ������ �ۼ�����
	Product product;
	
	
	/**
	 * ������
	 */
	//public Customer(int wallet, int stock) { // ���������� wallet, stock = �Ķ���� 
	public Customer(int wallet) { 
		// musk�� ���ϴ� this�� �ٿ���ߵ�
		// �����ڿ��� this�� �ǹ� : �����ڰ� ������� �ν��Ͻ�
		this.wallet = wallet; // �����ڰ� ������� wallet�� �Ķ���ͷ� ���� wallet�� �־��
		//this.stock = stock;
		this.product = new Product(); // �̻��¿����� ������ ��ٱ��϶�� �����ϱ�(�ƹ��͵� ���� ����(�Ʒ� �߰��ڵ� �Ⱦ���))
	}
		
	
	/**
	 * �����Ѵ� - price�� �Ķ���ͷ� �޾ƿ�
	 */
	public void pay(int price) {
		if ( this.wallet - price <= 0) {
				return; //�޼ҵ� �������
		}
		this.wallet -= price;
	}
		
	/**
	 * ��ǰ�� �ϳ� �����Ѵ�
	 */
	public void addStock(String name, int price) {
		//this.stock++;
		// ���� �����ݶ� ������ ���� �ִ��� Ȯ�� (�������� ���ٸ� ������ �� ������ ������Ŵ)	
		// ���� �����ݶ� ���������� ���ٸ�
		if(this.product.name == null) {
			// ���̰��� ��ǰ�������� �����ݶ�� ä����
			this.product.name = name;
			this.product.price = price;
			this.product.quantity = 1;
		}
		// ���� �����ݶ� ���������� �ִٸ�(= null�� �ƴ϶��) -> (�������� �ִٸ� ������ ������Ŵ)
		else {
			// ���̰��� �����ݶ��� ������ 1�� ���� ��Ŵ
			this.product.quantity++;
		}
		
	}


}
