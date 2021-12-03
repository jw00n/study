import java.util.Scanner;

public class ex1120_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		int n = sc.nextInt();
		int result=1;

		for (int i = 1; i <= n; i++) {
			result*=i;
		}
		
		System.out.println("출  력: "+result);
	}

}
