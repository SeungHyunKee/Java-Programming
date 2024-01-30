package exception_handling.exceptions;

/**
 * 8���� �̸��� ���̵�� ȸ������ �õ��Ҷ� �߻��� ����
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
