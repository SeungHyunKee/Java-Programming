package exception_handling;

public class IfNullPointerException {

	public static void main(String[] args) {
		
	// 1. NullPointerException�� �߻��ϴ� ����
	String name = null;
	//NullPointerException - null.equals("�̸�")
	System.out.println(name.equals("�̸�"));
	//Exception in thread "main" java.lang.NullPointerException: 
	//Cannot invoke "String.equals(Object)" because "name" is null
	//at exception_handling.IfNullPointerException.main(IfNullPointerException.java:8)

	// 2. NullPointerException �������
	if(name != null) { //�ν��Ͻ� �����ϱ� �� null���� Ȯ��
		System.out.println(name.equals("�̸�")); //name ==null�̹Ƿ� ���ڵ� ����x
	}
	
	}
}
