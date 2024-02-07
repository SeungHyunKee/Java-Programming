package fp_java.ch03.slicing;

import java.util.ArrayList;
import java.util.List;

import fp_java.ch02.stream.vo.Dish;
import fp_java.ch02.stream.vo.DishData;

public class SlicingExample {

	public static void main(String[] args) {
		
		//칼로리가 300보다 큰 음식 중, 앞에 2개는 무시하고 나머지는 모두 출력
		List<Dish> menu = DishData.menu;
		
		List<Dish> dishes = new ArrayList<>();
		//칼로리가 300보다 큰거 가져오기
		for(Dish dish : menu) {
			if (dish.getCalories() > 300) {
				dishes.add(dish);
			}
		}
		System.out.println(dishes); //dishes리스트에는 칼로리300보다큰거 들어가잇음
		//[pork, beef, chicken, french fries, rice, pizza, salmon]
		
		for(int i = 0; i < dishes.size(); i++) {
			if (i >= 2){
				System.out.println(dishes.get(i));
			}
			
			
			
		//위에 for문을 Stream으로	
		menu.stream()
			.filter(dish -> dish.getCalories() > 300)
			.skip(2)
			.forEach(dish -> System.out.println("Stream: " + dish));
		
		System.out.println("=".repeat(40));
		
		//문제 : 타입(type)이 Dish.Type.MEAT이거나, Dish.Type.Other인 메뉴 중 
		//가장 앞 2개는 건너띄고 3개만 가져와서 메뉴의 이름을 출력
		menu.stream()
			.filter(dish -> dish.getType() == Dish.Type.MEAT 
						|| dish.getType() == Dish.Type.OTHER)
			.skip(2)
			.limit(3)
			.forEach(dish -> System.out.println("type: " + dish));
		
		
		}
	}
}
