package exception_handling;

import java.util.Scanner;

import exception_handling.exceptions.AlreadyUseUserIdException;
import exception_handling.exceptions.InvalidUserIdException;
import exception_handling.exceptions.UserIdLengthException;

public class MemberJoin {

	public void join() {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Id�� �Է��ϼ���");
		String id = keyboard.nextLine();
		
		if (id != null &&
			id.equals("system") ||
			id.equals("root") || 
			id.equals("admin")) {
			throw new InvalidUserIdException(id + "�� ����� �� �����ϴ�.");
		}
		else if(id != null && 
				 id.equals("ktds")) {
			throw new AlreadyUseUserIdException(id + "�� �̹� ������Դϴ�.");
		}
		else if (id != null &&
				  id.length() < 8) {
			throw new UserIdLengthException("Id�� �ּ� 8�����̻� �Է��ϼ���.");
		}
		// id�� null���� �� �� �����Ƿ� �Ʒ��ڵ�� dead code 
		//-> String id = keyboard.nextLine();�� ���� Ű���忡�� �ƹ��͵� �Ⱦ��� �����ĵ� \n\r �� �پ������Ƿ� (\n : �����Ķ�, \r : ������)
//		else if (id == null) {
//			throw new InvalidUserIdException("Id�� �ʼ��Է°��Դϴ�.");
//		}
		else {
//			�� ������ �� �н��Ѱ�
			System.out.println(id + "�� ������ �Ϸ��߽��ϴ�.");
		}	
	}
	
	public static void main(String[] args) {
		MemberJoin memberJoin = new MemberJoin();
		memberJoin.join();
	}
	
}
