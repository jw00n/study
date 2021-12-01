import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		/*
		 * 두 개의 정수를 입력받아 큰 수에서 작은 수를 뺀 결과값을 출력하세요.
		 */
		Scanner sc = new Scanner(System.in); // 스캐너 정의

		System.out.print("첫 번째 정수 입력: "); // 입력 안내문
		int n1 = sc.nextInt(); // 정수를 입력
		System.out.print("두 번째 정수 입력: ");
		int n2 = sc.nextInt();

		// n1이 n2보다 크다면? T) n1- n2 F) n2 - n1 <삼항연산자>
		int result = n1 > n2 ? n1 - n2 : n2 - n1;
		// 결과를 출력.
		System.out.println("두 수의 차: " + result);
	}
}
