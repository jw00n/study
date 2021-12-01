import java.util.Scanner;


public class ex03 {

	public static void main(String[] args) {

//		회원가입 시 아이디 중복체크 기능 구현하기
//		회원 다섯명 아이디 저장해놓기
		String[] Ids = { "이은비", "이명훈", "김동원", "서대희", "김미희" };

//		새로 가입할 아이디 입력받기

		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 입력 >> ");
		String input = sc.next();

//		중복아이디 있는지 검사

		boolean flag = false;
		for (int i = 0; i < Ids.length; i++) {
			if (input.equals(Ids[i])) {
				flag = true;
			}
		}

		if (flag == true)
			System.out.println("중복입니다.");
		else
			System.out.println("중복이 아닙니다.");
	}
}
