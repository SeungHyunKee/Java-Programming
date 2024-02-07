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
//				//List<Dish> -> Stream<Dish>�� �����Ŵ
//				menu.stream()
				
				//����ó���� �ϴ� ��Ʈ��
				menu.parallelStream()
				
					//filter : ���ǿ� �����ϴ� �����Ͱ˻�
				    //filter(Predicate<Dish>) 
					//Predicate����: dish���޾Ƽ� boolean���� ��ȯ. true�� ��ȯ�Ȱ͸� ���ο� Stream���� ������
					.filter(dish -> dish.getCalories() > 300) //filter�� ���Ӱ� ������� ���ο� Stream�� boolean�������� ��
					
					//sorted : ���Ľ�Ŵ(���ı��� �ֱ�) : ������ �������� ����(Į�θ�����)
					//sorted(Comparater<Dish>)
					//comparator -> compare(Dish1, Dish2)
					// 			 -> dish1.getCalories() - dish2.getCalories() : ��������
					// 			 -> dish2.getCalories() - dish1.getCalories() : ��������
					// 			 -> Comparator.comparing(Dish::getCalories) : ��������
					.sorted(Comparator.comparing(Dish::getCalories))
					//�̰ɶ��ٷ� �ٲ㺻�ٸ�,(�� �ڵ�� �Ʒ� �ڵ� 1�پ��� �Ϻ��� ����)
//					.sorted((dish1, dish2) -> dish1.getCalories() - dish2.getCalories())
//					.sorted(Comparator.comparing(dish -> dish.getCalories()))
					
					//���⼭ ���ϴ� map : �����ͺ���!! map(������ �����Ű�� ���� �� ������)
					// map(Function<Dish, ��ȯ�Ǵ� Ÿ��>)
					.map(Dish::getName) // Dish -> Name : ��, ������ �̸� ex) "salmon" �� ���´�
//					.map(dish -> dish.getName()) //���� �ڵ�͵���
					
					//������� ó���� Stream�����Ϳ��� ����2���� �����Ѵ�
					.skip(2)
					//������� ó���� String�����Ϳ��� ���� ���������� 3���� �����´�
					.limit(3)
					
					//List�� ����
					//�����Լ� : Stream�� �Ϲ�Ŭ���� Ȥ�� Primitive Type���� ��ȯ.
					//Collectors.toList() -> Stream�� List�� ����.
					//�� ��, Stream�� ���׸��� List���� �����ϰ� ����
					//Steram<String> ==> List<String>
					.collect(Collectors.toList());
					// parallel stream�� �߻����״� �ߺ����� �ذ��ϱ�
//					.stream()
//					.sorted()
//					.collect(Collectors.toList());
		
				
		lowCaloricDishesName //type : string
			//Stream Ȥ�� List�� �����͸� �ݺ��ϸ� Lambda�� ����
			//forEach(Consumer<String>)
			//Consumer -> String�� �Ķ���ͷ� �޾� VOID�� ��ȯ
			.forEach(System.out::println); //lowCaloricDishesName�� �ݺ��ϸ� system �����ض�
//			.forEach(menuName -> Sytem.out.println(menuName)); //�����ڵ�� ����
		
		
		
	}
}
