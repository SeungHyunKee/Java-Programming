package generic_collection;

public class ScoreList<T> {
	
	/**
	 * ScoreList가 관리할 배열
	 */
	private Object[] scoreArray;
	
	/**
	 * 배열 내에 들어있는 아이템들의 수 <br/>
	 * 배열의 길이와는 관계가 없다.
	 */
	private int size;
	
	/**
	 * 생성자
	 */
	public ScoreList() {
		this.scoreArray = new Object[2];
	}
	
	/**
	 * scoreArray배열에 값을 추가한다.
	 * add(T score)를 호출 할 때마다 size 1씩 증가함
	 * @param score 제네릭에 할당된 타입의 인스턴스 혹은 값
	 */
	public void add(T score) {
		if ( size >= this.scoreArray.length) {
			Object[] tempScoreArray = new Object[scoreArray.length + 2];
			System.arraycopy(scoreArray, 0, //0번째 this.scoreArray의 값을
							 tempScoreArray, 0, // tempScoreArray의 0번째에 copy한다
							 scoreArray.length);
			//(원본배열, 원본배열에서 몇번째부터 복사할건지, 원본배열을 받을 새로운 배열, 
			// 새로운배열의 몇번째부터 복사할것인가, 원본배열에서 어디까지 복사할것인지)
			scoreArray = tempScoreArray; // temoScoreArray의 메모리를 this.scoreArray로 바꿔라
		}
		scoreArray[size] = score; //scoreArray의 [0]번 인덱스에 score값 넣어라
		size += 1;
	}
	
	/**
	 * scoreArray배열에서 index에 할당된 값 반환
	 * @param index 반환시킬 배열의 인덱스
	 * @return 인덱스에 들어있는 인스턴스 혹은 값
	 */
	public T get(int index) {
//		return null; //아무튼 T는 레퍼런스타입이기땨문에 null return
		if (index >= this.size) {
			throw new IndexOutOfBoundsException(index);
		}
		return (T) this.scoreArray[index];
	}
	
	/**
	 * scoreArray 배열에 인스턴스 혹은 값이 들어있는 개수
	 * 예)
	 * <pre>
	 *   int[] scoreArray = new int[100];
	 *   scoreArray[0] = 100;
	 *   scoreArray[1] = 100;
	 *   size()결과는 2 반환됨
	 * </pre>
	 * @return scoreArray 배열에 인스턴스 혹은 값이 들어있는 개수
	 */
	public int size() {
		return this.size;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("ScoreList[");
		for(int i = 0; i < size; i++) { //데이터가 있는만큼만 반복하기 위함
			sb.append(scoreArray[i] + ",");
		}
		sb.append("]");
		
		return sb.toString();
	}
}
