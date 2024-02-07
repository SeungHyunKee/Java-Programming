package fp_java.ch03.filtering;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import fp_java.ch02.stream.vo.Dish;
import fp_java.ch02.stream.vo.DishData;

public class FilteringExample {

	public static void main(String[] args) {
		//������� ������
		List<Dish> menu = DishData.menu;
		
		System.out.println(menu); //[pork, beef, chicken, french fries, rice, season fruit, pizza, prawns, salmon]
		
		for (Dish dish: menu) {
			if (dish.isVegetarian()) {
			//�޴��� �̸��� ä�Ŀ���
			System.out.println("�̸�: " + dish); //�޴���
			System.out.println("ä�Ŀ���: " + dish.isVegetarian()); // false = ä�ľƴ�
			}
		}
		
		//��Ʈ���� .~~ .~~ .~~ �����ٿ� �Ⱦ���, �ٸ����ؼ� ���η� ����
		// List �� Stream���� �����ϸ�, [ Steram�� Generic = List�� Generic ] �� ��
		menu.stream() //Stream<Dish>
		
			//�� filter�� ���� ���� ��
			//Stream<Dish> = {french fries, rice, season fruit};
			.filter((Dish dish) -> dish.isVegetarian()) //boolean�� ����� true��� ��Ʈ������ �������
			
			//�ݺ��ϸ� ���
			//forEach : Consumer<Dish> : filter�� ������� ���ο� Stream<Dish>�� �ݺ��ϰڴ�	
			.forEach((Dish dish) -> {
				System.out.println("Stream �̸�: " + dish); //�޴���
				System.out.println("Stream ä�Ŀ���: " + dish.isVegetarian()); // false = ä�ľƴ�
			});
		
			
		//������� ���͸� distinct()
		List<Integer> numbers = Arrays.asList(1,2,1,3,3,2,4);
		//¦���� �߷��ͼ� �ߺ��� �����ϰ� �������� ����Ѵ�.
		
		//¦���� ������ ����Ʈ
		List<Integer> evenNumbers = new ArrayList<>();
		for(int number : numbers) {
			if ( number % 2 == 0) {
				if (!evenNumbers.contains(number)) { //������ �־��
					evenNumbers.add(number);
				}
				else {
					
				}
			}
		}
		System.out.println(evenNumbers); // [2, 4]
		
		numbers.stream() //Stream<Integer>�� �������
			.filter((Integer n) -> n % 2 == 0) //��� : Steram<Integer> = {2,2,4}
			//Stream<Integer> = {2,4}
			.distinct() //�˾Ƽ� �ߺ��� ����
			.forEach((Integer n) -> System.out.println(n));
			;
		
		
		// ��Ʈ�� ��� : �޴� �� Į�θ��� 300���� ū �� �� �ƹ��ų�(���ľȵ� �������� ��) 3�� �����ͼ� ��ȸ
		// for������ : 1. 3���� ���� ���ο� array list �������
		List<Dish> dishes = new ArrayList<>();
		for (Dish dish : menu) {
			if (dish.getCalories() > 300) {
				dishes.add(dish);
			}
			if (dishes.size() == 3) {
				break;
			}
		}System.out.println(dishes);
	
		// ��Ʈ�� ���ο��� �տ��ִ� �ƹ��ų� 3�� �����Ͷ�
		menu.stream()
			.filter((Dish dish) -> dish.getCalories() > 300)
			.limit(3)
			.forEach((Dish dish) -> {
				System.out.println("Į�θ��� 300���� ū ������ 3���� ����: " + dish); // false = ä�ľƴ�
			});
	}
	
}
