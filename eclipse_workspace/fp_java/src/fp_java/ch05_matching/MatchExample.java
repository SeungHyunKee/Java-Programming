package fp_java.ch05_matching;

import java.util.List;

import fp_java.ch02.stream.vo.Dish;
import fp_java.ch02.stream.vo.DishData;

public class MatchExample {
	public static void main(String[] args) {
		
		List<Dish> menu = DishData.menu;
		
		//�߰��Լ� => ���δ� Stream ��ȯ��Ŵ
		//filter
		//map, flatMap
		//distinct
		// skip, limit
		//peek
		
		//�����Լ� <= Steram�� ��ȯ��Ű�� �ʴ°�
		//forEach : void
		//collect : T
		//anyMatch : boolean
		
		// Stream ���ο� ä�Ŀ丮�� �Ѱ��� ������ true, �׷��� �ʴٸ� falses
		//���1
		boolean isVegiterian = menu.stream() //Stream<Dish>�� �������
									.anyMatch(dish -> dish.isVegetarian());
		//���2
		long vegeterianCount = menu.stream()
									.filter(dish -> dish.isVegetarian()) 
									.count(); //�����Լ� (long�� ��ȯ��Ŵ
		//���3 (���1, 2�� ����)		
		if(vegeterianCount > 0) {
			System.out.println("ä�������ڸ� ���� �丮�� �غ�Ǿ��ֽ��ϴ�!");
		}
		
		
		
		if(isVegiterian) {
			System.out.println("ä�������ڸ� ���� �丮�� �غ�Ǿ��ֽ��ϴ�!");
		}
		
		
		
		
		//Stream ������ �丮�� ��� 1000kcal �̸��̶�� true
		boolean isHealthy = menu.stream()
			.allMatch(dish -> dish.getCalories() < 1000);
		if (isHealthy) {
			System.out.println("�츮 �Ĵ��� ��� ���̾�Ʈ �Ĵ��� �����մϴ�!");
		}
		
		
		//Steram ������ �丮 �� 1000kcal�� �ʰ��ϴ� �丮�� ���ٸ� true
		//allMatch�� �ݴ�
		isHealthy = menu.stream()
			.noneMatch(dish -> dish.getCalories() > 1000);
		if(isHealthy) {
			System.out.println("�츮 �Ĵ��� ��� ���̾�Ʈ �Ĵ��� �����մϴ�! 2");
		}
		
		
		
	}
}
