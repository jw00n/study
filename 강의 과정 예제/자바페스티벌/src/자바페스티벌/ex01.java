package �ڹ��佺Ƽ��;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.print("�ݿø� �� �� : ");
			int x = sc.nextInt();
			
			if(x%10>=5) x+=(10-x%10);
			else x-=x%10;
			System.out.print("�ݿø� �� �� : "+x);
	}

}
