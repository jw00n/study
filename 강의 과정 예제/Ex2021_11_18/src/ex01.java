import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		/*
		 * �� ���� ������ �Է¹޾� ū ������ ���� ���� �� ������� ����ϼ���.
		 */
		Scanner sc = new Scanner(System.in); // ��ĳ�� ����

		System.out.print("ù ��° ���� �Է�: "); // �Է� �ȳ���
		int n1 = sc.nextInt(); // ������ �Է�
		System.out.print("�� ��° ���� �Է�: ");
		int n2 = sc.nextInt();

		// n1�� n2���� ũ�ٸ�? T) n1- n2 F) n2 - n1 <���׿�����>
		int result = n1 > n2 ? n1 - n2 : n2 - n1;
		// ����� ���.
		System.out.println("�� ���� ��: " + result);
	}
}
