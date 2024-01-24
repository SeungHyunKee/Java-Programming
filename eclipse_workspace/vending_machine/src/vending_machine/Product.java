package vending_machine;

/**
 * 자판기에서 판매할 상품의 정보 (데이터클래스)
 */
public class Product {

	/**
	 * 상품의 이름
	 */
	private String name; // 정보안주면 null 할당됨
	
	/**
	 * 상품의 가격
	 */
	private int price; // 정보안주면 0 할당됨
	
	/**
	 * 상품의 재고 (수량 관리 위함)
	 */
	private int quantity; 
	
	
	// Getter 만들기
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	public int getQuantity() {
		return this.quantity;
	}
	
	//setter // 파라미터 : 멤버변수의 타입과 이름 똑같이 작성
	public void setName(String name) { 
		this.name = name;
	}
	public void setPrice(int price) { 
		this.price = price;
	}
	public void setQuantity(int quantity) { 
		this.quantity = quantity;
	}
	
	
}
