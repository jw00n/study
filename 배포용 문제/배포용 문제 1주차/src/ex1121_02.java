import java.util.Scanner;

public class ex1121_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0;

		do {
			System.out.print("A �Է� >>");
			a = sc.nextInt();
			System.out.print("B �Է� >>");
			b = sc.nextInt();
			if (a == 0 && b == 0) //��� 0�� �Է¹����� ���α׷��� ����ȴ�
				System.exit(0);

			System.out.println("���>> " + (a - b));
		} while (a != 0 && b != 0);

	}
}
