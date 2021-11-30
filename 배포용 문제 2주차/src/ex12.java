import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[][] arr = new int[n][n];
		int start=1;

		//==È¦¼ö¸¸ °¡´É ==
		for(int i=0; i<arr.length; i++) {
			int index= Math.abs(arr.length/2-i);
			for(int j=index; j<arr.length-index; j++) {
				arr[i][j]=start++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}