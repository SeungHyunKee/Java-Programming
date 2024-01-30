package exception_handling.exceptions;

/**
 * 8글자 미만의 아이디로 회원가입 시도할때 발생할 예외
 */
public class UserIdLengthException extends RuntimeException {

	private static final long serialVersionUID = 3586920514556025639L;

	public UserIdLengthException(String message) {
		super(message);
	}
	
	public UserIdLengthException(String message, Throwable cause) {
		super(message, cause);
	}
	
}
