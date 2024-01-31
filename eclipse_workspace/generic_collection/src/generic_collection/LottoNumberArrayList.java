package generic_collection;

import java.util.ArrayList;
import java.util.List;

/*
 * # �ζ� ��ȣ 6���� ArrayList �� �Ҵ��ϼ���.

> 1 ���� 45 �� ������ ���ڸ� �����
> 
> ArrayList �ν��Ͻ��� �ֽ��ϴ�.
> �̶�, ������ ������ ���� ArrayList �ν��Ͻ��� �̹� �����ϴ� ���̶��, �ν��Ͻ��� �־�� �ȵ˴ϴ�.
> 
> ���� ArrayList �ν��Ͻ��� ������ ��� ������ ���̾�� �մϴ�.
> 
> ArrayList ������ ������ ������ 6�� �� ������, ������ ������ �ְ�
> 
> ����ϴ� �ڵ带 �ۼ��ϼ���.
 */

public class LottoNumberArrayList {
	public static void main(String[] args) {
		// �ζ� ��ȣ 6���� ���� ArrayList ����
		List<Integer> lottoNumList = new ArrayList<>();
		
		while ( lottoNumList.size() < 7) {
			
			//���� ����(0.0000000)
			double randomNumber = Math.random();
			//������ 1~45 ������ ������ ��ȯ
			int lottoNum = ((int) (randomNumber * 100)) / 2 + 1;
			
			if ( ! lottoNumList.contains(lottoNum)) {
				lottoNumList.add(lottoNum);
			}
		}
		System.out.println(lottoNumList);
	}
}


	
	

