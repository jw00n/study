package �������迭;

public class ex02 {

	public static void main(String[] args) {
		//1. 5�� 5�� ¥�� ������ �迭 array ����
		int[][] array= new int[5][5];
		
		//2. �迭�ȿ� �� num ������ ������ ����(21���� �����Ұ�
		int num= 21;
		
		//3. 0�� ���� ������ ������ 1�� �����ϸ鼭 ä���ֱ�
		//��Ʈ [��][��] ���� 0���� �����Ǿ��ִ� ���¿��� �ุ 0~4���� ����
	
		
	
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
