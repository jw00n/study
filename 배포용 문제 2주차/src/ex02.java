import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ����>>  ");
		int n = sc.nextInt();
		
		
		for (int i = n; i > 0; i--) {// ����� ���� ������ ����
			for (int j = 0; j < i; j++) {// ����� �� �ٿ� ��� �μ��Ұǰ��� ����
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
