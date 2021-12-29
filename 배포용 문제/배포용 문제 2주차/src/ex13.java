import java.util.Arrays;
import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		//정수 N을 입력받을 스캐너와 입력받을 N을 저장할 정수형 변수 n
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		//저장할 배열
		int[][] arr = new int[n][n];

		
		int len = arr.length; //가독성을 위해  따로 len이라는 변수에 길이 저장
		int start = 1; //(0,0)부터 증가하며 들어갈 변수 start
		
		/*
		 * 행렬 형태를 보면 짝수행과 홀수행에 따라 일정하게 움직이며 
		 * 값이 들어가는 모습을 보인다.
		 */
		
		for (int i = 0; i < len; i++) {
			if (i % 2 == 0) {// 짝수행 : 이동이 오른쪽으로 진행됨.
				for (int j = 0; j < len; j++) {
					arr[i][j] = start++;
				}
			}else { // 홀수행 : 이동이 왼쪽으로 진행됨.
				for (int j = len - 1; j >= 0; j--) {
					arr[i][j] = start++;
				}
			}
		}
		
		//출력
		for(int i=0; i<arr.length; i++) {	
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}
