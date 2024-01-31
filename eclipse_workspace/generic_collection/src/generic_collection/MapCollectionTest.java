package generic_collection;

import java.util.HashMap;
import java.util.Map;

public class MapCollectionTest {

	public static void main(String[] args) {
		Map<String, Integer> priceMap = new HashMap<>();
		//1. Map에 데이터 추가
		// MAP에는 모든 reference type(ex, string, list 등) 넣을 수 있음
		priceMap.put("Apple Macbook Pro", 3_500_000);
		priceMap.put("SamSung Galaxy Book", 1_500_000);
		priceMap.put("LG Gram", 1_700_000);
		// Put의 의미 : 없으면 만들고, 있으면 수정해라
		// -> 같은키를 가지고 다른 value값 넣어주면, LG Gram에대한 Value값만이 수정됨
	
		System.out.println(priceMap); //{LG Gram=1700000, SamSung Galaxy Book=1500000, Apple Macbook Pro=3500000}
		System.out.println(priceMap.size()); //3

		priceMap.put("LG Gram", 1_800_000);
		System.out.println(priceMap); // {LG Gram=1800000, SamSung Galaxy Book=1500000, Apple Macbook Pro=3500000}
		System.out.println(priceMap.size()); //3
		
		//2. Map 데이터 조회
		int applePrice = priceMap.get("Apple Macbook Pro");
		System.out.println(applePrice);
//		applePrice = priceMap.get("apple macbook pro");
//		System.out.println(applePrice); //NullPointerException
		
		//3. Map 데이터 삭제
		priceMap.remove("Apple Macbook Pro"); //지울땐 remove로 키값으로접근
		System.out.println(priceMap); //{LG Gram=1800000, SamSung Galaxy Book=1500000}
		System.out.println(priceMap.size()); //2
		
		
		//4. Map데이터 모두삭제
		priceMap.clear();
		System.out.println(priceMap); //{}
		System.out.println(priceMap.size()); //0		
		
		
		//5. Map비어있는지 확인
		boolean isEmpty = priceMap.isEmpty();
		//isEmpty체크시 반드시 그 전에 null체크부터 해주기
		System.out.println(isEmpty); //true
		System.out.println(priceMap); //{} 
		System.out.println(priceMap.size()); //0
		
		
		//6. Map에 동일한 Key가 있는지 확인
		priceMap.put("Apple Macbook Pro", 3_500_000);
		priceMap.put("SamSung Galaxy Book", 1_500_000);
		priceMap.put("LG Gram", 1_700_000);
		if ( !priceMap.containsKey("LG Gram")) { //키값이 없다면 아래 코드 실행
			priceMap.put("LG Gram", 1_600_000);
		}
		System.out.println(priceMap); // {LG Gram=1700000, SamSung Galaxy Book=1500000, Apple Macbook Pro=3500000}
		System.out.println(priceMap.size()); // 3
			
		
		//7. Map에 동일한 value가 있는지 확인
		//사실, key가 중복이 안되는것이지, value중복은 흔함. containsValue()는 잘 안씀
		if ( priceMap.containsValue(1_700_000)) {
			priceMap.put("LG Gram", 1_600_000);
		}
		System.out.println(priceMap); // {LG Gram=1600000, SamSung Galaxy Book=1500000, Apple Macbook Pro=3500000}

		System.out.println(priceMap.size()); // 3
		
		//8. Map 복사
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
