package generic_collection;

import java.util.ArrayList;
import java.util.List;

/*
 * # 로또 번호 6개를 ArrayList 에 할당하세요.

> 1 부터 45 중 랜덤한 숫자를 만들어
> 
> ArrayList 인스턴스에 넣습니다.
> 이때, 생성된 난수의 값이 ArrayList 인스턴스에 이미 존재하는 값이라면, 인스턴스에 넣어서는 안됩니다.
> 
> 따라서 ArrayList 인스턴스의 값들은 모두 고유한 값이어야 합니다.
> 
> ArrayList 내부의 아이템 개수가 6이 될 때까지, 고유한 값들을 넣고
> 
> 출력하는 코드를 작성하세요.
 */

public class LottoNumberArrayList {
	public static void main(String[] args) {
		// 로또 번호 6개를 넣을 ArrayList 생성
		List<Integer> lottoNumList = new ArrayList<>();
		
		while ( lottoNumList.size() < 7) {
			
			//난수 생성(0.0000000)
			double randomNumber = Math.random();
			//난수를 1~45 사이의 정수로 변환
			int lottoNum = ((int) (randomNumber * 100)) / 2 + 1;
			
			if ( ! lottoNumList.contains(lottoNum)) {
				lottoNumList.add(lottoNum);
			}
		}
		System.out.println(lottoNumList);
	}
}


	
	

