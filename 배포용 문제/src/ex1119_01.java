import java.util.Scanner;

public class ex1119_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;

		// 1���� n���� +,-�ϴ� �ݺ���
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				System.out.print(i+" ");
				sum += i;
			} else {
				System.out.print(i*(-1)+" ");
				sum += i*(-1);
			}
		}
		System.out.println("\n���: " + sum);
	}
}
