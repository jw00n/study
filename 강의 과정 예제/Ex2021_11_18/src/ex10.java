import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하십시오. : ");
		int mon = sc.nextInt();

		if (mon >= 9 && mon <= 11) {
			System.out.println(mon + "월은 가을입니다.");
		} else if (mon >= 3 && mon <= 5) {
			System.out.println(mon + "월은 봄입니다.");
		} else if (mon >= 6 && mon <= 8) {
			System.out.println(mon + "월은 여름입니다.");
		} else if (mon > 12) {
			System.out.println("올바른 입력이 아닙니다!");
		} else {
			System.out.println(mon + "월은 겨울입니다.");
		}

	}

}
