package fp_java.ch01anonymousclass;

public class Main {

	//nested class -> private, public, default, protected ��� ������
	public static class SubMain{
		
	}
			
	public static void main(String[] args) {
		
		Main main = new Main();
		System.out.println(main); //fp_java.ch01anonymousclass.Main@49097b5d

		
		SubMain subMain = new SubMain();
		System.out.println(subMain); //fp_java.ch01anonymousclass.Main$SubMain@37a71e93 
									//($ ���� -> Main �̶�� Ŭ������ SubMain�� �ν��Ͻ��̴�)

		
		// �͸�Ŭ������ �������̽��� �ٷ� �����
		Computable computer = new Computable() {  // (�������̽���(�߻�޼ҵ�) �ٷ� �ν��Ͻ��� ���� �� ����)
			@Override
			public int add(int num1, int num2) {
				return num1 + num2;
			}
		};
		System.out.println(computer); //fp_java.ch01anonymousclass.Main$1@7106e68e (�͸�Ŭ������ ���� ��ü : $ ����)

		Computable computer2 = new Computable() {  
			@Override
			public int add(int num1, int num2) {
				return num1 + num2;
			}
		};
		System.out.println(computer2); // fp_java.ch01anonymousclass.Main$2@6576fe71 -> $2 : 2��°�� ���� �͸�Ŭ����

		
		Computable computer3 = new Computable() {  
			@Override
			public int add(int num1, int num2) {
				return num1 + num2;
			}
		};
		System.out.println(computer3); //fp_java.ch01anonymousclass.Main$3@300ffa5d -> $3 : 3��°�� ���� �͸�Ŭ����
		
//		Ŭ�������� Ŭ������ ���� �������̽���� �ǹ� = $ 

	}
}
