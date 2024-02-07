package fp_java.ch02.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import fp_java.ch02.stream.vo.Dish;
import fp_java.ch02.stream.vo.DishData;

public class StreamExample {

	public static void main(String[] args) {
		
		List<Dish> menu = DishData.menu;
		
		List<String> lowCaloricDishesName = 
//				//List<Dish> -> Stream<Dish>로 변경시킴
//				menu.stream()
				
				//병렬처리를 하는 스트림
				menu.parallelStream()
				
					//filter : 조건에 만족하는 데이터검색
				    //filter(Predicate<Dish>) 
					//Predicate역할: dish를받아서 boolean으로 반환. true가 반환된것만 새로운 Stream으로 생성됨
					.filter(dish -> dish.getCalories() > 300) //filter가 새롭게 만들어준 새로운 Stream에 boolean연산결과가 들어감
					
					//sorted : 정렬시킴(정렬기준 주기) : 데이터 오름차순 정렬(칼로리기준)
					//sorted(Comparater<Dish>)
					//comparator -> compare(Dish1, Dish2)
					// 			 -> dish1.getCalories() - dish2.getCalories() : 오름차순
					// 			 -> dish2.getCalories() - dish1.getCalories() : 내림차순
					// 			 -> Comparator.comparing(Dish::getCalories) : 오름차순
					.sorted(Comparator.comparing(Dish::getCalories))
					//이걸람다로 바꿔본다면,(위 코드와 아래 코드 1줄씩은 완벽히 동일)
//					.sorted((dish1, dish2) -> dish1.getCalories() - dish2.getCalories())
//					.sorted(Comparator.comparing(dish -> dish.getCalories()))
					
					//여기서 말하는 map : 데이터변경!! map(데이터 변경시키고 싶은 식 적어줌)
					// map(Function<Dish, 반환되는 타입>)
					.map(Dish::getName) // Dish -> Name : 즉, 음식의 이름 ex) "salmon" 만 남는다
//					.map(dish -> dish.getName()) //윗줄 코드와동일
					
					//현재까지 처리된 Stream데이터에서 상위2개는 제외한다
					.skip(2)
					//현재까지 처리된 String데이터에서 가장 상위데이터 3개만 가져온다
					.limit(3)
					
					//List로 변경
					//최종함수 : Stream을 일반클래스 혹은 Primitive Type으로 반환.
					//Collectors.toList() -> Stream을 List로 변경.
					//이 때, Stream의 제네릭이 List에도 동일하게 전달
					//Steram<String> ==> List<String>
					.collect(Collectors.toList());
					// parallel stream이 발생시켰던 중복문제 해결하기
//					.stream()
//					.sorted()
//					.collect(Collectors.toList());
		
				
		lowCaloricDishesName //type : string
			//Stream 혹은 List의 데이터를 반복하며 Lambda를 수행
			//forEach(Consumer<String>)
			//Consumer -> String을 파라미터로 받아 VOID를 반환
			.forEach(System.out::println); //lowCaloricDishesName를 반복하며 system 수행해라
//			.forEach(menuName -> Sytem.out.println(menuName)); //윗줄코드와 동일
		
		
		
	}
}
