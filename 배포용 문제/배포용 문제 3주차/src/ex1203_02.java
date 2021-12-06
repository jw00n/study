import java.util.Arrays;


public class ex1203_02 {
//합병 후 오름차순으로 정렬하여 반환
	public static void main(String[] args) {
		int A[] = {1,3,5,7,9,11,13,15,17,19};
		int B[] = {2,4,6,8,10,12,14,16,18,20};
		
		int Merge[]= mergeArray(A, B);
		System.out.println("Merge : "+Arrays.toString(Merge));

	}
	
	//1. 오름차순으로 정렬된 배열을 합친다.
	public static int[] mergeArray(int[] A, int[] B) {
		int[] arr = new int[A.length+B.length];
		
		int h= A.length-1;
		int m= B.length-1;
		
		int i=0, j=0, k=0;

		while(i<=h && j<=m) {
			if(A[i]<B[j]) {
				arr[k]=A[i];
				i++;
			}
			else {
				arr[k]=B[j];
				j++;
			}
			k++;
		}
		
		if(i>h) {
			arr[k]=B[m];
		}else if(j>h) {
			arr[k]=A[h];
		}
		return arr;
	}
	
	

}
