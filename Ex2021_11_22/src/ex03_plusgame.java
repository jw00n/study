import java.util.Random;
import java.util.Scanner;

public class ex03_plusgame {

	public static void main(String[] args) {
		Random rd = new Random();
		int random_num1 = rd.nextInt(20);
		int random_num2 = rd.nextInt(20);
		// 0 ~ 19������ ������ �� ���
		System.out.println("==Plus Game==");
		while (true) {

			int sum = random_num1 + random_num2;
			boolean equal; // �÷��� ����

			// ����ڿ��� ������ �Է¹ޱ�
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
			// ������ ������ True
			// ������ Ʋ���� False

			System.out.print("��� �Ͻðڽ��ϱ� : ");
			String next = sc.next();
			if (next.equals("Y")) {
				// �¾Ҵٸ� ���ڸ� ����
				if (equal) { //*****equal�� ���⼭ ������ ������ ���Դϴ� ������~~~~
					random_num1 = rd.nextInt(20);
					random_num2 = rd.nextInt(20);

				} else {// Ʋ�ȴٸ� �������� �״�� ���� ������ ���� X

				}
			} else {
				break;
			}

		}
	}
}