package abstract_vending_machine;

/**
 * ��� ���� Ŭ������ �߻� �޼ҵ尡 �����ϴ� �߻� Ŭ�������<br/>
 * �߻� �޼ҵ带 �� Ŭ�������� ������ ��Ű�ų�<br/>
 * �� Ŭ������ �߻� Ŭ������ ����� �־�� �Ѵ�.<br/>
 * <b>ȯ�� �Ұ����� ���Ǳ�</b>
 */
public class VendingMachine implements Sellable {

	/**
	 * ��ǰ ����
	 */
//	int productQuantity;
	private Product[] productArray;

	/**
	 * ��
	 */
	private int money;

	
	/*
	 * ������ ������ֱ�
	 */
	public VendingMachine() {
		// VendingMachine�� ������ �ִ� �� : 100_000
		this(100_000);
	}
	
	public VendingMachine(int money) {
		this.money = money;
		
		this.productArray = new Product[3];
		
		this.productArray[0] = new Product();
		this.productArray[0].setName("�������");
		this.productArray[0].setPrice(1600);
		this.productArray[0].setQuantity(50);
		
		this.productArray[1] = new Product();
		this.productArray[1].setName("�����ݶ�");
		this.productArray[1].setPrice(1500);
		this.productArray[1].setQuantity(30);
		
		this.productArray[2] = new Product();
		this.productArray[2].setName("���ν�������Ʈ");
		this.productArray[2].setPrice(1400);
		this.productArray[2].setQuantity(20);
	
	}
	
	
	@Override
	public Product[] getProductArray() {
		return this.productArray;
	}

	@Override
	public int getMoney() {
		return this.money;
	}

	@Override
	public void setMoney(int money) {
		this.money = money;

	}

	@Override
	public void insertMoney(Customer customer, String productName) {
		// this.productArray�� �ݺ��ϸ鼭 Product �ν��Ͻ��� ��ǰ�� Ȯ��.
		// Product �ν��Ͻ��� ��ǰ��� productName�� ������,
		// �ش� ��ǰ�� �������� ���Ǳ��� ���� ������Ű��
		// ���� ���� ���ҽ�Ų��.
		for (Product product : this.productArray) {
			if (product.equals(productName)) {
				this.money += product.getPrice();
				customer.pay(product.getPrice());
				break; // �ݺ��� �ߴ�.
			}
		}
	}

	@Override
	public void pressButton(Customer customer, String productName) {
		this.pressButton(customer, productName, VendingMachine.PRODUCT_COUNT);

	}

	@Override
	public void pressButton(Customer customer, String productName, int orderCount) {
		for (Product product : this.productArray) {
			if (product.equals(productName)) {

				if (product.getQuantity() <= 0) {
					this.refund(customer, product.getPrice());
					return; // �޼ҵ带 ����.
				}

				int quantity = product.getQuantity();
				quantity -= orderCount;
				product.setQuantity(quantity);

				customer.addStock(productName, product.getPrice(), orderCount);
				break;
			}
		}
	}
	
//	@Override
//	public void refund(Customer customer, int refundMoney) {
	protected void refund(Customer customer, int refundMoney) {
		System.out.println("��� �����ϴ�.");
		System.out.println("ȯ���� ���ص����.");
	}

	@Override
	public void printProducts() {
		System.out.println("���Ǳ��� �ܾ�: " + this.money);
		for (Product product : this.productArray) {
			if (product != null) {
				System.out.println("���Ǳ��� ��ǰ ����: " + product.getQuantity());
				System.out.println("���Ǳ��� ��ǰ �̸�: " + product.getName());
			}
		}
	}

//public class VendingMachine extends Seller {

//	public VendingMachine() {
//		super(); // ���� Ŭ������ �Ķ���Ͱ� ���� �⺻ ���� �����ڸ� ȣ���Ѵ�.
//	}
//	
//	public VendingMachine(int money) {
//		super(money); // ���� Ŭ������ int �Ķ���Ͱ� �ִ� �����ڸ� ȣ���Ѵ�.
//	}
//	
//	@Override
//	public final void insertMoney(Customer customer, String productName) {
//		super.insertMoney(customer, productName);
//	}
//	
//	@Override
//	public final void pressButton(Customer customer, String productName) {
//		super.pressButton(customer, productName);
//	}
//	
//	@Override
//	public final void pressButton(Customer customer, String productName, int orderCount) {
//		super.pressButton(customer, productName, orderCount);
//	}
//	
//	@Override
//	protected void refund(Customer customer, int refundMoney) {
//		System.out.println("��� �����ϴ�.");
//		System.out.println("ȯ���� ���ص����.");
//	}

}
