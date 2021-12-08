package 자바페스티벌;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("A 입력>>");
		int A= sc.nextInt();
		System.out.print("B 입력>>");
		int B=sc.nextInt();
		
		while(A!=0&& B!=0) {
			System.out.println("결과 >>"+(A-B));
			System.out.print("A 입력>>");
			A= sc.nextInt();
			System.out.print("B 입력>>");
			B=sc.nextInt();
		}

		
		
	}

}
