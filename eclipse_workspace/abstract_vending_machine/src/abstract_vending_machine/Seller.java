package abstract_vending_machine;

/**
 * ���Ǳ��� �߻� Ŭ����
 * abstract method�� ���� ���
 * Ŭ������ Ÿ�Ե� abstract class�� �Ǿ�� �Ѵ�.
 * abstract class�� �ν��Ͻ��� ���� ���� ����. ( new Seller() ==> X )
 */
public abstract class Seller {
	
	// Ŭ���� ���(������)
	/**
	 * �� ���� ������ �� �ִ� ��ǰ�� ��
	 */
	public static final int PRODUCT_COUNT;
	public static final String MACHINE_NAME;
	
	// Ŭ���� ����� ���� �Ҵ��ϴ� ���
	// static block
	static {
		// static ���� / ����� ���� �ʱ�ȭ �ϴ� ����.
		PRODUCT_COUNT = 1;
		MACHINE_NAME = "���Ǳ�";
	}
	
	// ��� �ڸ�
//	final int PRICE = 1300;
	
	// ������� �ڸ�
	/**
	 * ��ǰ ����
	 */
//	int productQuantity;
	private Product[] productArray;
	
	/**
	 * ��
	 */
	private int money;
	
	public Product[] getProductArray() {
		return this.productArray;
	}
	
	public int getMoney() {
		return this.money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	// ������ �ڸ�.
	/**
	 * VendingMachine�� �ν��Ͻ��� ������ �� ȣ��ȴ�.
	 */
	public Seller() {
		this(100_000);
		/*
		 * �����ڸ� ���� ����� ���� (�� ����)
		 * 1. ������� �ʱ�ȭ (��������� �⺻ ���� ������ �Ҵ��� �ϱ� ���ؼ�)
		 *    - Reference Type ���ַ� �ʱ�ȭ.
		 *       - �迭, �÷���
		 * 2. �ν��Ͻ� ������ ���ÿ� �ٸ� �޼ҵ带 ȣ���ϱ� ����.
		 *    - ��> �ν��Ͻ��� �����԰� ���ÿ� insertMoney�޼ҵ带 ȣ���ϱ� ���ؼ�.
		 */
	}
	
	public Seller(int money) {
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
	
	/**
	 * ���� �ִ´�.
	 * @param customer ���� ���� ��
	 * @param productName ������ ��ǰ�� �̸� (�������, �����ݶ�, ���ν�������Ʈ)
	 */
	public void insertMoney(Customer customer, String productName) {
		// this.productArray�� �ݺ��ϸ鼭 Product �ν��Ͻ��� ��ǰ�� Ȯ��.
		// Product �ν��Ͻ��� ��ǰ��� productName�� ������,
		// �ش� ��ǰ�� �������� ���Ǳ��� ���� ������Ű��
		// ���� ���� ���ҽ�Ų��.
		for ( Product product : this.productArray ) {
			if (product.equals(productName)) {
				this.money += product.getPrice();
				customer.pay(product.getPrice());
				break; // �ݺ��� �ߴ�.
			}
		}
	}
	
	/**
	 * ��ư�� ������.
	 * @param customer ��ư�� ���� ��
	 * @param productName ������ ��ǰ�� �̸� (�������, �����ݶ�, ���ν�������Ʈ)
	 */
	public void pressButton(Customer customer, String productName) {
		this.pressButton(customer, productName, VendingMachine.PRODUCT_COUNT);
	}
	
	public void pressButton(Customer customer, String productName, int orderCount) {

		// this.productArray�� �ݺ��ϸ鼭 productName�� ������ ���Ѵ�.
		// ������ �ش� ��ǰ�� ������ üũ�ϰ� (0���� ������)
		// �۴ٸ�, �޼ҵ带 �����Ų��.
		// �׷��� �ʴٸ� �ش� ��ǰ�� ������ �ϳ� ���ҽ�Ű��
		// ������ �ش� ��ǰ�� �����Ѵ�.
		for ( Product product : this.productArray ) {
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
	
	/**
	 * ������ ȯ��ó�� �Ѵ�.
	 * ��ӵ� Ŭ���������� ����� �� �ֵ��� �Ѵ�.
	 * @param customer ȯ�� ���� ��
	 * @param refundMoney ȯ�� ���� �ݾ�
	 */
	protected abstract void refund(Customer customer, int refundMoney);
	
	public void printProducts() {
		System.out.println("���Ǳ��� �ܾ�: " + this.money);
		for ( Product product : this.productArray ) {
			if ( product != null ) {
				System.out.println("���Ǳ��� ��ǰ ����: " + product.getQuantity());
				System.out.println("���Ǳ��� ��ǰ �̸�: " + product.getName());
			}
		}
	}
	
}
