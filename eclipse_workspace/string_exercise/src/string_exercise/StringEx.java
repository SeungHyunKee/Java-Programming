package string_exercise;

public class StringEx {
	
	public static void main(String[] args) {
		
	String address = "서울특별시 서초구";
	// 1. contains : address에 포함되어있는지  
	boolean isSeoul = address.contains("서울");
	System.out.println(isSeoul); //true
	
	// 2. endsWith : ~로 끝나는지 
	isSeoul = address.endsWith("서초구");
	System.out.println(isSeoul); // true
	
	//3. equals (대소문자 구분함) : 정확히 같은지
	String name = "University";
	boolean isEqual = name.equals("university");
	System.out.println(isEqual); //false
	
	//4. equalsIgnoreCase (대소문자 구분안함)
	isEqual = name.equalsIgnoreCase("university");
	System.out.println(isEqual); //true

	String alphabets = "abcdef";
	//5. indexOf : 문자의 인덱스 찾기
	int letterCIndex = alphabets.indexOf('c');
	System.out.println(letterCIndex); //2
	
	int letterDEFIndex = alphabets.indexOf("def");
	System.out.println(letterDEFIndex); //3

	
	String message = "abcdefghijklmnop";
	//6. lastIndexOf : 문자의 마지막 인덱스 찾기
	int letterALastIndex = message.lastIndexOf("a");
    System.out.println(letterALastIndex); //0
    
    letterALastIndex = message.lastIndexOf("jj");
    System.out.println(letterALastIndex);//-1 (없는값을 찾으면 -1 나옴)
    
    //7. length : 문자열 길이 구하기
    int length = message.length();
    System.out.println(length); //16

    
    //8. matches : 문자열 형태 확인하기
    String phone = "+82-010-1234-1234";
    boolean isNumber = phone.matches("^[0-9]+$");
    System.out.println(isNumber); //false
	
    //9. replace : 문자열 찾아 바꾸기
    String sentance = "안녕하세요, 홍길동님, 안녕히가세요,홍길동님.";
    String replacedSentance = sentance.replace("홍길동", "ktds");
    System.out.println(replacedSentance); //안녕하세요, ktds님, 안녕히가세요,ktds님.
    
    //10. replaceAll : 문자열 찾아 바꾸기(정규표현식 지원)
    // String phone = "01012341234";
    phone = phone.replaceAll("[^0-9]", ""); //숫자가아닌 문자를 공백문자로 변경
    System.out.println(phone); //8201012341234

	//11. startsWith : 파라미터로 시작하는지 확인
    // String phone = "8201012341234";
    boolean isKoreanNum = phone.startsWith("82");
    System.out.println(isKoreanNum); //true
    
    
    String datetime = "2023-06-08 13:23:23";
    //12. substring : 문자열 잘라냄
    String year = datetime.substring(0,4);
    System.out.println(year); //2023
    
    //datetime에서 13(시) 만 잘라내어 할당
    String hour = datetime.substring(11,13);
    System.out.println(hour); //13
    
    //datetime에서 시분초 글자만 잘라내어 할당
    String time = datetime.substring(11);
    System.out.println(time); //13:23:23

    
    //13. trim : 문자열 좌 / 우 공백제거
    String dateTime = " 2023-02-02 14:14:14  ";
    System.out.println(dateTime.length()); //22
    System.out.println(dateTime); // 2023-02-02 14:14:14  
    dateTime = dateTime.trim();
    System.out.println(dateTime.length()); //19
    System.out.println(dateTime); //2023-02-02 14:14:14 (문자열 앞뒤 공백제거됨)

    //14. int 타입 1을 문자열로 변경하기(Overloading)
    String iStr = String.valueOf(1); //int 형 1
    System.out.println(iStr); //문자열 1 반환
    // 15. int/boolean 등 아무타입에다가 +"" 해줘도 문자가 됨
    iStr = 1 + ""; 
    System.out.println(iStr); //문자열 1 반환
    
	}
}
