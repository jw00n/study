package �ڹ��佺Ƽ��;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("����  �Է�>>");
		
		int num= sc.nextInt();
		int mul=1;
		int org=num;
		
		System.out.print(num+"= ");
		for(int i=2; i<=num; i++) {
			while(num%i==0) {
				num/=i;
				mul*=i;
			System.out.print(i);
			if(mul!=org) System.out.print("*");
			else break;
			}
			
			
		}
		
		
		if(num> 1) System.out.print(num);
	}

}
