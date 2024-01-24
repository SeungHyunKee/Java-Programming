package vending_machine_explain;

public class Mart {
	
	public static void case1() {
		/**
		 * 함수지향방식으로 개발한 코드
		 */
		VendingMachine drinkMachine = new VendingMachine();
		Customer musk = new Customer(0);		
		//고객이 자판기에 돈을 넣는다.
		musk.pay(1300);
		//고객의 상품 수량이 하나 증가한다.
		musk.addStock("", 0);
	
	}
	
	public static void main(String[] args) {
		// 객체지향 방식으로 개발
		// VendingMachine 타입의 drinkMachine 객체 생성
		VendingMachine drinkMachine = new VendingMachine();

		// Customer 타입의 Customer 객체 생성
		Customer musk = new Customer(200_000); //customer musk의 wallet 에 200_000 할당
		
		// 파라미터 영역에 누가 행동을 할건지 적어줌
		drinkMachine.insertMoney(musk);
		drinkMachine.pressButton(musk);
		
		System.out.println("자판기의 잔액: " + drinkMachine.money); //자판기의 잔액: 101600
		System.out.println("자판기의 상품 수량: " + drinkMachine.product.quantity); //자판기의 상품 수량: 49
		System.out.println("자판기의 상품 이름: " + drinkMachine.product.name); //자판기의 상품 이름: 제로콜라
		System.out.println("고객의 지갑 잔액: " + musk.wallet); //고객의 지갑 잔액: 0
		System.out.println("고객이 소유한 상품 수량: " + musk.product.quantity); //고객이 소유한 상품 수량: 1
		
	}





}
