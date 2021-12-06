import java.util.Scanner;

public class ex1121_01_���μ����� {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("���μ� ���� �� ���� �Է�>> ");
		int n = sc.nextInt();
		int org = n;

		System.out.print(n + "= ");

		int multi = 1;

		//N�� �� ���� �������� ��Ÿ����, �ϳ��� ���� �ݵ�� ��Ʈ N���� ���� �۴�.
		//for������ ����Ҷ��� sqrt��� ������ �Լ����� i�� �������� n���� �۰ų� ũ�ٶ�� �������� ����Ͽ� �ش�.
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

		//N�� 1�� �ƴϰ� �����ִٸ� �� ���� ���μ� �̹Ƿ� ���ǹ��� ���� ������ش�.
		if (n > 1) { //�� ���������� ���̻� �������ʴ� �� ������ �Ҽ��� ���μ�..
			System.out.print(n);
		}

	}

}