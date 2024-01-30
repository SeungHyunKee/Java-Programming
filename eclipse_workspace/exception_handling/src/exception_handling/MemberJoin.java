package exception_handling;

import java.util.Scanner;

import exception_handling.exceptions.AlreadyUseUserIdException;
import exception_handling.exceptions.InvalidUserIdException;
import exception_handling.exceptions.UserIdLengthException;

public class MemberJoin {

	public void join() {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Id를 입력하세요");
		String id = keyboard.nextLine();
		
		if (id != null &&
			id.equals("system") ||
			id.equals("root") || 
			id.equals("admin")) {
			throw new InvalidUserIdException(id + "는 사용할 수 없습니다.");
		}
		else if(id != null && 
				 id.equals("ktds")) {
			throw new AlreadyUseUserIdException(id + "는 이미 사용중입니다.");
		}
		else if (id != null &&
				  id.length() < 8) {
			throw new UserIdLengthException("Id는 최소 8글자이상 입력하세요.");
		}
		// id는 null값이 될 수 없으므로 아래코드는 dead code 
		//-> String id = keyboard.nextLine();로 인해 키보드에서 아무것도 안쓰고 엔터쳐도 \n\r 이 붙어있으므로 (\n : 엔터쳐라, \r : 다음줄)
//		else if (id == null) {
//			throw new InvalidUserIdException("Id는 필수입력값입니다.");
//		}
		else {
//			이 과정을 다 패스한것
			System.out.println(id + "로 가입을 완료했습니다.");
		}	
	}
	
	public static void main(String[] args) {
		MemberJoin memberJoin = new MemberJoin();
		memberJoin.join();
	}
	
}
