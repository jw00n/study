package 이차원배열;

import java.util.Arrays;

public class ex04_숙제 {

	public static void main(String[] args) {

		// 1. array 5행 5열 생성
		int[][] array = new int[5][5];
		// 2. 배열에 넣어줄 임의의 데이터 새엉
		int num = 1;
		// 3. 0행부터 데이터 채워주기
//		for(int i=4; i>=0; i--) {
//			array[0][i]=num++;
//		}

		// 4. 1행 데이터 채워주기
//		for(int i=4; i>=0; i--) {
//			array[1][i]=num++;
//		}

		// 5. 데이터를 다 채워주고 나서 출력해주기
		for (int i = 0; i < array.length; i++) {
			for (int j = array.length - 1; j >= 0; j--) {
				array[i][j] = num++;
			}
		}

		
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
	}

}
