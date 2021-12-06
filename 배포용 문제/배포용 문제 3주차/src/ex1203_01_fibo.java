
public class ex1203_01_fibo {
//�Ǻ���ġ ������ input�ױ��� ���
	public static void main(String[] args) {
		int input = 8;

	
		for (int i = 1; i <= input; i++) {
			
			System.out.print(fibo(i) + " ");
		}

	}

	// �Ǻ���ġ ����
	/*
	 * 1���� 0 / 2���� 1
	 * 3�׺��ʹ� �Ǻ���ġ�� ���Ǹ� �̿��� ��� f(n) =f(n-1)+f(n-2)
	 * 
	 */
	//�Ǻ���ġ ������ i���� ���϶�
	private static int fibo(int i) {
		int n=1;
		int[] data=new int[i];
	
		// j�� �ε��� �Ǻ���ġ���� i��
		if (i == 1) {		//1���� 1	
			return n=1;
		} else if (i == 2) { //2���� 1
			return n=1;
		} else { //3�׺��� �Ǻ���ġ ����
			data[0]=1;
			data[1]=1;
			for (int j = 2; j < i; j++) {
				data[j]=data[j-1]+data[j-2];
			}
		}	return n=data[i-1];
		
	
	}
}
