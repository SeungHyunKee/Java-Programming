package vending_machine;

public class Customer {
	/**
	 * 고객이 가진 돈 (멤버변수 = 파란색으로 보임)
	 */
	private int wallet;
		
	/**
	 * 고객이가진 상품수량
	 */
	//int stock;
	// 자판기와 연동을 위해 같은 타입으로 작성해줌
	private Product product;	
	
	/**
	 * 생성자
	 */
	//public Customer(int wallet, int stock) { // 갈색변수인 wallet, stock = 파라미터 
	public Customer(int wallet) { 
		// musk를 뜻하는 this를 붙여줘야됨
		// 생성자에서 this의 의미 : 생성자가 만들어준 인스턴스
		this.wallet = wallet; // 생성자가 만들어준 wallet에 파라미터로 받은 wallet을 넣어라
		//this.stock = stock;
		this.product = new Product(); // 이상태에서는 일종의 장바구니라고 생각하기(아무것도 없는 상태(아래 추가코드 안쓰면))
	}
		
	//Getter만들기
		public int getWallet() {
			return this.wallet;
		}
		public Product getProduct() {
			return this.product;
		}
	
	/**
	 * 지출한다 - price를 파라미터로 받아옴
	 */
	public void pay(int price) {
		if ( this.wallet - price <= 0) {
				return; //메소드 즉시종료
		}
		this.wallet -= price;
	}
		
	/**
	 * 상품이 하나 증가한다
	 */
	public void addStock(String name, int price) {
		//this.stock++;
		// 고객이 제로콜라를 구매한 적이 있는지 확인 (구매한적 없다면 데이터 및 수량만 증가시킴)	
		// 고객이 제로콜라 구매한적이 없다면
		
		// 값을 가져올때는 Getter
		if(this.product.getName() == null) {
			// 고객이가진 상품의정보를 제로콜라로 채워줌
			
//			this.product.name = name;
//			this.product.price = price;
//			this.product.quantity = 1;
			
			// 값을 할당할때는 Setter
			this.product.setName(name);
			this.product.setPrice(price);
//			this.product.setQuantity(1);
			this.product.setQuantity(VendingMachine.PRODUCT_COUNT);
		}
		// 고객이 제로콜라 구매한적이 있다면(= null이 아니라면) -> (구매한적 있다면 수량만 증가시킴)
		else {
			// 고객이가진 제로콜라의 수량을 1개 증가 시킴
			//this.product.quantity++; -> 아래3줄로 풀어서 씀
			int quantity = this.product.getQuantity();
//			quantity++;
			quantity += VendingMachine.PRODUCT_COUNT;
			this.product.setQuantity(quantity);
			
		}
		
	}

}
