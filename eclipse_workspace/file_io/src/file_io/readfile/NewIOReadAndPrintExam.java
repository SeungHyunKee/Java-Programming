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
 * Java 1.8���� �̻󿡼� ����� �� �ִ� ���� �б� ����
 * new IO (nio) ���
 * (�� �ڵ� ������ ������ �ܿ��)
 */
public class NewIOReadAndPrintExam {

	public static void main(String[] args) {
		File file  = new File("C:\\Java Exam", "Java Exam.txt");
		if (file.exists() && file.isFile()) {
			List<String> fileLine = new ArrayList<>();
			try {
				// ������ ó������ ������ ��� �о�� List�� �Ҵ�
//				Path filePath = Paths.get("C:\\JavaExam", "Java Exam.txt");
//				Charset utf8 = Charset.forName("UTF-8");
//				fileLine.addAll(Files.readAllLines(filePath, utf8));
				//���� 3���� toPath�� �̿��ؼ� �Ʒ� ���ٷ� �����ش�
				fileLine.addAll(Files.readAllLines(file.toPath(), Charset.forName("UTF-8")));
			}
			catch( IOException ioe ) {
				//������ �дٰ� ���ܰ� �߻������� ���� ���븸 ���
				System.out.println(ioe.getMessage());
			}
			//�о�� ������ ��� ���
			for (String line : fileLine) {
				System.out.println(line);
			}
		}
	}
	
}
