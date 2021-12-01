import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		int count = 0;
		do {
			System.out.println("숫자를 입력하세요.");
			num = sc.nextInt();
			if (num > 100)
				break;

			sum += num;
			count++;

		} while (num <= 100);

		System.out.println("합계:" + sum);
		System.out.println("평균:" + sum / (float) count);

	}
}
