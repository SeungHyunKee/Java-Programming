package abstract_vending_machine;

public interface Sellable {

	//interface에서 상수 정의할때 static final 은 자동적용되므로 생략한다
	//상수와 구현되지않은부분 정의
	//public static final int PRODUCT_COUNT = 1;
	//public static final String MACHINE_NAME = '자판기';
	public int PRODUCT_COUNT = 1;
	public String MACHINE_NAME = "자판기";
	
	//인터페이스는 메소드 바디{}를 쓸 수 없음
	public Product[] getProductArray();
	
	public int getMoney();
	
	public void setMoney(int money);
	
	/**
	 * 돈을 넣는다.
	 * @param customer 돈을 넣은 고객
	 * @param productName 구매할 제품의 이름 (제로펩시, 제로콜라, 제로스프라이트)
	 */
	public void insertMoney(Customer customer, String productName);
	
	/**
	 * 버튼을 누른다.
	 * @param customer 버튼을 누른 고객
	 * @param productName 구매할 제품의 이름 (제로펩시, 제로콜라, 제로스프라이트)
	 */
	public void pressButton(Customer customer, String productName);
	
	public void pressButton(Customer customer, String productName, int orderCount); 
	
//	/**
//	 * 고객에게 환불처리 한다.
//	 * 상속된 클래스에서만 사용할 수 있도록 한다.
//	 * @param customer 환불 받을 고객
//	 * @param refundMoney 환불 받을 금액
//	 */
//	public void refund(Customer customer, int refundMoney);
	
	public void printProducts();
	
}
