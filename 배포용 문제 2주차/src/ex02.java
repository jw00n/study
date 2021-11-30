import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수>>  ");
		int n = sc.nextInt();
		
		
		for (int i = n; i > 0; i--) {// 여기는 별의 개수를 지정
			for (int j = 0; j < i; j++) {// 여기는 한 줄에 몇개를 인쇄할건가를 지정
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
