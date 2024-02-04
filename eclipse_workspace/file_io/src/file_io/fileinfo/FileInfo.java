package file_io.fileinfo;

import java.io.File;
import java.util.Date;

public class FileInfo {

	public static void main(String[] args) {

		File file = new File("C:\\Java Exam", "Java Exam.txt");
//		File file = new File("C:\\Java Exam");
//		File file = new File("C:\\"); // ->.listFiles() : nullpointer발생 (자바가 C드라이브에 접근할수없게 막아놓음) 

		//파일이 존재하면 true, 아니면 false
		boolean isFileExists = file.exists();
		System.out.println("isFileExists >" + isFileExists); 
		
		//읽어온 File 인스턴스가 파일이라면 true, 폴더라면 false
		boolean isFile = file.isFile();
		System.out.println("isFile >" + isFile); 

		//읽어온 File 인스턴스가 폴더(디렉토리)라면 true, 파일이라면 false
		boolean isDirectory = file.isDirectory();
		System.out.println("isDirectory >" + isDirectory);

		//File인스턴스가 가리키고있는 폴더 또는 파일의 '전체경로'
		String fileAbsolutePath = file.getAbsolutePath();
		System.out.println("fileAbsolutePath >" + fileAbsolutePath);

		//File 인스턴스가 가리키고 있는 것이 폴더라면 폴더이름, 
		// 파일이라면 확장자 포함한 타입의 이름
		String fileName = file.getName();
		System.out.println("fileName >" + fileName);

		// file 인스턴스가 가리키고 있는 파일의 크기(byte로 가져옴)
		// 1byte = 1, 
		// 1kb = 1024(windows기준 1024, windows 아닐경우 1000) 
		// 1 mb = 1024*1024, 
		// 1gb = 1024*1024*1024
		// 1tb = 1024*1024*1024*1024
		// 1pb = 1024*1024*10241024*1024
		long length = file.length();
		System.out.println("length >" + length);

		//파일이 마지막으로 수정된 날짜와 시간
		// 컴퓨터의 시간기준 : 1970년 1월 1일 00:00:00 이때부터 흘러간 초 를 보여줌
		// (KST 코리안타임)-> 1970년 1월 1일 09:00:00  
		// 이 초 * 1000해서 돌려줌 -> 숫자가 나옴
		long lastModifiedTime = file.lastModified(); //long은 날짜와 시간 반환시킴
		System.out.println("lastModifiedTime >" + lastModifiedTime);
		// long 타입의 날짜와 시간을 -> 문자로 된 날짜와 시간으로 변환
		Date date = new Date(lastModifiedTime);
		System.out.println("lastModifiedTime(Date) >" + date);
		
		/*getParent 2가지
		getParent() : 부모파일의 경로가 '문자열'로 나옴
		getParentFile(); -> 부모폴더의 다른 파일들이 '파일인스턴스'로 나옴
		*/
		//현재파일이 존재하는 '부모(상위)폴더의 경로'가 '문자열' 로 나옴
		String parentPath = file.getParent();	
		System.out.println("parentPath >" + parentPath);

		//현재파일이 존재하는 부모(상위)폴더의 새로운 File 인스턴스
		File parentFile = file.getParentFile();
		System.out.println("parentFile >" + parentFile);
		System.out.println("parentFileAbsolutePath >" + parentFile.getAbsolutePath());

		
		// File 인스턴스가 폴더일때, 폴더내부에 존재하는 모든 폴더와 파일목록 반환
		File[] listFileArray = file.listFiles(); //listFiles() : 배열로 반환해줌
		// 폴더가 아닌 파일안에 다른 폴더나 파일이 없으면, 
		// listFileArray는 null값임 -> NullPointerException 발생
		for(File item : listFileArray) {
			System.out.println("listFileArray >" + item.getAbsolutePath());
		}		
	}
}
