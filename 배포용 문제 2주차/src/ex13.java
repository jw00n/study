import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		//얘 다시 풀어야함.
		int[][] arr = new int[n][n];

		int len = arr.length;



		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				arr[i][j] = j+1+i*len;
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
