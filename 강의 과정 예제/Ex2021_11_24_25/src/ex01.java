import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch (a) {
		case 1:
			a = 3;
		case 2:
			a=1;
			System.out.println(a);
		case 3:
			a=4;
			System.out.println(a);
		default:
			a = 5;
			System.out.println(a);

		}
		System.out.println(a);
	}

}
