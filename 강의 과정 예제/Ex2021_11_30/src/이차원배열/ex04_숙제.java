package �������迭;

import java.util.Arrays;

public class ex04_���� {

	public static void main(String[] args) {

		// 1. array 5�� 5�� ����
		int[][] array = new int[5][5];
		// 2. �迭�� �־��� ������ ������ ����
		int num = 1;
		// 3. 0����� ������ ä���ֱ�
//		for(int i=4; i>=0; i--) {
//			array[0][i]=num++;
//		}

		// 4. 1�� ������ ä���ֱ�
//		for(int i=4; i>=0; i--) {
//			array[1][i]=num++;
//		}

		// 5. �����͸� �� ä���ְ� ���� ������ֱ�
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
