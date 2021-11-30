import java.util.Scanner;

public class ex14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[][] arr = new int[n][n];
		int[][] arr2= new int[n][n];

		int len = arr.length;

		System.out.println("원본");

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < i-j; j++) {
				arr[i][j] = j+1+i*len;
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("90도 회전");
		//i행이 j열로 이동한다.
		for (int i = 0; i < len; i++) {
			for (int j = 0; j <= i; j++) {
		
			}
		}

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}
}