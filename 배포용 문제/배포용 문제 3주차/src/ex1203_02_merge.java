import java.util.Arrays;


public class ex1203_02_merge {
//�պ� �� ������������ �����Ͽ� ��ȯ
	public static void main(String[] args) {
		int A[] = {1,3,5,7,9,11,13,15,17,19};
		int B[] = {2,4,6,8,10,12,14,16,18,20};
		
		int Merge[]= mergeArray(A, B);
		System.out.println("Merge : "+Arrays.toString(Merge));

	}
	
	//1. ������������ ���ĵ� �迭�� ��ģ��.
	public static int[] mergeArray(int[] A, int[] B) {
		int[] arr = new int[A.length+B.length];
		
		//�迭�� ���� ������ �ε����� ����Ű�� ���� ���� h,m
		int h= A.length-1; 
		int m= B.length-1;
		
		//�ش� �ε����� 0���� �ʱ�ȭ ���ѵд�.
		int i=0, j=0, k=0;

		while(i<=h && j<=m) {
			if(A[i]<B[j]) { //B�� �� ũ��
				arr[k]=A[i]; //a�� �ε��� i�� ����Ű�� ���� arr[k]�� �־��ְ�
				i++; //i ����
			}
			else {//A�� �� ũ��
				arr[k]=B[j]; //�迭 B �ε��� j�� ���� arr[k]�� �־��ش�.
				j++;
			}
			k++; //�� ���� �� �ϳ��� ������ �ȴٸ� k�����Ͽ� ���� �ε����� ����Ŵ.
		}
		
		if(i>h) { //i�� ���� A�� ���� �����Ѱ��
			arr[k]=B[m];//B�� ������ �ε��� ���� ���������Ƿ� arr�� ������ k�� �־��ְ�
		}else if(j>h) { //�� �ݴ��Ȳ
			arr[k]=A[h];
		}
		return arr; //����
	}
	
	

}
