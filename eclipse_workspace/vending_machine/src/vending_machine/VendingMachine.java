package vending_machine;

public class VendingMachine {

	// 클래스상수 (공용상수)
	/**
	 * 한번에 구매할수있는 제품의 수
	 */
	public static final int PRODUCT_COUNT; // 한번에 구매할 수 있는 제품의 수 = 1개 라고 정의해 놓은것
	public static final String MACHINE_NAME;
	
	//클래스 상수에 값을 할당하는 방법
	// -> static block
	static {
		// static변수, 상수의 값을 초기화 하는 공간
		PRODUCT_COUNT = 2;
		MACHINE_NAME = "자판기";
	}
	
	// -> 이거를 다른곳에서 사용할때 : VendingMachine.MACHINE_NAME
	
	//상수 자리 (클래스 바로밑, 대문자로 작성)
//	final int PRICE = 1300;
		
	// 멤버변수 자리
	/**
	 * 상품 수량
	 */
//	int productQuantity; // 이 코드 대신 밑의 코드로 사용
	private Product product;
	
	/**
	 * 돈
	 */
	private int money;

	
	//Getter만들기
	public Product getProduct() {
		return this.product;
	}
	public int getMoney() {
		return this.money;
	}
	
	
	// 생성자 자리 (생성자는 반환타입이 들어가지 않음)
		/**
		 * VendingMachine의 인스턴스를 생성할때 호출됨
		*/
	public VendingMachine() {
		System.out.println("자판기 인스턴스를 만들었습니다!");
		// 생성자가 만들어준 인스턴스의 멤버변수에 값을 할당한다 (=초기화)
//		this.productQuantity = 10;
		this.product = new Product();
		this.product.setName("제로콜라");
		this.product.setPrice(1600);
		this.product.setQuantity(50);

		this.money = 100_000;
		/*
		 * 생성자를 직접 만드는 이유
		 * 1. 멤버변수를 초기화 하기 위해(멤버변수에 기본값을 별도로 할당을 하기 위해)
		 *   - 특히, Reference Type 위주로 초기화
		 * 	    - ex) 배열, 컬렉션 
		 * 2. 인스턴스 생성과 동시에 다른 메소드를 호출하기 위해서 사용
		 *   - ex) 인스턴스를 생성함과 동시에 insertMoney메소드를 호출하기 위해
		 */
	}
		
	//기능
	/**
	 * 돈을 넣는다
	 * @param customer 돈을 넣은고객
	 */
	
//	public void insertMoney(Customer customer) {
//		this.money += this.PRICE; // 자판기 돈 증가시킴 //여기서 this = drinkMachine 
//		customer.pay(this.PRICE); // 고객의 지갑에서 PRICE만큼 감소
//	}
	public void insertMoney(Customer customer) {
		this.money += this.product.getPrice(); // 자판기 돈 증가시킴 //여기서 this = drinkMachine 
		customer.pay(this.product.getPrice()); // 고객의 지갑에서 PRICE만큼 감소
		// 내 인스턴스의 product에서 getPrice()값을 가져와라
	}
		
		/**
		 * 버튼을 누른다
		 * @param customer 버튼을 누른 고객
		 */
	public void pressButton(Customer customer) {
		// 자판기에 상품이 없는상태
//		if (productQuantity <= 0) {
		if(this.product.getQuantity() <= 0) {
			return; //메소드 즉시종료
		}
	
//		this.productQuantity--;
//		this.product.quantity--;
		int quantity = this.product.getQuantity();
		quantity--;
		
		quantity -= VendingMachine.PRODUCT_COUNT;
		this.product.setQuantity(quantity);
		customer.addStock(this.product.getName(), this.product.getPrice());
			
	}


}
