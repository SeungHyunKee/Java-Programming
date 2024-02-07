package fp_java.ch03.slicing;

import java.util.ArrayList;
import java.util.List;

import fp_java.ch02.stream.vo.Dish;
import fp_java.ch02.stream.vo.DishData;

public class SlicingExample {

	public static void main(String[] args) {
		
		//Į�θ��� 300���� ū ���� ��, �տ� 2���� �����ϰ� �������� ��� ���
		List<Dish> menu = DishData.menu;
		
		List<Dish> dishes = new ArrayList<>();
		//Į�θ��� 300���� ū�� ��������
		for(Dish dish : menu) {
			if (dish.getCalories() > 300) {
				dishes.add(dish);
			}
		}
		System.out.println(dishes); //dishes����Ʈ���� Į�θ�300����ū�� ������
		//[pork, beef, chicken, french fries, rice, pizza, salmon]
		
		for(int i = 0; i < dishes.size(); i++) {
			if (i >= 2){
				System.out.println(dishes.get(i));
			}
			
			
			
		//���� for���� Stream����	
		menu.stream()
			.filter(dish -> dish.getCalories() > 300)
			.skip(2)
			.forEach(dish -> System.out.println("Stream: " + dish));
		
		System.out.println("=".repeat(40));
		
		//���� : Ÿ��(type)�� Dish.Type.MEAT�̰ų�, Dish.Type.Other�� �޴� �� 
		//���� �� 2���� �ǳʶ�� 3���� �����ͼ� �޴��� �̸��� ���
		menu.stream()
			.filter(dish -> dish.getType() == Dish.Type.MEAT 
						|| dish.getType() == Dish.Type.OTHER)
			.skip(2)
			.limit(3)
			.forEach(dish -> System.out.println("type: " + dish));
		
		
		}
	}
}
