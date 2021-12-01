import java.util.Scanner;

public class ex03_dowhile {
	public static void main(String[] args) {
		// while문 사용
		// 정수를 입력받음
		// 입력받은 정수가 짝수라면 while문 종료
		Scanner sc = new Scanner(System.in);

		do {
			// 실행할 문장
			System.out.println("정수입력: ");
			int num = sc.nextInt();

			// 입력한 정수 > 홀수? while문 계속
			// > 짝수? while 문 종료
			if (num % 2 == 0) { // 짝수
				System.out.println("종료되었습니다.");
				break;
			} else {// 홀수
					// 아무것도 실행하지 않을 예정
			}
		} while (true);

	}
}
