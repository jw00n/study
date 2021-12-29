package 자바페스티벌;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("현재금액");
		int coin= sc.nextInt();
		
		System.out.println("잔돈변환");
		
		System.out.println("10000원"+(coin/10000)+"개");
		System.out.println("5000원"+(coin%10000/5000)+"개");
		System.out.println("1000원"+(coin%10000%5000/1000)+"개");
		System.out.println("500원"+(coin%10000%5000%1000)+"개");
		System.out.println("100원"+(coin/10000)+"개");
	
	}

}
