package 이차원배열;

import java.util.Arrays;

public class ex03 {

	public static void main(String[] args) {

		int[][] arr= new int[5][5];
		int n=1;

		for(int i=0; i<arr.length; i++) {
			int index= Math.abs(2-i);
			for(int j=index; j<arr.length-index; j++) {
				arr[i][j]=n++;
				
			}
		}
		
		
	for(int i=0; i<arr.length; i++) {	
		System.out.println(Arrays.toString(arr[i]));
	}
		//2차원 출력이라 arr[0] 이라 해야함.
		//보통은 arr만?

	}

}
