package exception_handling.exceptions;

/**
 * 시스템 계정으로 회원가입을 하려는 시도를 막아주는 예외
 */
public class InvalidUserIdException extends RuntimeException{ //extends RuntimeException 이게 있어야 사용자예외(custom)임

	private static final long serialVersionUID = 7295367015806491807L; 
	
	// InvalidUserIDException 생성자 만들기
	public InvalidUserIdException(String message) {
		//받은메시지를 런타임으로 보내주겠다
		super(message);
	}
	
	public InvalidUserIdException(String message, Throwable cause) {
		super(message, cause);
	}
}
