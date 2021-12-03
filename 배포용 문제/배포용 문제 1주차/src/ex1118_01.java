import java.util.Scanner;

public class ex1118_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("반올림 전 값:");
		int n = sc.nextInt();

		if (n % 10 >= 5) { // 일의 자리수가 5보다 큼 -> 반올림
			// 반올림이 앞자리가 0이되는거였나?? 115->120 117 120 135 140
			n += 10 - n % 10;
			System.out.print("반올림 후 값 : " + n);

		} else { // 5보다 작은 값 -> 버려야함 113 110 114 110 101 100
			n -= n % 10;
			System.out.print("반올림 후 값 : " + n);
		}

	}

}
