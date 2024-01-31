package generic_vending_machine;

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
		
		
		Product[] productArray = new Product[3]; 
		
		productArray[0] = new Product();
		productArray[0].setName("�������");
		productArray[0].setPrice(1600);
		productArray[0].setQuantity(50);
		
		productArray[1] = new Product();
		productArray[1].setName("�����ݶ�");
		productArray[1].setPrice(1500);
		productArray[1].setQuantity(30);
		
		if (productArray.length > 2) {
		productArray[2] = new Product();
		productArray[2].setName("���ν�������Ʈ");
		productArray[2].setPrice(1400);
		productArray[2].setQuantity(20);
		}
		
		
		// ��ü���� ������� ����.
		//�����ڸ� VendingMachine�� �������
		Sellable<Product> drinkMachine = new VendingMachine<>(100_000, productArray); 
		// ������ ��ó ����) Sellable snackMachine = new RefundableVendingMachine(); �ᵵ ���� ���� ���� �ڵ� ���ư�
		drinkMachine.setInsertMoneyHandler(new InsertMoneyHandler<Product>() {

			@Override
			public void handle(VendingMachine<Product> machine, Customer customer,
								Product item, String productName) {
				if (item.equals(productName)) {
					// machine.money += item.getPrice();  //.money��(������������ ���� ������) �Ʒ� 3�ٷ� Ǯ���ֱ�
					int money = machine.getMoney();
					money += item.getPrice();
					machine.setMoney(money);
					
					customer.pay(item.getPrice());
				} 
			}}); //�������̽��� �ν��Ͻ�ȭ �ϱ����� ��� : �͸�Ŭ����
		
		drinkMachine.setPressButtonHandler(new PressButtonHandler<Product>() {

			@Override
			public void handle(VendingMachine<Product> machine, Customer customer,
								Product item, String productName, int orderCount) {
				if (item.equals(productName)) {
					if (item.getQuantity() <= 0) {
						machine.refund(customer, item.getPrice());
						return; // �޼ҵ带 ����.
					}
					int quantity = item.getQuantity();
					quantity -= orderCount;
					item.setQuantity(quantity);
	
					customer.addStock(productName, item.getPrice(), orderCount);
				}
			}});
		
		
		drinkMachine.setPrintHandler(new PrintHandler<Product>() {
			@Override
			public void handle(Product item) {
				System.out.println("���Ǳ��� ��ǰ ����: " + item.getQuantity());
				System.out.println("���Ǳ��� ��ǰ �̸�: " + item.getName());
				
			}});
		
		//musk�� ������ �ִ� �� : 200_000
		Customer musk = new Customer(200_000);
		
		drinkMachine.insertMoney(musk, "�������");
		drinkMachine.pressButton(musk, "�������", 50);
		
		drinkMachine.insertMoney(musk, "�������");
		drinkMachine.pressButton(musk, "�������");
		
		drinkMachine.printProducts();
		musk.printProducts();
		
		//�����ڸ� RefundableVendingMachine�� �������
		Sellable<Product> snackMachine = new RefundableVendingMachine<>(400, productArray);
		
		snackMachine.setInsertMoneyHandler(new InsertMoneyHandler<Product>() {

			@Override
			public void handle(VendingMachine<Product> machine, Customer customer,
								Product item, String productName) {
				if (item.equals(productName)) {
					// machine.money += item.getPrice();  //.money��(������������ ���� ������) �Ʒ� 3�ٷ� Ǯ���ֱ�
					int money = machine.getMoney();
					money += item.getPrice();
					machine.setMoney(money);
					
					customer.pay(item.getPrice());
				} 
			}}); //�������̽��� �ν��Ͻ�ȭ �ϱ����� ��� : �͸�Ŭ����
		
		snackMachine.setPressButtonHandler(new PressButtonHandler<Product>() {

			@Override
			public void handle(VendingMachine<Product> machine, Customer customer,
								Product item, String productName, int orderCount) {
				if (item.equals(productName)) {
					if (item.getQuantity() <= 0) {
						machine.refund(customer, item.getPrice());
						return; // �޼ҵ带 ����.
					}
					int quantity = item.getQuantity();
					quantity -= orderCount;
					item.setQuantity(quantity);
	
					customer.addStock(productName, item.getPrice(), orderCount);
				}
			}});
		
		snackMachine.setPrintHandler(new PrintHandler<Product>() {
			@Override
			public void handle(Product item) {
				System.out.println("���Ǳ��� ��ǰ ����: " + item.getQuantity());
				System.out.println("���Ǳ��� ��ǰ �̸�: " + item.getName());
				
			}});
		
		snackMachine.insertMoney(musk, "�������");
		snackMachine.pressButton(musk, "�������", 50);
		
		snackMachine.insertMoney(musk, "�������");
		snackMachine.pressButton(musk, "�������", 2);
		
		snackMachine.printProducts();
		musk.printProducts();
		
		
	}
	
}