import java.util.Scanner;

public class ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[][] arr = new int[n][n];

		int len = arr.length;

		System.out.println("원본");

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				arr[i][j] = j+1+i*len;
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("180도 회전");

		for (int i = 0; i < len; i++) {
			for (int j = 0; j <= i; j++) {
				if(i==j && i>len/2&&j>len/2)
					continue;
				int tmp = arr[len - 1 - i][len - 1 - j];
				arr[len - 1 - i][len - 1 - j] = arr[i][j];
				arr[i][j] = tmp;
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