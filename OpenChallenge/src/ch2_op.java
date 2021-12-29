import java.util.Scanner;

//오픈 챌린지 ch2 가위바위보 게임 누가 이겼는지 출력하시오.
public class ch2_op {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위바위보를 입력하세요");

		System.out.print("영희>>");
		String str1 = sc.next();
		System.out.print("철수>>");
		String str2 = sc.next();

		// 가위바위보를 뭘로 정의할것이냐? 가위>보 /바위>가위 / 보> 바위
		// 예쁜방법이 뭐가 있나~ 클래스 따로 파서? 생성자?

		// 자바 스트링은 ==가 아니라 equals()를 사용해야함
		if (str1.equals(str2)) {
			System.out.println("비겼습니다.");
		}

		if (str1.equals("가위")) {
			if (str2.equals("바위")) {
				System.out.println("철수가 이겼습니다.");
			}
			else if(str2.equals("보")) {
				System.out.println("영희가 이겼습니다.");
			}
		}
		if (str1.equals("바위")) {
			if (str2.equals("보")) {
				System.out.println("철수가 이겼습니다.");
			}
			else if(str2.equals("가위")) {
				System.out.println("영희가 이겼습니다.");
			}
		}
		if (str1.equals("보")) {
			if (str2.equals("가위")) {
				System.out.println("철수가 이겼습니다.");
			}
			else if(str2.equals("바위")) {
				System.out.println("영희가 이겼습니다.");
			}
		}
	}
}