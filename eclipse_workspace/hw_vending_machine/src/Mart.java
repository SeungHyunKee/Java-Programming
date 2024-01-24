package vending_machine;

public class Mart {
	/**
	 * 함수지향방식으로 개발한 코드
	 */
	public static void case1() {
		
		VendingMachine drinkMachine = new VendingMachine();
		// 아래코드는 VendingMachine의 생성자에서 대체함
//		drinkMachine.money = 3000;
//		drinkMachine.productQuantity = 5;
		
		Customer musk = new Customer(0);
//		musk.wallet = 10000;
//		musk.stock = 0;
		
		//고객이 자판기에 돈을 넣는다.
		// 고객이 가진돈을 뺴주고
		musk.pay(1300);
		// 자판기의 돈을 증가시킨다
		//drinkMachine.insertMoney();
		
		//고객이 자판기의 음료버튼을 누른다
		// 자판기 수량이 하나 줄어들고,
		//drinkMachine.pressButton();
		
		//고객수량이 하나 증가한다.
		musk.addStock("", 0);
		
		System.out.println("자판기의 잔액: " + drinkMachine.money);
		System.out.println("자판기의 상품 수량: " + drinkMachine.product.quantity);
		System.out.println("고객의 지갑 잔액: " + musk.wallet);
		System.out.println("자판기에 남은 상품 수량: " + musk.product.quantity);
	
	}
	
	
	public static void main(String[] args) {
	
		// 캡슐화 : 기능 1개에서 여러 처리를 하는 특징
		// 객체지향 방식으로 개발
		VendingMachine drinkMachine = new VendingMachine();
		// 아래코드는 VendingMachine의 생성자에서 대체함
//		drinkMachine.money = 3000;
//		drinkMachine.productQuantity = 5;
		
//		VendingMachine snackMachine = new VendingMachine();

		Customer musk = new Customer(200_000);
		// 아래코드는 Customer의 생성자에서 대체함
//		musk.wallet = 10000; // 값이 할당 안되었을때 줬던 초기값
//		musk.stock = 0;
		
		// 파라미터 영역에 누가 행동을 할건지 적어줌
		drinkMachine.insertMoney(musk);
		drinkMachine.pressButton(musk);
		
//		drinkMachine.insertMoney(musk);
//		drinkMachine.pressButton(musk);
		
		System.out.println("자판기의 잔액: " + drinkMachine.money);
		System.out.println("자판기의 상품 수량: " + drinkMachine.product.quantity);
		System.out.println("자판기의 상품 이름: " + drinkMachine.product.name);
		System.out.println("고객의 지갑 잔액: " + musk.wallet);
		System.out.println("자판기에 남은 상품 수량: " + musk.product.quantity);
	
		
	}



}
