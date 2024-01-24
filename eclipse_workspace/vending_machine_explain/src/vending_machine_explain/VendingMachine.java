package vending_machine_explain;

public class VendingMachine {

	//1st : ��� �ڸ� (Ŭ���� �ٷι�, �빮�ڷ� �ۼ�)
	//2nd : ������� �ڸ�
	/**
	 * ��ǰ ����
	 */
	Product product;
	
	/**
	 * ��
	 */
	int money;
	
	//3rd : ������ �ڸ� (�����ڴ� ��ȯŸ���� ���� ����)
	/**
	 * VendingMachine�� �ν��Ͻ��� �����Ҷ� ȣ���
	*/
	public VendingMachine() {
        // System.out.println("���Ǳ� �ν��Ͻ��� ��������ϴ�!");
		// VendingMachine�� '�����ݶ�' �Ҵ��ϱ�
		this.product = new Product();  
		this.product.name = "�����ݶ�"; // ��ǰ�̸� : �����ݶ�
		this.product.price = 1600; // ��ǰ���� : 1600
		this.product.quantity = 50; // ��ǰ���� : 50
		this.money = 100_000; // ���Ǳ��� �ܾ� : 100_000
		
		/*
		 * �����ڸ� ���� ����� ����
		 * 1. ��������� �ʱ�ȭ �ϱ� ����(��������� �⺻���� ������ �Ҵ��� �ϱ� ����)
		 *   - Ư��, Reference Type ���ַ� �ʱ�ȭ
		 * 	   - ex) �迭, �÷��� 
		 * 2. �ν��Ͻ� ������ ���ÿ� �ٸ� �޼ҵ带 ȣ���ϱ� ���ؼ� ���
		 *     - ex) �ν��Ͻ��� �����԰� ���ÿ� insertMoney�޼ҵ带 ȣ���ϱ� ����
		 */
	}
		
	//���
	/**
	 * ���� �ִ´�
	 * @param customer ���� ������
	 */
	public void insertMoney(Customer customer) {
		this.money += this.product.price; // ���Ǳ� �� ������Ŵ //���⼭ this = drinkMachine 
		customer.pay(this.product.price); // ���� �������� PRICE��ŭ ����
	}
		
	/**
	 * ��ư�� ������
	 * @param customer ��ư�� ���� ��
	 */
	public void pressButton(Customer customer) {
		// ���Ǳ⿡ ��ǰ�� ���»��¶��, �޼ҵ� ��� ����(return)
		if(this.product.quantity <= 0) {
			return; //�޼ҵ� �������
		}
		// ���Ǳ⿡ ��ǰ�� ������� VendingMachine �� quantity -1 ���ְ�, 
		this.product.quantity--;
		customer.addStock(this.product.name, this.product.price); //���� stock�� �ش� ��ǰ ������
			
	}




}
