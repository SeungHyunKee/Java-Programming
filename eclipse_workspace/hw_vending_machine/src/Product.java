package vending_machine;

/**
 * 자판기에서 판매할 상품의 정보 (데이터클래스)
 */
public class Product {

	/**
	 * 상품의 이름
	 */
	String name; // 정보안주면 null 할당됨
	
	/**
	 * 상품의 가격
	 */
	int price; // 정보안주면 0 할당됨
	
	/**
	 * 상품의 재고 (수량 관리 위함)
	 */
	int quantity; 
	
}
