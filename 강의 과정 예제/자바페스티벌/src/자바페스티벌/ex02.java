package �ڹ��佺Ƽ��;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("����ݾ�");
		int coin= sc.nextInt();
		
		System.out.println("�ܵ���ȯ");
		
		System.out.println("10000��"+(coin/10000)+"��");
		System.out.println("5000��"+(coin%10000/5000)+"��");
		System.out.println("1000��"+(coin%10000%5000/1000)+"��");
		System.out.println("500��"+(coin%10000%5000%1000)+"��");
		System.out.println("100��"+(coin/10000)+"��");
	
	}

}
