import java.util.Scanner;

public class ex1118_02 {
	public static void main(String[] args) {
//�Ž����� ���� ���� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// �ִ�� 10000��, �ּҴ� 100��
		Scanner sc = new Scanner(System.in);
		System.out.print("����ݾ�: ");
		int money = sc.nextInt();
		int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0;

		System.out.println("�ܵ���ȯ");

		// ����ġ�� �ؾߵǳ�????
		while (money >= 100) {
			if (money >= 10000) {
				n1 = money / 10000;
				money %= 10000;
			} else if (money >= 5000) {
				n2 = money / 5000;
				money %= 5000;
			} else if (money >= 1000) {
				n3 = money / 1000;
				money %= 1000;
			} else if (money >= 500) {
				n4 = money / 500;
				money %= 500;
			} else if (money >= 100) {
				n5 = money / 100;
				money %= 100;
			}
		}

		System.out.println("10000��: " + n1 + "��");
		System.out.println("5000��: " + n2 + "��");
		System.out.println("1000��: " + n3 + "��");
		System.out.println("500��: " + n4 + "��");
		System.out.println("100��: " + n5 + "��");
	}
}
