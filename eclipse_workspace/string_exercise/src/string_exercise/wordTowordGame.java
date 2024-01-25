package string_exercise;

import java.util.Scanner;

public class wordTowordGame {
	
	public static void main(String[] args) {
			
		String startWord = "자전거";
		System.out.println("시작단어는 '자전거' 입니다.");
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		
		while (true) {
			System.out.println("다음 단어를 입력해 주세요");
			String nextWord = scanner.nextLine();
			nextWord = nextWord.trim();
			String startWordLastWord = startWord.substring(2); 
			String nextWordFirstWord = nextWord.substring(0,1); //length -1 해줘도 됨
			int lenNextWord = nextWord.length();
			
//			if (lenNextWord >= 3) {
//				if ( startWordLastWord.equals(nextWordFirstWord)) {
//					startWord = nextWord;
//					count++;
//				}
//				else {
//					System.out.println("이어나간 단어의 수: " + count);
//					break;
//				}
//			}else {
//				System.out.println("이어나간 단어의 수: " + count);
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
		System.out.println("이어나간 단어의 수: " + count);
		
		
		//문자열비교(Reference)는 반드시 .equals()로 비교하기
		Scanner keyboard = new Scanner(System.in);
		//문자열 비교
		String str1 = "한글"; // Reference Type (메모리주소 가지고 다님)
		String str2 = "한글"; // Reference Type (메모리주소 가지고 다님)
		System.out.println(str1==str2); // true
		// 여기서 str1 == str2 -> 메모리 주소가 같은지 판단하는 것
		// 디버깅 해보면 str1의 id=23, str2의 id = 23 으로 메모리 주소가 동일함
		
		// 사용자에게 입력받은 데이터는 같은 입력값을 받아도 다른 메모리가 나옴
		String str3 = keyboard.nextLine(); //'한글' 입력
		String str4 = keyboard.nextLine(); //'한글' 입력
		System.out.println(str3==str4); // true -> 메모리 주소 비교
		System.out.println(str3.equals(str4)); // 값을 비교
	}
	
}
