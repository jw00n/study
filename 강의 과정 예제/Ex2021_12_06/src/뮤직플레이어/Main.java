package �����÷��̾�;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("[1] ��� [2]���� [3]������ [4]������ [5]���� >>");
		int input = sc.nextInt();

		if (input == 1) {
			System.out.println("====���===");
		} else if (input == 2) {
			System.out.println("====����===");
		} else if (input == 3) {
			System.out.println("====������===");
		} else if (input == 4) {
			System.out.println("====������===");
		} else if (input == 5) {
			System.out.println("====����===");
		} else {
			System.out.println("�߸��� �����Դϴ�.");
		}

	}

}
