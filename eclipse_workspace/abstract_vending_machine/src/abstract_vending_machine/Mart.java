package abstract_vending_machine;

public class Mart {

//	public static void printProduct(Product p) {
//		System.out.println(p.getName()); // null
//		
//		if ( p instanceof TemperatureProduct) {
//			TemperatureProduct tp = (TemperatureProduct) p;
//			tp.setIsHot(true);
//			System.out.println(tp.getIsHot());
//		}
//		
//	}
	
	public static void main(String[] args) {
		// ��� Ŭ������ ����Ŭ������ Object
		
		//Seller(�߻�Ŭ���� �϶�)
		/*
		 * Object
		 *  --> Product
		 *     --> TemperatureProduct
		 * Product is a Object
		 * TemperatureProduct is a Product
		 * TemperatureProduct is a Object
		 */
		
//		Product p = new Product();
//		TemperatureProduct tp = new TemperatureProduct();
//		tp.setName("Ƽ��");
//		printProduct(tp);
//		printProduct(p);
		
//		printTemperatureProduct(tp);
		
		Product p = new Product();
		p.setName("���帶ī");
		p.setPrice(500);
		p.setQuantity(40);
		
		System.out.println(p); 
		// vending_machine.Product@279f2327
		// ��ǰ�� : ���帶ī, ���� : 500, ��� : 40
		
		
		// Seller
		//  --> VendingMachine
		//  --> RefundableVendingMachine
		// IS A ( ������ )
		// VendingMachine is a Seller
		// RefundableVendingMachine is Seller
		// Seller drinkVendingMachine = new VendingMachine();
		// Seller drinkVendingMachine = new RefundableVendingMachine();
		
		
		//Sellable(�������̽�)
		// -> ����) VendingMachine
		// -> ����) RefundableVendingMachine
		// �������̽��� ���� (IS A)
		// RefundableVendingMachine is Sellable
		// Sellable drinkVendingMachine = new VendingMachine();
		// Sellable drinkVendingMachine = new RefundableVendingMachine();
		
		
		// ��ü���� ������� ����.
		//�����ڸ� VendingMachine�� �������
		Sellable drinkMachine = new VendingMachine(); 
		// ������ ��ó ����) Sellable snackMachine = new RefundableVendingMachine(); �ᵵ ���� ���� ���� �ڵ� ���ư�

		
		//musk�� ������ �ִ� �� : 200_000
		Customer musk = new Customer(200_000);
		
		drinkMachine.insertMoney(musk, "�������");
		drinkMachine.pressButton(musk, "�������", 50);
		
		drinkMachine.insertMoney(musk, "�������");
		drinkMachine.pressButton(musk, "�������");
		
		drinkMachine.printProducts();
		musk.printProducts();
		
		//�����ڸ� RefundableVendingMachine�� �������
		Sellable snackMachine = new RefundableVendingMachine(400);
		snackMachine.insertMoney(musk, "�������");
		snackMachine.pressButton(musk, "�������", 50);
		
		snackMachine.insertMoney(musk, "�������");
		snackMachine.pressButton(musk, "�������", 2);
		
		snackMachine.printProducts();
		musk.printProducts();
	}
	
}