import java.util.Scanner;

public class ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int present = 10000;
		//11개미만 구매시 할인 x
 		System.out.println("사려는 상품의 갯수를 입력하세요.");
		int n = sc.nextInt();
		double result;
		if (n > 10) {
			result = present * 0.9 * n;
			System.out.println("가격은" + (int) result + "원 입니다.");
		} else {
			result = n * present;
			System.out.println("가격은" + (int) result + "원 입니다.");
		}
	}
}
