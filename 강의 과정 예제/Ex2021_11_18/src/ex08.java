import java.util.Scanner;

public class ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int present = 10000;
		//11���̸� ���Ž� ���� x
 		System.out.println("����� ��ǰ�� ������ �Է��ϼ���.");
		int n = sc.nextInt();
		double result;
		if (n > 10) {
			result = present * 0.9 * n;
			System.out.println("������" + (int) result + "�� �Դϴ�.");
		} else {
			result = n * present;
			System.out.println("������" + (int) result + "�� �Դϴ�.");
		}
	}
}
