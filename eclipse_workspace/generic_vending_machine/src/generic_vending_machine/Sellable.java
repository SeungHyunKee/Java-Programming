package generic_vending_machine;

//제네릭을 조금더 확장 시켜주는 방법 extends
/** 				
 * <I extends Product> ==> Product 클래스를 상속한 타입만 가능(X)
 * 	(제네릭의 인터페이스)  ==> Product 클래스를 상속한 타입 or Product 인터페이스를 구현한 타입 (O)
 * @param <I>
 */
public interface Sellable<I> {

	//interface에서 상수 정의할때 static final 은 자동적용되므로 생략한다
	//상수와 구현되지않은부분 정의
	//public static final int PRODUCT_COUNT = 1;
	//public static final String MACHINE_NAME = '자판기';
	public int PRODUCT_COUNT = 1;
	public String MACHINE_NAME = "자판기";
	
	//인터페이스는 메소드 바디{}를 쓸 수 없음
	public I[] getProductArray();
	
	public int getMoney();
	
	public void setMoney(int money);
	
	public void setInsertMoneyHandler(InsertMoneyHandler<I> handler);
	public void setPressButtonHandler(PressButtonHandler<I> handler);
	public void setPrintHandler(PrintHandler<I> handler);

	
	
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
