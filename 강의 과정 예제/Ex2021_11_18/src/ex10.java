import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��Ͻʽÿ�. : ");
		int mon = sc.nextInt();

		if (mon >= 9 && mon <= 11) {
			System.out.println(mon + "���� �����Դϴ�.");
		} else if (mon >= 3 && mon <= 5) {
			System.out.println(mon + "���� ���Դϴ�.");
		} else if (mon >= 6 && mon <= 8) {
			System.out.println(mon + "���� �����Դϴ�.");
		} else if (mon > 12) {
			System.out.println("�ùٸ� �Է��� �ƴմϴ�!");
		} else {
			System.out.println(mon + "���� �ܿ��Դϴ�.");
		}

	}

}
