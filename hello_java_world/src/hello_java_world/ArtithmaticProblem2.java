package hello_java_world;

public class ArtithmaticProblem2 {

	public static void main(String[] args) {

		int processTime = 145;
		int minutes = 0;
		int seconds = 0;
		
		//processTime을 분, 초를 구한다음 minutes, seconds변수에 할당하고 출력
		minutes = processTime / 60;
		seconds = processTime % 60;
		
		System.out.println(minutes);
		System.out.println(seconds);
	}

}
