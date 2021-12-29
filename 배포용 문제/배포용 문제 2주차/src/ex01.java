import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("n ют╥б: ");
		int n=sc.nextInt();
		//1 /-1-/ 2 /-2-/ 4 /-3-/ 7 /-4-/ 11
		//a1= a0+n (n=1,2,3,4....)
		int x=1;
		for(int i=0; i<n; i++) {
			x+=i;
		 	System.out.print(x+" ");
		}

	}
}
