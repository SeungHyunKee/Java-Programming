package vending_machine_explain;

public class Customer {

	/**
	 * 고객이 가진 돈 (멤버변수 = 파란색으로 보임)
	 */
	int wallet;
		
	/**
	 * 고객이가진 상품수량
	 */
	Product product;
	
	/**
	 * 생성자
	 */ 
	public Customer(int wallet) {  // 갈색변수인 wallet, stock = 파라미터
		// musk를 뜻하는 this를 붙여줘야됨
		// 생성자에서 this의 의미 : 생성자가 만들어준 인스턴스
		this.wallet = wallet; // 생성자가 만들어준 musk의 wallet에 파라미터로 받은 wallet(200_000)을 넣어라
		this.product = new Product(); // 이상태에서는 일종의 장바구니라고 생각(아무것도 없는 상태(아래 추가코드 안쓰면))
	}
		
	
	/**
	 * 지출한다 - price를 파라미터로 받아옴
	 */
	public void pay(int price) {
		// 만약 고객이 가지고있는 돈 - 물건(제로콜라) 가격 < 0 이면 구매 불가능하므로 메소드 즉시종료
		if ( this.wallet - price <= 0) {
				return; //메소드 즉시종료
		}
		this.wallet -= price; // 아니라면, 고객의 돈에서 물건금액만금 빼주기
	}
		
	/**
	 * 고객의 stock에 상품이 하나 증가한다
	 */
	public void addStock(String name, int price) {
		// 고객이 제로콜라를 구매한 적이 있는지 확인 (구매한적 없다면 데이터 및 수량만 증가시킴)	
		// 고객이 제로콜라 구매한적이 없다면
		if(this.product.name == null) {
			// 고객이가지고 있는 상품의 정보를 제로콜라에 대한 정보로 채워줌
			this.product.name = name; //제로콜라
			this.product.price = price; //1600
			this.product.quantity = 1; //고객의 stock +1
		}
		// 고객이 제로콜라 구매한적이 있다면(= null이 아니라면 = 구매한적 있다면) -> 수량만 증가시킴
		else {
			this.product.quantity++; // 고객이가진 제로콜라의 수량을 1개 증가 시킴
		}
		
	}

}
