package ÀÚ¹ÙÆä½ºÆ¼¹ú;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("³âµµÀÔ·Â>>");
		
		int year= sc.nextInt();
		
		if( year%4 ==0 && year%100!=0 || year%400 ==0) {
			System.out.println("À±³â");
		}else System.out.println("¾Æ´Õ´Ï´Ù.");

	}

}
