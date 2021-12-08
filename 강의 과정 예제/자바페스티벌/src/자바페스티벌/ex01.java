package 자바페스티벌;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.print("반올림 전 값 : ");
			int x = sc.nextInt();
			
			if(x%10>=5) x+=(10-x%10);
			else x-=x%10;
			System.out.print("반올림 후 값 : "+x);
	}

}
