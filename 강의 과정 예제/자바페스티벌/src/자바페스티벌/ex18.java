package 자바페스티벌;

import java.util.Arrays;

public class ex18 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		

		int n = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = n++;
			}
		}

		for(int j=0; j<arr.length; j++) {
			for(int i = 0; i < arr.length/2; i++) {
				

				
			}
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

	}

}
