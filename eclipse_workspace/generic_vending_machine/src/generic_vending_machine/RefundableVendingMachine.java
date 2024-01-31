package generic_vending_machine;

/**
 * ȯ�� ����� �ִ� ���Ǳ�
 */
// implements, extends ���ÿ� ������ extends �������ֱ�
public class RefundableVendingMachine<I> extends VendingMachine<I> implements Sellable<I> {
	// VendingMachine�� �ڵ尡 ���� �����ϹǷ�, VendingMachine��ӹް�, �߰������ ���� �ۼ����ֱ�
	
	/*
	 * ������ ������ֱ�
	 */
	public RefundableVendingMachine(I[] itemArray) {
		super(itemArray);
//		this(100_000);
	}
	
	public RefundableVendingMachine(int money, I[] itemArray) {
		super(money, itemArray);
		//�Ʒ��ڵ�� VendingMachine�� �����Ƿ� super(money); �̷��Ը� ���ְ� ����

//		this.money = money;
//		
//		this.productArray = new Product[3];
//		
//		this.productArray[0] = new Product();
//		this.productArray[0].setName("�������");
//		this.productArray[0].setPrice(1600);
//		this.productArray[0].setQuantity(50);
//		
//		this.productArray[1] = new Product();
//		this.productArray[1].setName("�����ݶ�");
//		this.productArray[1].setPrice(1500);
//		this.productArray[1].setQuantity(30);
//		
//		this.productArray[2] = new Product();
//		this.productArray[2].setName("���ν�������Ʈ");
//		this.productArray[2].setPrice(1400);
//		this.productArray[2].setQuantity(20);
	
	}

	@Override
//	public void refund(Customer customer, int refundMoney) {
	protected void refund(Customer customer, int refundMoney) {
		System.out.println("��� �����ϴ�.");
		System.out.println("ȯ���� ���ص����.");	
		// 1. ���Ǳ��� �ݾ��� ȯ�� ���� �ݾ׸�ŭ ���ҽ�Ų��.
//  	super.money -= refundMoney;
		int money = super.getMoney();
		money -= refundMoney;
		super.setMoney(money);
//		2. ������ ȯ�����ش�
		customer.addMoney(refundMoney);
	}

	
//
//	public RefundableVendingMachine() {
//		super();
//	}
//	
//	public RefundableVendingMachine(int money) {
//		super(money);
//	}
//	
//	@Override
//	protected void refund(Customer customer, int refundMoney) {
//		System.out.println("��� ���׿�.");
//		System.out.println(refundMoney + "�� ȯ�� �ص帱�Կ�.");
//		// 1. ���Ǳ��� �ݾ��� ȯ�� ���� �ݾ׸�ŭ ���ҽ�Ų��.
////		super.money -= refundMoney;
//		int money = super.getMoney();
//		money -= refundMoney;
//		super.setMoney(money);
//		
//		// 2. ������ ȯ�� ���ش�.
//		customer.addMoney(refundMoney);
//	}
}
