import java.util.Scanner;

public class ex1121_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0;

		do {
			System.out.print("A 입력 >>");
			a = sc.nextInt();
			System.out.print("B 입력 >>");
			b = sc.nextInt();
			if (a == 0 && b == 0) //모두 0을 입력받으면 프로그램이 종료된다
				System.exit(0);

			System.out.println("결과>> " + (a - b));
		} while (a != 0 && b != 0);

	}
}
