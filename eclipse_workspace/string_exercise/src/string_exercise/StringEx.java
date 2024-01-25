package string_exercise;

public class StringEx {
	
	public static void main(String[] args) {
		
	String address = "����Ư���� ���ʱ�";
	// 1. contains : address�� ���ԵǾ��ִ���  
	boolean isSeoul = address.contains("����");
	System.out.println(isSeoul); //true
	
	// 2. endsWith : ~�� �������� 
	isSeoul = address.endsWith("���ʱ�");
	System.out.println(isSeoul); // true
	
	//3. equals (��ҹ��� ������) : ��Ȯ�� ������
	String name = "University";
	boolean isEqual = name.equals("university");
	System.out.println(isEqual); //false
	
	//4. equalsIgnoreCase (��ҹ��� ���о���)
	isEqual = name.equalsIgnoreCase("university");
	System.out.println(isEqual); //true

	String alphabets = "abcdef";
	//5. indexOf : ������ �ε��� ã��
	int letterCIndex = alphabets.indexOf('c');
	System.out.println(letterCIndex); //2
	
	int letterDEFIndex = alphabets.indexOf("def");
	System.out.println(letterDEFIndex); //3

	
	String message = "abcdefghijklmnop";
	//6. lastIndexOf : ������ ������ �ε��� ã��
	int letterALastIndex = message.lastIndexOf("a");
    System.out.println(letterALastIndex); //0
    
    letterALastIndex = message.lastIndexOf("jj");
    System.out.println(letterALastIndex);//-1 (���°��� ã���� -1 ����)
    
    //7. length : ���ڿ� ���� ���ϱ�
    int length = message.length();
    System.out.println(length); //16

    
    //8. matches : ���ڿ� ���� Ȯ���ϱ�
    String phone = "+82-010-1234-1234";
    boolean isNumber = phone.matches("^[0-9]+$");
    System.out.println(isNumber); //false
	
    //9. replace : ���ڿ� ã�� �ٲٱ�
    String sentance = "�ȳ��ϼ���, ȫ�浿��, �ȳ���������,ȫ�浿��.";
    String replacedSentance = sentance.replace("ȫ�浿", "ktds");
    System.out.println(replacedSentance); //�ȳ��ϼ���, ktds��, �ȳ���������,ktds��.
    
    //10. replaceAll : ���ڿ� ã�� �ٲٱ�(����ǥ���� ����)
    // String phone = "01012341234";
    phone = phone.replaceAll("[^0-9]", ""); //���ڰ��ƴ� ���ڸ� ���鹮�ڷ� ����
    System.out.println(phone); //8201012341234

	//11. startsWith : �Ķ���ͷ� �����ϴ��� Ȯ��
    // String phone = "8201012341234";
    boolean isKoreanNum = phone.startsWith("82");
    System.out.println(isKoreanNum); //true
    
    
    String datetime = "2023-06-08 13:23:23";
    //12. substring : ���ڿ� �߶�
    String year = datetime.substring(0,4);
    System.out.println(year); //2023
    
    //datetime���� 13(��) �� �߶󳻾� �Ҵ�
    String hour = datetime.substring(11,13);
    System.out.println(hour); //13
    
    //datetime���� �ú��� ���ڸ� �߶󳻾� �Ҵ�
    String time = datetime.substring(11);
    System.out.println(time); //13:23:23

    
    //13. trim : ���ڿ� �� / �� ��������
    String dateTime = " 2023-02-02 14:14:14  ";
    System.out.println(dateTime.length()); //22
    System.out.println(dateTime); // 2023-02-02 14:14:14  
    dateTime = dateTime.trim();
    System.out.println(dateTime.length()); //19
    System.out.println(dateTime); //2023-02-02 14:14:14 (���ڿ� �յ� �������ŵ�)

    //14. int Ÿ�� 1�� ���ڿ��� �����ϱ�(Overloading)
    String iStr = String.valueOf(1); //int �� 1
    System.out.println(iStr); //���ڿ� 1 ��ȯ
    // 15. int/boolean �� �ƹ�Ÿ�Կ��ٰ� +"" ���൵ ���ڰ� ��
    iStr = 1 + ""; 
    System.out.println(iStr); //���ڿ� 1 ��ȯ
    
	}
}
