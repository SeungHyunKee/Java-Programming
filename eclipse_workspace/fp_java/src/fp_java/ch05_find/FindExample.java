package fp_java.ch05_find;

import java.util.List;
import java.util.Optional;

import fp_java.ch02.stream.vo.Dish;
import fp_java.ch02.stream.vo.DishData;

public class FindExample {
	public static void main(String[] args) {
		
		List<Dish> menu = DishData.menu;
		
		//��Ʈ�����ο��� ������ ������ ��������
		Optional<Dish> vegeterianDish = menu.stream()
											.filter(dish -> dish.isVegetarian())
											.findAny();
		//Optional : �����Ͱ� null�ϼ���, �ƴҼ��� �ִ� Ư���� Ŭ����
		//orElse : OptionalData�� null�϶� other�� ���� ��ȯ��Ű���� �ϴ� �޼ҵ�
		Dish dish = vegeterianDish.orElse(null);
		System.out.println(dish); //french fries
		//�����Ͱ� ���� ��������, fineAny()�� findFirst()�� �������(ù��°��) ����
		
		
		Dish fatDish = menu.stream()
							.filter(d -> d.getCalories() > 1000) //���°� �������� ��
							.findFirst() //Optional<Dish>�� ��ȯ�� 
							.orElse(null); //findFirst����(������) ������ null ��ȯ���Ѷ�!
		System.out.println(fatDish); //null
		
	}
}
