package generic_vending_machine;

public class Customer {

	/**
	 * ���� ���� ��
	 */
	private int wallet;
	
	/**
	 * ���� ���� ��ǰ�� ����
	 */
//	int stock;
	private Product[] productArray;
	
	public int getWallet() {
		return this.wallet;
	}
	
	public Product[] getProductArray() {
		return this.productArray;
	}
	
	/**
	 * ������.
	 */
//	public Customer(int wallet, int stock) {
	public Customer(int wallet) {
		this.wallet = wallet;
//		this.stock = stock;
		this.productArray = new Product[3];
	}
	
	/**
	 * �����Ѵ�.
	 */
	public void pay(int price) {
		if (this.wallet - price <= 0) {
			return; // �޼ҵ� ��� ����
		}
		this.wallet -= price;
	}
	
	/**
	 * ȯ�� �޴´�.
	 * @param money ȯ�� ���� �ݾ�
	 */
	public void addMoney(int money) {
		this.wallet += money;
	}
	
	/**
	 * ��ǰ�� �ϳ� �����Ѵ�.
	 */
	public void addStock(String name, int price, int productCount) {
		
		// ���� ��� ������ ��ǰ�� ���� ��ǰ���(this.productArray)�� �ִ��� Ȯ���Ѵ�.
		// �ִٸ�, productCount��ŭ ������ ������Ų��.
		// ���ٸ�, ����ִ� �ε����� ã�Ƽ� ���Ӱ� �Ҵ��� �ش�.
		Product product = this.getProductByName(name);
		
		if (product != null) {
			int quantity = product.getQuantity();
			quantity += productCount;
			product.setQuantity(quantity);
		}
		else {
			int nullIndex = this.getNullIndex();
			if (nullIndex >= 0) {
				this.productArray[nullIndex] = new Product();
				this.productArray[nullIndex].setName(name);
				this.productArray[nullIndex].setPrice(price);
				this.productArray[nullIndex].setQuantity(productCount);
			}
		}
	}
	
	protected Product getProductByName(String name) {
		for ( Product product : this.productArray) {
			if ( product != null && product.getName().equals(name) ) {
				return product;
			}
		}
		
		return null;
	}
	
	private int getNullIndex() {
		for ( int i = 0; i < this.productArray.length; i++ ) {
			if (this.productArray[i] == null) {
				return i;
			}
		}
		
		return -1;
	}
	
	public void printProducts() {
		System.out.println("���� �ܾ�: " + this.wallet);
		for ( Product product : this.productArray ) {
			if ( product != null ) { //���ڵ尡 ���ٸ� nullpointerexception �߻��Ұ�. (�ƹ��͵� �Ȼ� ���� ����������)
				System.out.println("���� ��ǰ ����: " + product.getQuantity());
				System.out.println("���� ��ǰ �̸�: " + product.getName());
			}
		}
	}
	
}