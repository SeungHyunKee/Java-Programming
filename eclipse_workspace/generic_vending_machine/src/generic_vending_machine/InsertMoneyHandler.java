package generic_vending_machine;

public interface InsertMoneyHandler<I> {

//	for (I product : this.productArray) {
//		if (product.equals(productName)) {
//			this.money += product.getPrice();
//			customer.pay(product.getPrice());
//			break; // �ݺ��� �ߴ�.
//		}
//	}

	//�߻�޼ҵ� �����
	public void handle(VendingMachine<I> machine, Customer customer, 
					   I item, String productName);
	
}
