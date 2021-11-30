import java.util.Scanner;

public class ex1118_02 {
	public static void main(String[] args) {
//거스름돈 문제 지폐 개수를 출력하는 프로그램을 작성하시오.
		// 최대는 10000원, 최소는 100원
		Scanner sc = new Scanner(System.in);
		System.out.print("현재금액: ");
		int money = sc.nextInt();
		int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0;

		System.out.println("잔돈변환");

		// 스위치로 해야되나????
		while (money >= 100) {
			if (money >= 10000) {
				n1 = money / 10000;
				money %= 10000;
			} else if (money >= 5000) {
				n2 = money / 5000;
				money %= 5000;
			} else if (money >= 1000) {
				n3 = money / 1000;
				money %= 1000;
			} else if (money >= 500) {
				n4 = money / 500;
				money %= 500;
			} else if (money >= 100) {
				n5 = money / 100;
				money %= 100;
			}
		}

		System.out.println("10000원: " + n1 + "장");
		System.out.println("5000원: " + n2 + "장");
		System.out.println("1000원: " + n3 + "장");
		System.out.println("500원: " + n4 + "개");
		System.out.println("100원: " + n5 + "개");
	}
}
