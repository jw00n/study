import java.util.Scanner;

public class ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("별 개수를 입력하세요>>  ");
		int n = sc.nextInt();

		for (int i = n; i >0; i--) {//여기는 별의 개수를 지정
			for (int j = 0; j <i; j++) {//여기는 한 줄에 몇개를 인쇄할건가를 지정
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("================");

		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("================");

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= 2 * i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
