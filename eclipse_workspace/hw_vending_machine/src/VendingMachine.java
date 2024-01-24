package vending_machine;

public class VendingMachine {

	//��� �ڸ� (Ŭ���� �ٷι�, �빮�ڷ� �ۼ�)
//	final int PRICE = 1300;
		
	// ������� �ڸ�
	/**
	 * ��ǰ ����
	 */
//	int productQuantity; // �� �ڵ� ��� ���� �ڵ�� ���
	Product product;
	
	/**
	 * ��
	 */
	int money;

	
	// ������ �ڸ� (�����ڴ� ��ȯŸ���� ���� ����)
		/**
		 * VendingMachine�� �ν��Ͻ��� �����Ҷ� ȣ���
		*/
	public VendingMachine() {
		System.out.println("���Ǳ� �ν��Ͻ��� ��������ϴ�!");
		// �����ڰ� ������� �ν��Ͻ��� ��������� ���� �Ҵ��Ѵ� (=�ʱ�ȭ)
//		this.productQuantity = 10;
		this.product = new Product();
		this.product.name = "�����ݶ�";
		this.product.price = 1600;
		this.product.quantity = 50;

		this.money = 100_000;
		/*
		 * �����ڸ� ���� ����� ����
		 * 1. ��������� �ʱ�ȭ �ϱ� ����(��������� �⺻���� ������ �Ҵ��� �ϱ� ����)
		 *   - Ư��, Reference Type ���ַ� �ʱ�ȭ
		 * 	    - ex) �迭, �÷��� 
		 * 2. �ν��Ͻ� ������ ���ÿ� �ٸ� �޼ҵ带 ȣ���ϱ� ���ؼ� ���
		 *   - ex) �ν��Ͻ��� �����԰� ���ÿ� insertMoney�޼ҵ带 ȣ���ϱ� ����
		 */
	}
	
		
	//���
	/**
	 * ���� �ִ´�
	 * @param customer ���� ������
	 */
	
//	public void insertMoney(Customer customer) {
//		this.money += this.PRICE; // ���Ǳ� �� ������Ŵ //���⼭ this = drinkMachine 
//		customer.pay(this.PRICE); // ���� �������� PRICE��ŭ ����
//	}
	public void insertMoney(Customer customer) {
		this.money += this.product.price; // ���Ǳ� �� ������Ŵ //���⼭ this = drinkMachine 
		customer.pay(this.product.price); // ���� �������� PRICE��ŭ ����
	}
		
		/**
		 * ��ư�� ������
		 * @param customer ��ư�� ���� ��
		 */
	public void pressButton(Customer customer) {
		// ���Ǳ⿡ ��ǰ�� ���»���
//		if (productQuantity <= 0) {
		if(this.product.quantity <= 0) {
			return; //�޼ҵ� �������
		}
	
//		this.productQuantity--;
		this.product.quantity--;
		customer.addStock(this.product.name, this.product.price);
			
	}


}
