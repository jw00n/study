import java.util.Arrays;
import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// ¾ê ´Ù½Ã  Ç®¾î¾ßÇÔ.
		int[][] arr = new int[n][n];

		int len = arr.length;
		int start = 1;
		
		int x=1;
		for (int i = 0; i < len; i++) {
			if (i % 2 == 0) {// Â¦¼öÇà
				for (int j = 0; j < len; j++) {
					arr[i][j] = start++;
				}
			}else { // È¦¼öÇà
				for (int j = len - 1; j >= 0; j--) {
					arr[i][j] = start++;
				}
			}
		}
		
		
		for(int i=0; i<arr.length; i++) {	
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}
