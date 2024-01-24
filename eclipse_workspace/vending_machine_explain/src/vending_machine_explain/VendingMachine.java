package vending_machine_explain;

public class VendingMachine {

	//1st : 상수 자리 (클래스 바로밑, 대문자로 작성)
	//2nd : 멤버변수 자리
	/**
	 * 상품 수량
	 */
	Product product;
	
	/**
	 * 돈
	 */
	int money;
	
	//3rd : 생성자 자리 (생성자는 반환타입이 들어가지 않음)
	/**
	 * VendingMachine의 인스턴스를 생성할때 호출됨
	*/
	public VendingMachine() {
        // System.out.println("자판기 인스턴스를 만들었습니다!");
		// VendingMachine에 '제로콜라' 할당하기
		this.product = new Product();  
		this.product.name = "제로콜라"; // 상품이름 : 제로콜라
		this.product.price = 1600; // 상품가격 : 1600
		this.product.quantity = 50; // 상품수량 : 50
		this.money = 100_000; // 자판기의 잔액 : 100_000
		
		/*
		 * 생성자를 직접 만드는 이유
		 * 1. 멤버변수를 초기화 하기 위해(멤버변수에 기본값을 별도로 할당을 하기 위해)
		 *   - 특히, Reference Type 위주로 초기화
		 * 	   - ex) 배열, 컬렉션 
		 * 2. 인스턴스 생성과 동시에 다른 메소드를 호출하기 위해서 사용
		 *     - ex) 인스턴스를 생성함과 동시에 insertMoney메소드를 호출하기 위해
		 */
	}
		
	//기능
	/**
	 * 돈을 넣는다
	 * @param customer 돈을 넣은고객
	 */
	public void insertMoney(Customer customer) {
		this.money += this.product.price; // 자판기 돈 증가시킴 //여기서 this = drinkMachine 
		customer.pay(this.product.price); // 고객의 지갑에서 PRICE만큼 감소
	}
		
	/**
	 * 버튼을 누른다
	 * @param customer 버튼을 누른 고객
	 */
	public void pressButton(Customer customer) {
		// 자판기에 상품이 없는상태라면, 메소드 즉시 종료(return)
		if(this.product.quantity <= 0) {
			return; //메소드 즉시종료
		}
		// 자판기에 상품이 있을경우 VendingMachine 의 quantity -1 해주고, 
		this.product.quantity--;
		customer.addStock(this.product.name, this.product.price); //고객의 stock에 해당 상품 더해줌
			
	}




}
