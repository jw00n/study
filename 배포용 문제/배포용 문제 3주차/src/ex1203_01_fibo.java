
public class ex1203_01_fibo {
//피보나치 수열의 input항까지 출력
	public static void main(String[] args) {
		int input = 8;

	
		for (int i = 1; i <= input; i++) {
			
			System.out.print(fibo(i) + " ");
		}

	}

	// 피보나치 수열
	/*
	 * 1항은 0 / 2항은 1
	 * 3항부터는 피보나치의 정의를 이용해 계산 f(n) =f(n-1)+f(n-2)
	 * 
	 */
	//피보나치 수열의 i항을 구하라
	private static int fibo(int i) {
		int n=1;
		int[] data=new int[i];
	
		// j가 인덱스 피보나치수열 i항
		if (i == 1) {		//1항은 1	
			return n=1;
		} else if (i == 2) { //2항은 1
			return n=1;
		} else { //3항부터 피보나치 수열
			data[0]=1;
			data[1]=1;
			for (int j = 2; j < i; j++) {
				data[j]=data[j-1]+data[j-2];
			}
		}	return n=data[i-1];
		
	
	}
}
