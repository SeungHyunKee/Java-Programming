package vending_machine;

/**
 * ���Ǳ⿡�� �Ǹ��� ��ǰ�� ���� (������Ŭ����)
 */
public class Product {

	/**
	 * ��ǰ�� �̸�
	 */
	private String name; // �������ָ� null �Ҵ��
	
	/**
	 * ��ǰ�� ����
	 */
	private int price; // �������ָ� 0 �Ҵ��
	
	/**
	 * ��ǰ�� ��� (���� ���� ����)
	 */
	private int quantity; 
	
	
	// Getter �����
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	public int getQuantity() {
		return this.quantity;
	}
	
	//setter // �Ķ���� : ��������� Ÿ�԰� �̸� �Ȱ��� �ۼ�
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
