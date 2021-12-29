
public class ex1204_02_Jump {

	public static void main(String[] args) {
		//멀리뛰기 1칸 or2칸으로 갈 수있는 경우의 수  
		//피보나치 수열 or 팩토리얼
		//7항->21 4항->5 그래서 피보나치 수열?
		System.out.println(jumpCase(7));
	}

	public static int jumpCase(int i) {
		int n=1;
		int[] data=new int[i];
	
		// j가 인덱스 피보나치수열 i항
		if (i == 1) {		//1항은 1	고
			return n=1;
		} else if (i == 2) { //2항은 2고
			return n=2;
		} else { //3항부터 //3항은 3
			data[0]=1;
			data[1]=2;
			for (int j = 2; j < i; j++) {
				data[j]=data[j-1]+data[j-2];
			}
		}	return n=data[i-1];
	
	} 

}
 