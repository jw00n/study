import java.util.Scanner;

public class ex1118_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° �����Է�: ");
		int n1 = sc.nextInt();
		System.out.print("�� ��° �����Է�: ");
		int n2 = sc.nextInt();
		// �ϴ� ���� �ڸ� ���� �ڸ� ���� �ڸ��� �ɰ���
		int x = n2 % 10 * n1; // 1�� �ڸ�
		int y = n2 % 100 / 10 * n1; // 10�� �ڸ�
		int z = n2 / 100 * n1; // 100�� �ڸ�

		System.out.println(n1 + "\nx" + n2);
		System.out.println("-------\n   " + x);
		System.out.println("  " + y);
		System.out.println(z);

		int result = x + y * 10 + z * 100;
		System.out.println("-------\n=" + result);

	}
}
