package 자바페스티벌;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 입력>>");
		int n1= sc.nextInt();
		System.out.print("두 번째 숫자 입력>>");
		int n2= sc.nextInt();
		
		int x=0,y=0,z=0;
		
		
		x= n2%10;
		y= (n2-x)%100/10;
		z= n2/100;
		
		System.out.println(n1*x);
		System.out.println(n1*y);
		System.out.println(n1*z);
		
		System.out.println(n1*x+n1*y*10+n1*z*100);

	}

}
