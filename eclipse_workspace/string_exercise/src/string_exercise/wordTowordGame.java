package string_exercise;

import java.util.Scanner;

public class wordTowordGame {
	
	public static void main(String[] args) {
			
		String startWord = "������";
		System.out.println("���۴ܾ�� '������' �Դϴ�.");
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		
		while (true) {
			System.out.println("���� �ܾ �Է��� �ּ���");
			String nextWord = scanner.nextLine();
			nextWord = nextWord.trim();
			String startWordLastWord = startWord.substring(2); 
			String nextWordFirstWord = nextWord.substring(0,1); //length -1 ���൵ ��
			int lenNextWord = nextWord.length();
			
//			if (lenNextWord >= 3) {
//				if ( startWordLastWord.equals(nextWordFirstWord)) {
//					startWord = nextWord;
//					count++;
//				}
//				else {
//					System.out.println("�̾�� �ܾ��� ��: " + count);
//					break;
//				}
//			}else {
//				System.out.println("�̾�� �ܾ��� ��: " + count);
//				break;
//			}
//		}
			if (lenNextWord < 3) {
				break;
			}
			if ( startWordLastWord.equals(nextWordFirstWord)) {
					startWord = nextWord;
					count++;
			}
			else {  
				break;
			}
		}	
		System.out.println("�̾�� �ܾ��� ��: " + count);
		
		
		//���ڿ���(Reference)�� �ݵ�� .equals()�� ���ϱ�
		Scanner keyboard = new Scanner(System.in);
		//���ڿ� ��
		String str1 = "�ѱ�"; // Reference Type (�޸��ּ� ������ �ٴ�)
		String str2 = "�ѱ�"; // Reference Type (�޸��ּ� ������ �ٴ�)
		System.out.println(str1==str2); // true
		// ���⼭ str1 == str2 -> �޸� �ּҰ� ������ �Ǵ��ϴ� ��
		// ����� �غ��� str1�� id=23, str2�� id = 23 ���� �޸� �ּҰ� ������
		
		// ����ڿ��� �Է¹��� �����ʹ� ���� �Է°��� �޾Ƶ� �ٸ� �޸𸮰� ����
		String str3 = keyboard.nextLine(); //'�ѱ�' �Է�
		String str4 = keyboard.nextLine(); //'�ѱ�' �Է�
		System.out.println(str3==str4); // true -> �޸� �ּ� ��
		System.out.println(str3.equals(str4)); // ���� ��
	}
	
}
