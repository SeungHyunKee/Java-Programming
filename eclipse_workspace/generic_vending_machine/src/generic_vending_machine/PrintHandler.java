package generic_vending_machine;

public interface PrintHandler<I> {
//	System.out.println("���Ǳ��� ��ǰ ����: " + product.getQuantity());
//	System.out.println("���Ǳ��� ��ǰ �̸�: " + product.getName());
	public void handle(I item);
	
}
