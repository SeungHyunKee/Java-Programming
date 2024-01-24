package vending_machine;

public class Customer {
	/**
	 * ���� ���� �� (������� = �Ķ������� ����)
	 */
	private int wallet;
		
	/**
	 * ���̰��� ��ǰ����
	 */
	//int stock;
	// ���Ǳ�� ������ ���� ���� Ÿ������ �ۼ�����
	private Product product;	
	
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
		
	//Getter�����
		public int getWallet() {
			return this.wallet;
		}
		public Product getProduct() {
			return this.product;
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
		
		// ���� �����ö��� Getter
		if(this.product.getName() == null) {
			// ���̰��� ��ǰ�������� �����ݶ�� ä����
			
//			this.product.name = name;
//			this.product.price = price;
//			this.product.quantity = 1;
			
			// ���� �Ҵ��Ҷ��� Setter
			this.product.setName(name);
			this.product.setPrice(price);
//			this.product.setQuantity(1);
			this.product.setQuantity(VendingMachine.PRODUCT_COUNT);
		}
		// ���� �����ݶ� ���������� �ִٸ�(= null�� �ƴ϶��) -> (�������� �ִٸ� ������ ������Ŵ)
		else {
			// ���̰��� �����ݶ��� ������ 1�� ���� ��Ŵ
			//this.product.quantity++; -> �Ʒ�3�ٷ� Ǯ� ��
			int quantity = this.product.getQuantity();
//			quantity++;
			quantity += VendingMachine.PRODUCT_COUNT;
			this.product.setQuantity(quantity);
			
		}
		
	}

}
