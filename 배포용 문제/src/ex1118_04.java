import java.util.Scanner;

public class ex1118_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자입력: ");
		int n1 = sc.nextInt();
		System.out.print("두 번째 숫자입력: ");
		int n2 = sc.nextInt();
		// 일단 백의 자리 십의 자리 일의 자리를 쪼개자
		int x = n2 % 10 * n1; // 1의 자리
		int y = n2 % 100 / 10 * n1; // 10의 자리
		int z = n2 / 100 * n1; // 100의 자리

		System.out.println(n1 + "\nx" + n2);
		System.out.println("-------\n   " + x);
		System.out.println("  " + y);
		System.out.println(z);

		int result = x + y * 10 + z * 100;
		System.out.println("-------\n=" + result);

	}
}
