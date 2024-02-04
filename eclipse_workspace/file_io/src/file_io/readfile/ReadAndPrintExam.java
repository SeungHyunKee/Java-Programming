package file_io.readfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;


/**
 * 파일을 읽어 내용을 출력하는 코드
 */
public class ReadAndPrintExam {
	
	public static List<String> getAllLines(File file){
				
		if (file.exists() && file.isFile()) {
		
			FileReader reader = null;
			BufferedReader bufferedReader = null;
			try {
				// 파일을 바이트 단위로 읽어오는 FileReader를 선언 (파이프 역할)
				reader = new FileReader(file, Charset.forName("UTF-8"));
				// 파일을 라인 단위로 읽어오는 BufferedReader 선언
				bufferedReader = new BufferedReader(reader);
				// 파일을 라인단위로 읽어와 할당하기 위한 String 변수 선언(파이프 역할)				
				
				List<String> lineList = new ArrayList<>();
				
				/*
				 * 원본내용을 써주기 위함
				 */
				String line = null;  
				// 파일이 끝날 때 까지(EOF : end of file) 반복하며 line 변수에 한 줄 씩 읽어오기
				while((line = bufferedReader.readLine()) != null ) {; //readLine : 한줄 읽는것
					lineList.add(line+ "\n"); //한줄한줄읽어서 lineList에 넣어주기
				}
				return lineList;
			}
		
			catch (IOException ioe) { // 파일을 읽다가 예외 발생하면 예외 메시지만 출력
				System.out.println(ioe.getMessage());
				ioe.printStackTrace();
			}	
			// 파일을 끝까지 읽었거나 예외가 발생했을 경우 : FileReader를 닫아준다. 
			// 닫는 순서는 연 순서의 반대로 하는게 안전함
			finally { // 파일을 끝까지 읽었거나 예외가 발생했을 경우 BufferedReader, reader 순서로 닫아준다
				if(bufferedReader != null) {
					try {
						bufferedReader.close(); //열었던 파이프 닫는 용도 
						// (안닫아주면 메모리 누수가 생김. 쓸데없는 메모리가 계속 상주해 있으므로
					}
					catch(IOException ioe) {} //close할때 에러나도 할 수 있는 방법이 없기때문에 이렇게 써주는게 최선임
				}	
				if(reader != null) {
					try {
						reader.close();
					}
					catch(IOException ioe) {}
					}
				}
			}
		//텅 빈 리스트 반환(nullPointerException 방지 위함)
		return new ArrayList<>();
		}
	
	
	public static void main(String[] args) {
		
		File file = new File("C:\\Java exam", "Java Exam.txt");
		
		if (file.exists() && file.isFile()) {
		
			FileReader reader = null;
			BufferedReader bufferedReader = null;
			try {
				// 파일을 바이트 단위로 읽어오는 FileReader를 선언 (파이프 역할)
				reader = new FileReader(file, Charset.forName("UTF-8"));
				// 파일을 라인 단위로 읽어오는 BufferedReader 선언
				bufferedReader = new BufferedReader(reader);
				// 파일을 라인단위로 읽어와 할당하기 위한 String 변수 선언(파이프 역할)				
				String line = null;
				// 파일이 끝날 때 까지(EOF : end of file) 반복하며 line 변수에 한 줄 씩 읽어오기
				while((line = bufferedReader.readLine()) != null ) {; //readLine : 한줄 읽는것

					System.out.println(line);
				}
			}
		
			catch (IOException ioe) { // 파일을 읽다가 예외 발생하면 예외 메시지만 출력
				System.out.println(ioe.getMessage());
				ioe.printStackTrace();
			}	
			// 파일을 끝까지 읽었거나 예외가 발생했을 경우 : FileReader를 닫아준다. 
			// 닫는 순서는 연 순서의 반대로 하는게 안전함
			finally { // 파일을 끝까지 읽었거나 예외가 발생했을 경우 BufferedReader, reader 순서로 닫아준다
				if(bufferedReader != null) {
					try {
						bufferedReader.close(); //열었던 파이프 닫는 용도 
						// (안닫아주면 메모리 누수가 생김. 쓸데없는 메모리가 계속 상주해 있으므로
					}
					catch(IOException ioe) {} //close할때 에러나도 할 수 있는 방법이 없기때문에 이렇게 써주는게 최선임
				}	
				if(reader != null) {
					try {
						reader.close();
					}
					catch(IOException ioe) {}
					}
				}
			}
		}
	}

