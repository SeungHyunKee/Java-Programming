package vending_machine;

public class VendingMachine {

	// Ŭ������� (������)
	/**
	 * �ѹ��� �����Ҽ��ִ� ��ǰ�� ��
	 */
	public static final int PRODUCT_COUNT; // �ѹ��� ������ �� �ִ� ��ǰ�� �� = 1�� ��� ������ ������
	public static final String MACHINE_NAME;
	
	//Ŭ���� ����� ���� �Ҵ��ϴ� ���
	// -> static block
	static {
		// static����, ����� ���� �ʱ�ȭ �ϴ� ����
		PRODUCT_COUNT = 1;
		MACHINE_NAME = "���Ǳ�";
	}
	
	// -> �̰Ÿ� �ٸ������� ����Ҷ� : VendingMachine.MACHINE_NAME
	
	//��� �ڸ� (Ŭ���� �ٷι�, �빮�ڷ� �ۼ�)
//	final int PRICE = 1300;
		
	// ������� �ڸ�
	/**
	 * ��ǰ ����
	 */
//	int productQuantity; // �� �ڵ� ��� ���� �ڵ�� ���
	private Product product;
	
	/**
	 * ��
	 */
	private int money;

	
	//Getter�����
	public Product getProduct() {
		return this.product;
	}
	public int getMoney() {
		return this.money;
	}
	
	
	// ������ �ڸ� (�����ڴ� ��ȯŸ���� ���� ����)
	// ���� �ȳ־��ٰ��, 100_000 �� ����� ���Ǳ� ������
		/**
		 * VendingMachine�� �ν��Ͻ��� �����Ҷ� ȣ���
		*/
	public VendingMachine() {
		this(100_000);
		System.out.println("���Ǳ� �ν��Ͻ��� ��������ϴ�!");
		// �����ڰ� ������� �ν��Ͻ��� ��������� ���� �Ҵ��Ѵ� (=�ʱ�ȭ)
//		this.productQuantity = 10;
//		this.product = new Product();
//		this.product.setName("�����ݶ�");
//		this.product.setPrice(1600);
//		this.product.setQuantity(50);
//
//		this.money = 100_000;
//		
		/*
		 * �����ڸ� ���� ����� ����
		 * 1. ��������� �ʱ�ȭ �ϱ� ����(��������� �⺻���� ������ �Ҵ��� �ϱ� ����)
		 *   - Ư��, Reference Type ���ַ� �ʱ�ȭ
		 * 	    - ex) �迭, �÷��� 
		 * 2. �ν��Ͻ� ������ ���ÿ� �ٸ� �޼ҵ带 ȣ���ϱ� ���ؼ� ���
		 *   - ex) �ν��Ͻ��� �����԰� ���ÿ� insertMoney�޼ҵ带 ȣ���ϱ� ����
		 */
	}
	
	//������ �����ε�
	// ���� �־��� ���, ����ŭ ���� ����� ���Ǳ� ������
	public VendingMachine(int money) {
		this.money = money;
		
		this.product = new Product();
		this.product.setName("�����ݶ�");
		this.product.setPrice(1600);
		this.product.setQuantity(50);
		
	}
	
	
	//���
	/**
	 * ���� �ִ´�
	 * @param customer ���� ������
	 */
	
//	public void insertMoney(Customer customer) {
//		this.money += this.PRICE; // ���Ǳ� �� ������Ŵ //���⼭ this = drinkMachine 
//		customer.pay(this.PRICE); // ���� �������� PRICE��ŭ ����
//	}
	public void insertMoney(Customer customer) {
		this.money += this.product.getPrice(); // ���Ǳ� �� ������Ŵ //���⼭ this = drinkMachine 
		customer.pay(this.product.getPrice()); // ���� �������� PRICE��ŭ ����
		// �� �ν��Ͻ��� product���� getPrice()���� �����Ͷ�
	}
		
		/**
		 * ��ư�� ������, ��� PRODUCT_COUNT�� ���� 1���� �Ĵ°�
		 * @param customer ��ư�� ���� ��
		 */
	public void pressButton(Customer customer) {
//		// ���Ǳ⿡ ��ǰ�� ���»���
////		if (productQuantity <= 0) {
//		if(this.product.getQuantity() <= 0) {
//			return; //�޼ҵ� �������
//		}
//	
////		this.productQuantity--;
////		this.product.quantity--;
//		int quantity = this.product.getQuantity();
//		quantity--;
//		
//		quantity -= VendingMachine.PRODUCT_COUNT;  //��ǰ�� 1�� �Ȱڴٴ� ��
//		this.product.setQuantity(quantity);
//		customer.addStock(this.product.getName(), this.product.getPrice());
		
		// ���� �ڵ�� �Ʒ� ���ٷ� �޼ҵ�ü�̴� �Ҽ�����
		this.pressButton(customer, VendingMachine.PRODUCT_COUNT);
	}

	//�޼ҵ� �����ε�
	// orderCount�� ���� �� �� ��ŭ �Ĵ°�
	public void pressButton(Customer customer, int orderCount) {
		// ���Ǳ⿡ ��ǰ�� ���»���
		if(this.product.getQuantity() <= 0) {
			return; //�޼ҵ� �������
		}
	
		int quantity = this.product.getQuantity();
		//quantity--;
		quantity -= orderCount;  //��ǰ�� 1�� �Ȱڴٴ� ��
		this.product.setQuantity(quantity);
		
		customer.addStock(this.product.getName(), this.product.getPrice(), orderCount);
			
	
		
	}

}
