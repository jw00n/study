import java.util.Arrays;
import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		//���� N�� �Է¹��� ��ĳ�ʿ� �Է¹��� N�� ������ ������ ���� n
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		//������ �迭
		int[][] arr = new int[n][n];

		
		int len = arr.length; //�������� ����  ���� len�̶�� ������ ���� ����
		int start = 1; //(0,0)���� �����ϸ� �� ���� start
		
		/*
		 * ��� ���¸� ���� ¦����� Ȧ���࿡ ���� �����ϰ� �����̸� 
		 * ���� ���� ����� ���δ�.
		 */
		
		for (int i = 0; i < len; i++) {
			if (i % 2 == 0) {// ¦���� : �̵��� ���������� �����.
				for (int j = 0; j < len; j++) {
					arr[i][j] = start++;
				}
			}else { // Ȧ���� : �̵��� �������� �����.
				for (int j = len - 1; j >= 0; j--) {
					arr[i][j] = start++;
				}
			}
		}
		
		//���
		for(int i=0; i<arr.length; i++) {	
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}
