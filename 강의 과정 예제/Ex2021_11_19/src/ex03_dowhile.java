import java.util.Scanner;

public class ex03_dowhile {
	public static void main(String[] args) {
		// while�� ���
		// ������ �Է¹���
		// �Է¹��� ������ ¦����� while�� ����
		Scanner sc = new Scanner(System.in);

		do {
			// ������ ����
			System.out.println("�����Է�: ");
			int num = sc.nextInt();

			// �Է��� ���� > Ȧ��? while�� ���
			// > ¦��? while �� ����
			if (num % 2 == 0) { // ¦��
				System.out.println("����Ǿ����ϴ�.");
				break;
			} else {// Ȧ��
					// �ƹ��͵� �������� ���� ����
			}
		} while (true);

	}
}
