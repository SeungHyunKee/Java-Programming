package fp_java_ch04.mapping;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Stream.map내부에서 새로운 Stream을 반환할때 사용
 */
public class FlatMapExample {

	public static void main(String[] args) {
		//word.txt파일 읽어서 List로 변환하기
		File file = new File("C:\\Java Exam", "word.txt");
		
		List<String> wordList = null;
		try {
			wordList = Files.readAllLines(file.toPath(), Charset.forName("UTF-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		System.out.println(wordList);
		
//		for (String line : wordList) {
//			String[] letterArray = line.split(""); //비어있는 ""로 split -> 글자 하나하나단위로 자름
//			for(String letter : letterArray) {
//				System.out.println(letter);
//			}
//		}
//		
		String joinedLetter = wordList.stream() //Stream<String> : 한줄한줄 들어있는 스트림이 만들어짐
					// peek : 스트림의 데이터가 어떻게 흘러가는지 보여줌(디버그용)
					.peek(line -> System.out.println("line: " + line)) 
					
					.map( line -> line.split("") ) //라인을 한글자한글자 자른것Stream<String[]>
			//				.peek(letterArray -> { //forEach()에는 바로윗줄의 string[]베열이 넘어옴
			//					System.out.println("Array: " + letterArray);
			//					for(String letter : letterArray) {
			//						System.out.println("Letter: " + letter);
			//					}
			//				}) 
					
					/* map내부에서 stream 반환시키는 중일때
					 * flatMap을 사용하게되면
					   반환된 Stream이 원본 Stream을 대체함 */
					.flatMap(letterArray -> Arrays.stream(letterArray)) //이렇게하면 스트림에 스트림을 또 넣게 되는 꼴
						.peek(letter -> System.out.println("Peek: " + letter))	
					.distinct() //중복제거
					
			//		map이 stream을 반환시킬때, flatMap을 쓰면 간단하게 작성할수 있다
			//				.forEach(letter -> System.out.println("> " + letter));	
					
					.collect(Collectors.joining()); //한글자씩 떨어진 글자들을 하나의 스트링으로 모아준다
		System.out.println(joinedLetter);

		
	}
}
