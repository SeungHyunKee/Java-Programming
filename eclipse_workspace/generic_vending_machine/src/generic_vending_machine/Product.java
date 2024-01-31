package generic_vending_machine;

/**
 * ���Ǳ⿡�� �Ǹ��� ��ǰ�� ���� (������ Ŭ����)
 */
public class Product {

	/**
	 * ��ǰ�� �̸�
	 */
	private String name;
	
	/**
	 * ��ǰ�� ����
	 */
	private int price;
	
	/**
	 * ��ǰ�� ���
	 */
	private int quantity;
	
	public String getName() {
		return this.name;
	}
	
	
	public int getPrice() {
		return this.price;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override // Annotation
	public String toString() {
		
		String superToStringResult = super.toString();
		System.out.println(superToStringResult);
		
		StringBuffer sb = new StringBuffer();
		sb.append("��ǰ�� : " + this.name);
		sb.append(", ���� : " + this.price);
		sb.append(", ��� : " + this.quantity);
		
		return sb.toString();
	}
	
	/*
	 * Product p = new Product();
	 * if ( p.equals("��ī��") ) { ... }
	 */
	@Override
	public boolean equals(Object obj) {
		
		if ( obj instanceof String) {
			return this.name.equals( (String) obj );
		}
		
		return super.equals(obj);
	}
	
}