package vending_machine;

public class VendingMachine {

	//상수 자리 (클래스 바로밑, 대문자로 작성)
//	final int PRICE = 1300;
		
	// 멤버변수 자리
	/**
	 * 상품 수량
	 */
//	int productQuantity; // 이 코드 대신 밑의 코드로 사용
	Product product;
	
	/**
	 * 돈
	 */
	int money;

	
	// 생성자 자리 (생성자는 반환타입이 들어가지 않음)
		/**
		 * VendingMachine의 인스턴스를 생성할때 호출됨
		*/
	public VendingMachine() {
		System.out.println("자판기 인스턴스를 만들었습니다!");
		// 생성자가 만들어준 인스턴스의 멤버변수에 값을 할당한다 (=초기화)
//		this.productQuantity = 10;
		this.product = new Product();
		this.product.name = "제로콜라";
		this.product.price = 1600;
		this.product.quantity = 50;

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
		this.money += this.product.price; // 자판기 돈 증가시킴 //여기서 this = drinkMachine 
		customer.pay(this.product.price); // 고객의 지갑에서 PRICE만큼 감소
	}
		
		/**
		 * 버튼을 누른다
		 * @param customer 버튼을 누른 고객
		 */
	public void pressButton(Customer customer) {
		// 자판기에 상품이 없는상태
//		if (productQuantity <= 0) {
		if(this.product.quantity <= 0) {
			return; //메소드 즉시종료
		}
	
//		this.productQuantity--;
		this.product.quantity--;
		customer.addStock(this.product.name, this.product.price);
			
	}


}
