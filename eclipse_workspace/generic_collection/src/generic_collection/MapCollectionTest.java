package generic_collection;

import java.util.HashMap;
import java.util.Map;

public class MapCollectionTest {

	public static void main(String[] args) {
		Map<String, Integer> priceMap = new HashMap<>();
		//1. Map�� ������ �߰�
		// MAP���� ��� reference type(ex, string, list ��) ���� �� ����
		priceMap.put("Apple Macbook Pro", 3_500_000);
		priceMap.put("SamSung Galaxy Book", 1_500_000);
		priceMap.put("LG Gram", 1_700_000);
		// Put�� �ǹ� : ������ �����, ������ �����ض�
		// -> ����Ű�� ������ �ٸ� value�� �־��ָ�, LG Gram������ Value������ ������
	
		System.out.println(priceMap); //{LG Gram=1700000, SamSung Galaxy Book=1500000, Apple Macbook Pro=3500000}
		System.out.println(priceMap.size()); //3

		priceMap.put("LG Gram", 1_800_000);
		System.out.println(priceMap); // {LG Gram=1800000, SamSung Galaxy Book=1500000, Apple Macbook Pro=3500000}
		System.out.println(priceMap.size()); //3
		
		//2. Map ������ ��ȸ
		int applePrice = priceMap.get("Apple Macbook Pro");
		System.out.println(applePrice);
//		applePrice = priceMap.get("apple macbook pro");
//		System.out.println(applePrice); //NullPointerException
		
		//3. Map ������ ����
		priceMap.remove("Apple Macbook Pro"); //���ﶩ remove�� Ű����������
		System.out.println(priceMap); //{LG Gram=1800000, SamSung Galaxy Book=1500000}
		System.out.println(priceMap.size()); //2
		
		
		//4. Map������ ��λ���
		priceMap.clear();
		System.out.println(priceMap); //{}
		System.out.println(priceMap.size()); //0		
		
		
		//5. Map����ִ��� Ȯ��
		boolean isEmpty = priceMap.isEmpty();
		//isEmptyüũ�� �ݵ�� �� ���� nullüũ���� ���ֱ�
		System.out.println(isEmpty); //true
		System.out.println(priceMap); //{} 
		System.out.println(priceMap.size()); //0
		
		
		//6. Map�� ������ Key�� �ִ��� Ȯ��
		priceMap.put("Apple Macbook Pro", 3_500_000);
		priceMap.put("SamSung Galaxy Book", 1_500_000);
		priceMap.put("LG Gram", 1_700_000);
		if ( !priceMap.containsKey("LG Gram")) { //Ű���� ���ٸ� �Ʒ� �ڵ� ����
			priceMap.put("LG Gram", 1_600_000);
		}
		System.out.println(priceMap); // {LG Gram=1700000, SamSung Galaxy Book=1500000, Apple Macbook Pro=3500000}
		System.out.println(priceMap.size()); // 3
			
		
		//7. Map�� ������ value�� �ִ��� Ȯ��
		//���, key�� �ߺ��� �ȵǴ°�����, value�ߺ��� ����. containsValue()�� �� �Ⱦ�
		if ( priceMap.containsValue(1_700_000)) {
			priceMap.put("LG Gram", 1_600_000);
		}
		System.out.println(priceMap); // {LG Gram=1600000, SamSung Galaxy Book=1500000, Apple Macbook Pro=3500000}

		System.out.println(priceMap.size()); // 3
		
		//8. Map ����
		Map<String, Integer> priceMap2 = new HashMap<>();
		priceMap2.putAll(priceMap2);
		
		System.out.println(System.identityHashCode(priceMap));
		System.out.println(priceMap);
		System.out.println(priceMap.size());
		
		System.out.println(System.identityHashCode(priceMap2));
		System.out.println(priceMap2);
		System.out.println(priceMap2.size());

		/* 664740647
		  {LG Gram=1600000, SamSung Galaxy Book=1500000, Apple Macbook Pro=3500000}
		  3
		  804564176
		  {}
		  0
		 */
	}
}
