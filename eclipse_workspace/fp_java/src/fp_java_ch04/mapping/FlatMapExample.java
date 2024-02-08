package fp_java_ch04.mapping;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Stream.map���ο��� ���ο� Stream�� ��ȯ�Ҷ� ���
 */
public class FlatMapExample {

	public static void main(String[] args) {
		//word.txt���� �о List�� ��ȯ�ϱ�
		File file = new File("C:\\Java Exam", "word.txt");
		
		List<String> wordList = null;
		try {
			wordList = Files.readAllLines(file.toPath(), Charset.forName("UTF-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		System.out.println(wordList);
		
//		for (String line : wordList) {
//			String[] letterArray = line.split(""); //����ִ� ""�� split -> ���� �ϳ��ϳ������� �ڸ�
//			for(String letter : letterArray) {
//				System.out.println(letter);
//			}
//		}
//		
		String joinedLetter = wordList.stream() //Stream<String> : �������� ����ִ� ��Ʈ���� �������
					// peek : ��Ʈ���� �����Ͱ� ��� �귯������ ������(����׿�)
					.peek(line -> System.out.println("line: " + line)) 
					
					.map( line -> line.split("") ) //������ �ѱ����ѱ��� �ڸ���Stream<String[]>
			//				.peek(letterArray -> { //forEach()���� �ٷ������� string[]������ �Ѿ��
			//					System.out.println("Array: " + letterArray);
			//					for(String letter : letterArray) {
			//						System.out.println("Letter: " + letter);
			//					}
			//				}) 
					
					/* map���ο��� stream ��ȯ��Ű�� ���϶�
					 * flatMap�� ����ϰԵǸ�
					   ��ȯ�� Stream�� ���� Stream�� ��ü�� */
					.flatMap(letterArray -> Arrays.stream(letterArray)) //�̷����ϸ� ��Ʈ���� ��Ʈ���� �� �ְ� �Ǵ� ��
						.peek(letter -> System.out.println("Peek: " + letter))	
					.distinct() //�ߺ�����
					
			//		map�� stream�� ��ȯ��ų��, flatMap�� ���� �����ϰ� �ۼ��Ҽ� �ִ�
			//				.forEach(letter -> System.out.println("> " + letter));	
					
					.collect(Collectors.joining()); //�ѱ��ھ� ������ ���ڵ��� �ϳ��� ��Ʈ������ ����ش�
		System.out.println(joinedLetter);

		
	}
}
