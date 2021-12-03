
public class ex1201_02 {
/*
 * names에 kim의 위치 x를 찾아, string을 반환하세요.
 * kim은 오직한번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.
 * 
 */
	public static void main(String[] args) {
		
		String[] names= {"Queen", "Tod","Kim"};
		System.out.println(findKim(names));

	}
	
	public static String findKim(String[] names) {
		int index=0;
		for(int i=0; i<names.length; i++) {
			if(names[i].equals("Kim")) {
				index=i+1;
			}
		}
		
		String ans="김서방은 "+index+"에 있다.";
		return ans;
		
	}

}
