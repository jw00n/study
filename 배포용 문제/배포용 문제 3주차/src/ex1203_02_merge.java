import java.util.Arrays;


public class ex1203_02_merge {
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
		
		//배열의 가장 마지막 인덱스를 가리키기 위한 변수 h,m
		int h= A.length-1; 
		int m= B.length-1;
		
		//해당 인덱스는 0으로 초기화 시켜둔다.
		int i=0, j=0, k=0;

		while(i<=h && j<=m) {
			if(A[i]<B[j]) { //B가 더 크면
				arr[k]=A[i]; //a의 인덱스 i가 가리키는 값을 arr[k]에 넣어주고
				i++; //i 증가
			}
			else {//A가 더 크면
				arr[k]=B[j]; //배열 B 인덱스 j의 값을 arr[k]에 넣어준다.
				j++;
			}
			k++; //두 과정 중 하나라도 마무리 된다면 k증가하여 다음 인덱스를 가리킴.
		}
		
		if(i>h) { //i가 먼저 A의 끝에 도달한경우
			arr[k]=B[m];//B의 마지막 인덱스 값은 남아있으므로 arr의 마지막 k에 넣어주고
		}else if(j>h) { //그 반대상황
			arr[k]=A[h];
		}
		return arr; //리턴
	}
	
	

}
