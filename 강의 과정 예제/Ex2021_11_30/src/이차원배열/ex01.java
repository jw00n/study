package �������迭;

public class ex01 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];
		int n = 1;
		System.out.println(arr[0][0]);

		//������ �迭 ����ϱ�
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				
				arr[i][j] = n++;
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}
}
