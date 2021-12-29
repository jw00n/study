package ArrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//ArrayList
		//Collection 파트는 스스로 
		
		//String을 자료형으로 갖는 ArrayList를 생성
		//<> : 제네릭 기법
		ArrayList<String> list = new ArrayList<String>();
		
		//2. 데이터 삽입
		list.add("붕어빵");
		list.add("제육볶음");
		list.add("연어");
		
		//3. 데이터 가져오기
		System.out.println(list.get(1));

		//4. 데이터 삭제하기.
		list.remove(1);
		System.out.println(list.get(1));
		
		//5. ArrayList의 크기 
		System.out.println(list.size());
		
	}

}
