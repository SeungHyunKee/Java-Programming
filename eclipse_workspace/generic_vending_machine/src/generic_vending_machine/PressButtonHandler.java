package generic_vending_machine;

public interface PressButtonHandler<I> {
//	if (product.equals(productName)) {
//
//		if (product.getQuantity() <= 0) {
//			this.refund(customer, product.getPrice());
//			return; // �޼ҵ带 ����.
//		}
//
//		int quantity = product.getQuantity();
//		quantity -= orderCount;
//		product.setQuantity(quantity);
//
//		customer.addStock(productName, product.getPrice(), orderCount);
//		break;
//	}
	public void handle(VendingMachine<I> machine, Customer customer,
						I item, String productName, int orderCount);
	
	
	
}
