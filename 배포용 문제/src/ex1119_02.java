import java.util.Scanner;

public class ex1119_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;

		// 77*1 +76*2 ........2*76+1*77
		for (int i = 0; i <= n; i++) {
			sum += (n - i) * (i + 1);
		}
		System.out.println(sum);
	}
}
