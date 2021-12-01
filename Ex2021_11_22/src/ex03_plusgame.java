import java.util.Random;
import java.util.Scanner;

public class ex03_plusgame {

	public static void main(String[] args) {
		Random rd = new Random();
		int random_num1 = rd.nextInt(20);
		int random_num2 = rd.nextInt(20);
		// 0 ~ 19사이의 랜덤한 수 출력
		System.out.println("==Plus Game==");
		while (true) {

			int sum = random_num1 + random_num2;
			boolean equal; // 플래그 느낌

			// 사용자에게 랜덤수 입력받기
			System.out.print(random_num1 + "+" + random_num2 + "=");
			Scanner sc = new Scanner(System.in);
			int input_num = sc.nextInt();

			if (sum == input_num) {
				System.out.println("Success");
				equal = true;
			} else {
				System.out.println("Fail");
				equal = false;
			}
			// 문제가 맞으면 True
			// 문제가 틀리면 False

			System.out.print("계속 하시겠습니까 : ");
			String next = sc.next();
			if (next.equals("Y")) {
				// 맞았다면 숫자를 갱신
				if (equal) { //*****equal은 여기서 쓰려고 정의한 것입니다 여러분~~~~
					random_num1 = rd.nextInt(20);
					random_num2 = rd.nextInt(20);

				} else {// 틀렸다면 기존숫자 그대로 따라서 랜덤수 갱신 X

				}
			} else {
				break;
			}

		}
	}
}