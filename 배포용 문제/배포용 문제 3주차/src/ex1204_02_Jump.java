
public class ex1204_02_Jump {

	public static void main(String[] args) {
		//�ָ��ٱ� 1ĭ or2ĭ���� �� ���ִ� ����� ��  
		//�Ǻ���ġ ���� or ���丮��
		//7��->21 4��->5 �׷��� �Ǻ���ġ ����?
		System.out.println(jumpCase(7));
	}

	public static int jumpCase(int i) {
		int n=1;
		int[] data=new int[i];
	
		// j�� �ε��� �Ǻ���ġ���� i��
		if (i == 1) {		//1���� 1	��
			return n=1;
		} else if (i == 2) { //2���� 2��
			return n=2;
		} else { //3�׺��� //3���� 3
			data[0]=1;
			data[1]=2;
			for (int j = 2; j < i; j++) {
				data[j]=data[j-1]+data[j-2];
			}
		}	return n=data[i-1];
	
	} 

}
 