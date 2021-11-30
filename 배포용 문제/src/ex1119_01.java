import java.util.Scanner;

public class ex1119_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;

		// 1부터 n까지 +,-하는 반복문
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				System.out.print(i+" ");
				sum += i;
			} else {
				System.out.print(i*(-1)+" ");
				sum += i*(-1);
			}
		}
		System.out.println("\n결과: " + sum);
	}
}
