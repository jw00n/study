import java.util.Scanner;

public class ex04_조건문 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();

		if (age >= 20) {
			System.out.println("성인입니다.");
			System.out.println("미성년자가 아닙니다.");
		} else {
			System.out.println("미성년자입니다.");
		}

		System.out.println("프로그램 종료");
	}
}
