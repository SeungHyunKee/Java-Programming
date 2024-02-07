package fp_java.ch03.filtering;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import fp_java.ch02.stream.vo.Dish;
import fp_java.ch02.stream.vo.DishData;

public class FilteringExample {

	public static void main(String[] args) {
		//상수부터 가져옴
		List<Dish> menu = DishData.menu;
		
		System.out.println(menu); //[pork, beef, chicken, french fries, rice, season fruit, pizza, prawns, salmon]
		
		for (Dish dish: menu) {
			if (dish.isVegetarian()) {
			//메뉴의 이름과 채식여부
			System.out.println("이름: " + dish); //메뉴명
			System.out.println("채식여부: " + dish.isVegetarian()); // false = 채식아님
			}
		}
		
		//스트림은 .~~ .~~ .~~ 같은줄에 안쓰고, 줄맞춤해서 세로로 쓴다
		// List 를 Stream으로 변경하면, [ Steram의 Generic = List의 Generic ] 이 됨
		menu.stream() //Stream<Dish>
		
			//이 filter를 제일 많이 씀
			//Stream<Dish> = {french fries, rice, season fruit};
			.filter((Dish dish) -> dish.isVegetarian()) //boolean의 결과가 true라면 스트림으로 만들어줌
			
			//반복하며 출력
			//forEach : Consumer<Dish> : filter가 만들어준 새로운 Stream<Dish>를 반복하겠다	
			.forEach((Dish dish) -> {
				System.out.println("Stream 이름: " + dish); //메뉴명
				System.out.println("Stream 채식여부: " + dish.isVegetarian()); // false = 채식아님
			});
		
			
		//고유요소 필터링 distinct()
		List<Integer> numbers = Arrays.asList(1,2,1,3,3,2,4);
		//짝수만 추려와서 중복을 제거하고 나머지를 출력한다.
		
		//짝수만 보관할 리스트
		List<Integer> evenNumbers = new ArrayList<>();
		for(int number : numbers) {
			if ( number % 2 == 0) {
				if (!evenNumbers.contains(number)) { //없으면 넣어라
					evenNumbers.add(number);
				}
				else {
					
				}
			}
		}
		System.out.println(evenNumbers); // [2, 4]
		
		numbers.stream() //Stream<Integer>로 만들어짐
			.filter((Integer n) -> n % 2 == 0) //결과 : Steram<Integer> = {2,2,4}
			//Stream<Integer> = {2,4}
			.distinct() //알아서 중복값 제거
			.forEach((Integer n) -> System.out.println(n));
			;
		
		
		// 스트림 축소 : 메뉴 중 칼로리가 300보다 큰 것 중 아무거나(정렬안된 데이터의 앞) 3개 가져와서 조회
		// for문으로 : 1. 3개만 담을 새로운 array list 만들어줌
		List<Dish> dishes = new ArrayList<>();
		for (Dish dish : menu) {
			if (dish.getCalories() > 300) {
				dishes.add(dish);
			}
			if (dishes.size() == 3) {
				break;
			}
		}System.out.println(dishes);
	
		// 스트림 내부에서 앞에있는 아무거나 3개 가져와라
		menu.stream()
			.filter((Dish dish) -> dish.getCalories() > 300)
			.limit(3)
			.forEach((Dish dish) -> {
				System.out.println("칼로리가 300보다 큰 랜덤한 3가지 음식: " + dish); // false = 채식아님
			});
	}
	
}
