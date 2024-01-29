package abstract_vending_machine;

public interface Sellable {

	//interface���� ��� �����Ҷ� static final �� �ڵ�����ǹǷ� �����Ѵ�
	//����� �������������κ� ����
	//public static final int PRODUCT_COUNT = 1;
	//public static final String MACHINE_NAME = '���Ǳ�';
	public int PRODUCT_COUNT = 1;
	public String MACHINE_NAME = "���Ǳ�";
	
	//�������̽��� �޼ҵ� �ٵ�{}�� �� �� ����
	public Product[] getProductArray();
	
	public int getMoney();
	
	public void setMoney(int money);
	
	/**
	 * ���� �ִ´�.
	 * @param customer ���� ���� ��
	 * @param productName ������ ��ǰ�� �̸� (�������, �����ݶ�, ���ν�������Ʈ)
	 */
	public void insertMoney(Customer customer, String productName);
	
	/**
	 * ��ư�� ������.
	 * @param customer ��ư�� ���� ��
	 * @param productName ������ ��ǰ�� �̸� (�������, �����ݶ�, ���ν�������Ʈ)
	 */
	public void pressButton(Customer customer, String productName);
	
	public void pressButton(Customer customer, String productName, int orderCount); 
	
//	/**
//	 * ������ ȯ��ó�� �Ѵ�.
//	 * ��ӵ� Ŭ���������� ����� �� �ֵ��� �Ѵ�.
//	 * @param customer ȯ�� ���� ��
//	 * @param refundMoney ȯ�� ���� �ݾ�
//	 */
//	public void refund(Customer customer, int refundMoney);
	
	public void printProducts();
	
}
