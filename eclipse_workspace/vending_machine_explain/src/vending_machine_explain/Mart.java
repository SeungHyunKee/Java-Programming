package vending_machine_explain;

public class Mart {
	
	public static void case1() {
		/**
		 * �Լ����������� ������ �ڵ�
		 */
		VendingMachine drinkMachine = new VendingMachine();
		Customer musk = new Customer(0);		
		//���� ���Ǳ⿡ ���� �ִ´�.
		musk.pay(1300);
		//���� ��ǰ ������ �ϳ� �����Ѵ�.
		musk.addStock("", 0);
	
	}
	
	public static void main(String[] args) {
		// ��ü���� ������� ����
		// VendingMachine Ÿ���� drinkMachine ��ü ����
		VendingMachine drinkMachine = new VendingMachine();

		// Customer Ÿ���� Customer ��ü ����
		Customer musk = new Customer(200_000); //customer musk�� wallet �� 200_000 �Ҵ�
		
		// �Ķ���� ������ ���� �ൿ�� �Ұ��� ������
		drinkMachine.insertMoney(musk);
		drinkMachine.pressButton(musk);
		
		System.out.println("���Ǳ��� �ܾ�: " + drinkMachine.money); //���Ǳ��� �ܾ�: 101600
		System.out.println("���Ǳ��� ��ǰ ����: " + drinkMachine.product.quantity); //���Ǳ��� ��ǰ ����: 49
		System.out.println("���Ǳ��� ��ǰ �̸�: " + drinkMachine.product.name); //���Ǳ��� ��ǰ �̸�: �����ݶ�
		System.out.println("���� ���� �ܾ�: " + musk.wallet); //���� ���� �ܾ�: 0
		System.out.println("���� ������ ��ǰ ����: " + musk.product.quantity); //���� ������ ��ǰ ����: 1
		
	}





}
