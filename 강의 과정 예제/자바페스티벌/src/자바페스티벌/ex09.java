package �ڹ��佺Ƽ��;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("A �Է�>>");
		int A= sc.nextInt();
		System.out.print("B �Է�>>");
		int B=sc.nextInt();
		
		while(A!=0&& B!=0) {
			System.out.println("��� >>"+(A-B));
			System.out.print("A �Է�>>");
			A= sc.nextInt();
			System.out.print("B �Է�>>");
			B=sc.nextInt();
		}

		
		
	}

}
