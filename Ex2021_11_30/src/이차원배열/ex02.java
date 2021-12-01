package 이차원배열;

public class ex02 {

	public static void main(String[] args) {
		//1. 5행 5열 짜리 이차원 배열 array 생성
		int[][] array= new int[5][5];
		
		//2. 배열안에 들어갈 num 정수형 데이터 생성(21부터 시작할것
		int num= 21;
		
		//3. 0번 열의 데이터 값들을 1씩 증가하면서 채워주기
		//힌트 [행][열] 열은 0으로 고정되어있는 상태에서 행만 0~4까지 증가
	
		
	
			for (int i = 0; i < array.length; i++) {
				for(int j=array.length-1; j>=0; j--) {
				array[i][j]=num++;
			}
		}
		
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
