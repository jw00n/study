package �������迭;

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
		//2���� ����̶� arr[0] �̶� �ؾ���.
		//������ arr��?

	}

}
