package 자바페스티벌;

import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 입력>>");
		int num = sc.nextInt();
		
		while(num>0) {
			if(num%2==0)
			{
				System.out.print(1);
			}else {
				System.out.print(0);
			}
			num/=2;
		}

	}

}
