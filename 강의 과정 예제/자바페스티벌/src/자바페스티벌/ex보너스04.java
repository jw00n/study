package 자바페스티벌;

import java.util.Arrays;

public class ex보너스04 {

	public static void main(String[] args) {

		int[][] n= new int[7][7];
		
		int start=1;
		
		for(int i=0; i<7; i++) {
			int index = Math.abs(n.length/2-i);
			for(int j=index; j<7-index; j++) {
				n[i][j]=start++;
			}
		}
		
		for (int i = 0; i < n.length; i++) {
			for(int j=0; j<n.length; j++) {
				System.out.print(n[i][j]+"\t");
			}
				System.out.println();
		}
		
	}

}
