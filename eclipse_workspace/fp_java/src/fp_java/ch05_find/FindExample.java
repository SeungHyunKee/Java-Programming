package fp_java.ch05_find;

import java.util.List;
import java.util.Optional;

import fp_java.ch02.stream.vo.Dish;
import fp_java.ch02.stream.vo.DishData;

public class FindExample {
	public static void main(String[] args) {
		
		List<Dish> menu = DishData.menu;
		
		//스트림내부에서 임의의 데이터 가져오기
		Optional<Dish> vegeterianDish = menu.stream()
											.filter(dish -> dish.isVegetarian())
											.findAny();
		//Optional : 데이터가 null일수도, 아닐수도 있는 특별한 클래스
		//orElse : OptionalData가 null일때 other의 값을 반환시키도록 하는 메소드
		Dish dish = vegeterianDish.orElse(null);
		System.out.println(dish); //french fries
		//데이터가 많이 없을때는, fineAny()랑 findFirst()랑 같은결과(첫번째값) 나옴
		
		
		Dish fatDish = menu.stream()
							.filter(d -> d.getCalories() > 1000) //없는값 가져오게 함
							.findFirst() //Optional<Dish>가 반환됨 
							.orElse(null); //findFirst값이(데이터) 없으면 null 반환시켜라!
		System.out.println(fatDish); //null
		
	}
}
