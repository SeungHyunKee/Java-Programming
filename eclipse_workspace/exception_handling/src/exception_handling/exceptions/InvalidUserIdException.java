package exception_handling.exceptions;

/**
 * �ý��� �������� ȸ�������� �Ϸ��� �õ��� �����ִ� ����
 */
public class InvalidUserIdException extends RuntimeException{ //extends RuntimeException �̰� �־�� ����ڿ���(custom)��

	private static final long serialVersionUID = 7295367015806491807L; 
	
	// InvalidUserIDException ������ �����
	public InvalidUserIdException(String message) {
		//�����޽����� ��Ÿ������ �����ְڴ�
		super(message);
	}
	
	public InvalidUserIdException(String message, Throwable cause) {
		super(message, cause);
	}
}
