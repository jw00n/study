package 자바페스티벌;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수");

		int n = sc.nextInt();

		for (int i = n; i > 0; i--) {
			for (int j = 0; j <i; j++) {

				System.out.print("*");
			}System.out.println();
		}
		
	}

}
