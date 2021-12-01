
public class ex04 {
	public static void main(String[] args) {
		//1) string 배열 3칸 생성하기
		String[] lunchs=new String[3];

		//2) 점심메뉴 3개 저장하기
		lunchs[0] = "제육볶음";
		lunchs[1] = "제육볶음";
		lunchs[2] = "제육볶음";
		
		System.out.println(lunchs);
		
		String[] names= {"오정운","노미란","임정환","김도현","양민준"};
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
	}
}
