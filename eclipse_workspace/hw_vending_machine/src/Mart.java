package vending_machine;

public class Mart {
	/**
	 * �Լ����������� ������ �ڵ�
	 */
	public static void case1() {
		
		VendingMachine drinkMachine = new VendingMachine();
		// �Ʒ��ڵ�� VendingMachine�� �����ڿ��� ��ü��
//		drinkMachine.money = 3000;
//		drinkMachine.productQuantity = 5;
		
		Customer musk = new Customer(0);
//		musk.wallet = 10000;
//		musk.stock = 0;
		
		//���� ���Ǳ⿡ ���� �ִ´�.
		// ���� �������� ���ְ�
		musk.pay(1300);
		// ���Ǳ��� ���� ������Ų��
		//drinkMachine.insertMoney();
		
		//���� ���Ǳ��� �����ư�� ������
		// ���Ǳ� ������ �ϳ� �پ���,
		//drinkMachine.pressButton();
		
		//�������� �ϳ� �����Ѵ�.
		musk.addStock("", 0);
		
		System.out.println("���Ǳ��� �ܾ�: " + drinkMachine.money);
		System.out.println("���Ǳ��� ��ǰ ����: " + drinkMachine.product.quantity);
		System.out.println("���� ���� �ܾ�: " + musk.wallet);
		System.out.println("���Ǳ⿡ ���� ��ǰ ����: " + musk.product.quantity);
	
	}
	
	
	public static void main(String[] args) {
	
		// ĸ��ȭ : ��� 1������ ���� ó���� �ϴ� Ư¡
		// ��ü���� ������� ����
		VendingMachine drinkMachine = new VendingMachine();
		// �Ʒ��ڵ�� VendingMachine�� �����ڿ��� ��ü��
//		drinkMachine.money = 3000;
//		drinkMachine.productQuantity = 5;
		
//		VendingMachine snackMachine = new VendingMachine();

		Customer musk = new Customer(200_000);
		// �Ʒ��ڵ�� Customer�� �����ڿ��� ��ü��
//		musk.wallet = 10000; // ���� �Ҵ� �ȵǾ����� ��� �ʱⰪ
//		musk.stock = 0;
		
		// �Ķ���� ������ ���� �ൿ�� �Ұ��� ������
		drinkMachine.insertMoney(musk);
		drinkMachine.pressButton(musk);
		
//		drinkMachine.insertMoney(musk);
//		drinkMachine.pressButton(musk);
		
		System.out.println("���Ǳ��� �ܾ�: " + drinkMachine.money);
		System.out.println("���Ǳ��� ��ǰ ����: " + drinkMachine.product.quantity);
		System.out.println("���Ǳ��� ��ǰ �̸�: " + drinkMachine.product.name);
		System.out.println("���� ���� �ܾ�: " + musk.wallet);
		System.out.println("���Ǳ⿡ ���� ��ǰ ����: " + musk.product.quantity);
	
		
	}



}
