package fp_java.ch05_matching;

import java.util.List;

import fp_java.ch02.stream.vo.Dish;
import fp_java.ch02.stream.vo.DishData;

public class MatchExample {
	public static void main(String[] args) {
		
		List<Dish> menu = DishData.menu;
		
		//중간함수 => 전부다 Stream 반환시킴
		//filter
		//map, flatMap
		//distinct
		// skip, limit
		//peek
		
		//최종함수 <= Steram을 반환시키지 않는것
		//forEach : void
		//collect : T
		//anyMatch : boolean
		
		// Stream 내부에 채식요리가 한개라도 있으면 true, 그렇지 않다면 falses
		//방법1
		boolean isVegiterian = menu.stream() //Stream<Dish>가 만들어짐
									.anyMatch(dish -> dish.isVegetarian());
		//방법2
		long vegeterianCount = menu.stream()
									.filter(dish -> dish.isVegetarian()) 
									.count(); //최종함수 (long을 반환시킴
		//방법3 (방법1, 2와 동일)		
		if(vegeterianCount > 0) {
			System.out.println("채식주의자를 위한 요리가 준비되어있습니다!");
		}
		
		
		
		if(isVegiterian) {
			System.out.println("채식주의자를 위한 요리가 준비되어있습니다!");
		}
		
		
		
		
		//Stream 내부의 요리가 모두 1000kcal 미만이라면 true
		boolean isHealthy = menu.stream()
			.allMatch(dish -> dish.getCalories() < 1000);
		if (isHealthy) {
			System.out.println("우리 식다은 모두 다이어트 식단을 제공합니다!");
		}
		
		
		//Steram 내부의 요리 중 1000kcal를 초과하는 요리가 없다면 true
		//allMatch와 반대
		isHealthy = menu.stream()
			.noneMatch(dish -> dish.getCalories() > 1000);
		if(isHealthy) {
			System.out.println("우리 식당은 모두 다이어트 식단을 제공합니다! 2");
		}
		
		
		
	}
}
