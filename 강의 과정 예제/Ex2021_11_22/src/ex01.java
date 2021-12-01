import java.util.Random;
import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);// 스캐너
		System.out.println("==Plus Game==");// 안내문

		// 0~19사이의 랜덤한 숫자 출력
		Random random = new Random();// 랜덤 생성자 선언
		int x = random.nextInt(100);// x,y에 100미만 숫자 중 랜덤한 정수값 할당
		int y = random.nextInt(100);

		String str;
		
	

		do {
			System.out.print(x + "+" + y + "=");// 문제 출력
			int ans = sc.nextInt(); // 정답 입력받음

			if (x + y == ans) { // 정답인경우
				System.out.println("성공"); // 성공문을 출력하고
				System.out.print("계속 하시겠습니까? >>"); // 계속할지는 물어본다.
				str = sc.next();// 답장을 입력받은후
				x = random.nextInt(100);// x,y에 다시 100미만 숫자 중 랜덤한 정수값 할당
				y = random.nextInt(100);

			} else { // 틀린경우
				System.out.println("실패"); // 실패와 계속 할지를 출력
				System.out.print("계속 하시겠습니까? >>");
				str = sc.next(); // 답을 입력받았다면
				continue; // 다음루프로 넘김

			}
		} while (str.equals("Y")); // 일단 전제는 모든 답변이 Y인 경우에 루프가 돕니다.

		System.out.println("종료되었습니다!");
		System.exit(0);

	}
}
