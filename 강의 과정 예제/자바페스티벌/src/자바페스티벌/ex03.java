package �ڹ��佺Ƽ��;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("�⵵�Է�>>");
		
		int year= sc.nextInt();
		
		if( year%4 ==0 && year%100!=0 || year%400 ==0) {
			System.out.println("����");
		}else System.out.println("�ƴմϴ�.");

	}

}
