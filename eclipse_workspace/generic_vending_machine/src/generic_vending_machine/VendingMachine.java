package generic_vending_machine;

/**
 * 상속 받은 클래스가 추상 메소드가 존재하는 추상 클래스라면<br/>
 * 추상 메소드를 이 클래스에서 구현을 시키거나<br/>
 * 이 클래스도 추상 클래스로 만들어 주어야 한다.<br/>
 * <b>환불 불가능한 자판기</b>
 */

public class VendingMachine<I> implements Sellable<I> {
	
	private InsertMoneyHandler<I> insertMoneyHandler;
	private PressButtonHandler<I> pressButtonHandler;
	private PrintHandler<I> printHandler;
	
	/**
	 * 상품 수량
	 */
//	int productQuantity;
	private I[] productArray; //아직 I가 뭔지 모름. 전달하기 나름

	/**
	 * 돈
	 */
	private int money;

	
	/*
	 * 생성자 만들어주기
	 */
//	//파라미터없는 생성자 만드는 방법1 : null전달
//	public VendingMachine() {
//		// VendingMachine이 가지고 있는 돈 : 100_000
//		this(100_000, null); //돈만 있고 아무것도 팔지않는 자판기
//		// 방법2 : 파라미터가없는 생성자에 I제네릭타입의 배열 만들기
	
	// 방법2 : 파라미터가없는 생성자에 I제네릭타입의 배열 만들기
	public VendingMachine(I[] itemArray) {
		// VendingMachine이 가지고 있는 돈 : 100_000
		this(100_000, itemArray); //돈만 있고 아무것도 팔지않는 자판기
		
	}
	
	public VendingMachine(int money, I[] itemArray) { // 생성자에서 아래 배열(기존) 초기화할수가 없다 ->Mart로 보냄
		this.money = money;
		this.productArray = itemArray; // 외부에서 받아온 제품 목록을 내부로 전달해줌
		
	}
	

//		this.prodcutArray = null; // nullpointerexception 발생함
//		
//		if (this.productArray != null) {
//			this.productArray[0] = new Product();
//			this.productArray[0].setName("제로펩시");
//			this.productArray[0].setPrice(1600);
//			this.productArray[0].setQuantity(50);
//		}	
	
//			if (this.productArray.length > 1) {
//				this.productArray[1] = new Product();
//				this.productArray[1].setName("제로콜라");
//				this.productArray[1].setPrice(1500);
//				this.productArray[1].setQuantity(30);
//			}
//			
//			if (this.productArray.length > 2) {   // 이걸 실행하게되면 예외 발생하지 않음
//				this.productArray[2] = new Product();
//				this.productArray[2].setName("제로스프라이트");
//				this.productArray[2].setPrice(1400);
//				this.productArray[2].setQuantity(20);
//			}
	
	
	@Override
	public I[] getProductArray() {
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
	public void setInsertMoneyHandler(InsertMoneyHandler<I> handler) {
		this.insertMoneyHandler = handler;  // handler의 value = Mart$1 : 클래스안의 클래스. 즉, 익명클래스를 의미 = 마트안에서만든 첫번째 중첩클래스
	}
	
	@Override
	public void setPressButtonHandler(PressButtonHandler<I> handler) {
		this.pressButtonHandler = handler; // handler의 value = Mart$2 : 클래스안의 클래스. 마트안에서 만든 두번째 중첩클래스

	}
	
	@Override
	public void setPrintHandler(PrintHandler<I> handler) {
		this.printHandler = handler;
	}

	@Override
	public void insertMoney(Customer customer, String productName) {
		// this.productArray를 반복하면서 Product 인스턴스의 제품명 확인.
		// Product 인스턴스의 제품명과 productName이 같으면,
		// 해당 제품의 가격으로 자판기의 돈을 증가시키고
		// 고객의 돈을 감소시킨다.
		for (I product : this.productArray) {
//			if (product.equals(productName)) {
//				this.money += product.getPrice();
//				customer.pay(product.getPrice());
//				break; // 반복을 중단.
//			} 이 주석코드를 아래 코드1줄이 해줌
			this.insertMoneyHandler.handle(this, customer, product, productName); //this:현재 이클래스를 쓰고있는 인스턴스
		}
	}

	@Override
	public void pressButton(Customer customer, String productName) {
		this.pressButton(customer, productName, VendingMachine.PRODUCT_COUNT);

	}

	@Override
	public void pressButton(Customer customer, String productName, int orderCount) {
		for (I product : this.productArray) {
//			if (product.equals(productName)) {
//
//				if (product.getQuantity() <= 0) {
//					this.refund(customer, product.getPrice());
//					return; // 메소드를 종료.
//				}
//
//				int quantity = product.getQuantity();
//				quantity -= orderCount;
//				product.setQuantity(quantity);
//
//				customer.addStock(productName, product.getPrice(), orderCount);
//				break;
//			}
//		}
			this.pressButtonHandler.handle(this, customer, product, productName, orderCount);
		}
	}
	
//	@Override
//	public void refund(Customer customer, int refundMoney) {
	protected void refund(Customer customer, int refundMoney) {
		System.out.println("재고가 없습니다.");
		System.out.println("환불은 못해드려요.");
	}

	@Override
	public void printProducts() {
		System.out.println("자판기의 잔액: " + this.money);
		for (I product : this.productArray) {
//			if (product != null) {
//				System.out.println("자판기의 상품 수량: " + product.getQuantity());
//				System.out.println("자판기의 상품 이름: " + product.getName());
//			}
			this.printHandler.handle(product);
		}
	}

//public class VendingMachine extends Seller {

//	public VendingMachine() {
//		super(); // 슈퍼 클래스의 파라미터가 없는 기본 형태 생성자를 호출한다.
//	}
//	
//	public VendingMachine(int money) {
//		super(money); // 슈퍼 클래스의 int 파라미터가 있는 생성자를 호출한다.
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
//		System.out.println("재고가 없습니다.");
//		System.out.println("환불은 못해드려요.");
//	}

}
