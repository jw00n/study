package 뮤직플레이어;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("[1] 재생 [2]정지 [3]다음곡 [4]이전곡 [5]종료 >>");
		int input = sc.nextInt();

		if (input == 1) {
			System.out.println("====재생===");
		} else if (input == 2) {
			System.out.println("====정지===");
		} else if (input == 3) {
			System.out.println("====다음곡===");
		} else if (input == 4) {
			System.out.println("====이전곡===");
		} else if (input == 5) {
			System.out.println("====종료===");
		} else {
			System.out.println("잘못된 숫자입니다.");
		}

	}

}
