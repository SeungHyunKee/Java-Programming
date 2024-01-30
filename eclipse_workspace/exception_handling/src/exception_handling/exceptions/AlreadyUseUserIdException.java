package exception_handling.exceptions;

/**
 * �̹� ���Ե� ���̵�� ȸ�������� �õ��� �� �߻��� ����
 */
public class AlreadyUseUserIdException extends RuntimeException {


	private static final long serialVersionUID = 6484701918827388900L;
	
	public AlreadyUseUserIdException(String message) {
		super(message);
	}

	public AlreadyUseUserIdException(String message, Throwable cause) {
		super(message, cause);
	}

}
