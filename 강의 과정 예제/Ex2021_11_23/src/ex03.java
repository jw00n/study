import java.util.Scanner;

public class ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ������ �Է��ϼ���>>  ");
		int n = sc.nextInt();

		for (int i = n; i >0; i--) {//����� ���� ������ ����
			for (int j = 0; j <i; j++) {//����� �� �ٿ� ��� �μ��Ұǰ��� ����
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("================");

		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("================");

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= 2 * i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
