import java.util.Scanner;

public class ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int out = 0;
		int i = 1;
		// ���� �� ���� �� ���Ը� �Է¹�������.

		System.out.print("���� ������: ");
		int present = sc.nextInt();
		System.out.print("��ǥ ������: ");
		int target = sc.nextInt();

		do {
			System.out.print(i + "���� ������: ");
			out = sc.nextInt();
			present -= out;
			i++;

		} while (present > target);

		System.out.println(present + "kg �޼�!! �����մϴ�.");
	}
}
