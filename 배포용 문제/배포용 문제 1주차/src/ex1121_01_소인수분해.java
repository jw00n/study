import java.util.Scanner;

public class ex1121_01_���μ����� {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("���μ� ���� �� ���� �Է�>> ");
		int n = sc.nextInt();
		int org = n;

		System.out.print(n + "= ");

		int multi = 1;

		// �ϴ� i�� ���μ���� ������ n�� ���μ����� �ذ���.
		// �׷��Ƿ� n�� ���μ��� �������� Ŭ �� �����Ƿ� i�� ������ n���� ũ�ų� ����.
		for (int i = 2; i * i <= n; i++) {

			while (n % i == 0) { // �Է¹��� ���� i�� ���������� ������.

				multi *= i; // ��� Ȯ�ο�
				n /= i;// ���μ����� �� /i�� ���μ���� ������ ���������ֱ����� �ݺ������� �������ش�.

				// * ��¹�
				if (multi == org) {
					System.out.print(i);
				} else {
					System.out.print(i + "*");
				}
			}
		}

		if (n > 1) { //�� ���������� ���̻� �������ʴ� �� ������ �Ҽ��� ���μ�..
			System.out.print("����" + n);
		}

	}

}