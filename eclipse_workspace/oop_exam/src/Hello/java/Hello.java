package Hello.java;

public class Hello {

//	sayHello��� �޼ҵ� �����
//	public static void �޼ҵ��̸�(���� ����� ����, �̸��� �ݵ�� �ҹ��ڷ� ����)
	/**
	 * "�ȳ��ϼ���?" �� ����ϴ� �޼ҵ� (�����ϴ� �κ�)
	 */
	public static void sayHello() {
		System.out.println("�ȳ��ϼ���?");
		
	}
	
	
	/**
	 * �̸��� �Ķ���ͷ� �����ϸ�, "�̸���, �ȳ��ϼ���"�� ����Ѵ�.
	 * @param name ����ϰ���� �̸�
	 */
	public static void printHello(String name) {
			System.out.println(name + "��, �ȳ��ϼ���?");
	}
	public static void main (String[] args) {
		printHello("��Ÿũ"); //String name �� "��Ÿũ" �Ҵ�
		printHello("��ũ"); //String name �� "��ũ" �Ҵ�
		printHello("�׷�Ʈ"); //String name �� "�׷�Ʈ" �Ҵ�
//		print + Ctrl + space -> �ڵ� ���� �˷���
		printHello("�褷��");
	}
	
	
	
	/**
	 * Ŭ���� ������ �����Ű�� �޼ҵ�
	 * @param args (�Ķ����)
	 */
//	public static void main(String[] args) {
//		// Ctrl + Alt + ����Ű ��/�Ʒ� -> ��/�Ʒ��� ������ ���簡 ��
//		sayHello(); // �޼ҵ� ȣ���ϴ� ���� (�޼ҵ� ȣ���ϱ����ؼ��� �޼ҵ� �̸����� ȣ��!!)
//		System.out.println("�ݰ����ϴ�.");
//		sayHello();
//		sayHello();
//		sayHello();
//		sayHello();
//		sayHello();
//	}
}
