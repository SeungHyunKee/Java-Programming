package file_io.readfile;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Java 1.8버전 이상에서 사용할 수 있는 파일 읽기 예제
 * new IO (nio) 사용
 * (이 코드 내용은 완전히 외울것)
 */
public class NewIOReadAndPrintExam {

	public static void main(String[] args) {
		File file  = new File("C:\\Java Exam", "Java Exam.txt");
		if (file.exists() && file.isFile()) {
			List<String> fileLine = new ArrayList<>();
			try {
				// 파일을 처음부터 끝까지 모두 읽어와 List에 할당
//				Path filePath = Paths.get("C:\\JavaExam", "Java Exam.txt");
//				Charset utf8 = Charset.forName("UTF-8");
//				fileLine.addAll(Files.readAllLines(filePath, utf8));
				//위의 3줄을 toPath를 이용해서 아래 한줄로 적어준다
				fileLine.addAll(Files.readAllLines(file.toPath(), Charset.forName("UTF-8")));
			}
			catch( IOException ioe ) {
				//파일을 읽다가 예외가 발생했을때 예외 내용만 출력
				System.out.println(ioe.getMessage());
			}
			//읽어온 파일을 모두 출력
			for (String line : fileLine) {
				System.out.println(line);
			}
		}
	}
	
}
