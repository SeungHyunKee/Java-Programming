package generic_vending_machine;

/**
 * 환불 기능이 있는 자판기
 */
// implements, extends 동시에 쓰려면 extends 먼저써주기
public class RefundableVendingMachine<I> extends VendingMachine<I> implements Sellable<I> {
	// VendingMachine과 코드가 거의 동일하므로, VendingMachine상속받고, 추가기능은 따로 작성해주기
	
	/*
	 * 생성자 만들어주기
	 */
	public RefundableVendingMachine(I[] itemArray) {
		super(itemArray);
//		this(100_000);
	}
	
	public RefundableVendingMachine(int money, I[] itemArray) {
		super(money, itemArray);
		//아래코드는 VendingMachine에 있으므로 super(money); 이렇게만 써주고 생략

//		this.money = money;
//		
//		this.productArray = new Product[3];
//		
//		this.productArray[0] = new Product();
//		this.productArray[0].setName("제로펩시");
//		this.productArray[0].setPrice(1600);
//		this.productArray[0].setQuantity(50);
//		
//		this.productArray[1] = new Product();
//		this.productArray[1].setName("제로콜라");
//		this.productArray[1].setPrice(1500);
//		this.productArray[1].setQuantity(30);
//		
//		this.productArray[2] = new Product();
//		this.productArray[2].setName("제로스프라이트");
//		this.productArray[2].setPrice(1400);
//		this.productArray[2].setQuantity(20);
	
	}

	@Override
//	public void refund(Customer customer, int refundMoney) {
	protected void refund(Customer customer, int refundMoney) {
		System.out.println("재고가 없습니다.");
		System.out.println("환불은 못해드려요.");	
		// 1. 자판기의 금액을 환불 해줄 금액만큼 감소시킨다.
//  	super.money -= refundMoney;
		int money = super.getMoney();
		money -= refundMoney;
		super.setMoney(money);
//		2. 고객에게 환불해준다
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
//		System.out.println("재고가 없네요.");
//		System.out.println(refundMoney + "원 환불 해드릴게요.");
//		// 1. 자판기의 금액을 환불 해줄 금액만큼 감소시킨다.
////		super.money -= refundMoney;
//		int money = super.getMoney();
//		money -= refundMoney;
//		super.setMoney(money);
//		
//		// 2. 고객에게 환불 해준다.
//		customer.addMoney(refundMoney);
//	}
}
