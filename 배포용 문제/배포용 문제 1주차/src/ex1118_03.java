import java.util.Scanner;

/*
윤년을 구하는 프로그램을 작성하시오.
윤년이란 2월에 29일이 있는 날을 말한다.
4의 배수이면서 100의 배수가 아닐 때는 윤년이다.
400의 배수일 때 윤년이다.
 */

public class ex1118_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 입력>> ");
		int year = sc.nextInt();

		if (year % 4 == 0 && year % 100 != 0) { // 4의 배수 and 100의 배수 X
			System.out.println("윤년");
		} else if (year % 400 == 0) {// 400의 배수
			System.out.println("윤년");
		} else {
			System.out.println("윤년 아님");
		}
	}
}
