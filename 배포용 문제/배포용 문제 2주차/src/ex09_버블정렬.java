import java.util.Scanner;

//��������� �����̳�~~~
//������ ���ҳ��� ũ�� �񱳸� �ؼ� �������� �� ������ ���� ��ġ�� �ٲ۴�.
//1ȸ�� �����Ŀ� �� ����������(1ȸ�� ����� ���� ū ����)�� ���Ŀ��� ���ܽ�Ų��.
public class ex09_�������� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] data = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "��° �� �Է�: ");
			data[i] = sc.nextInt();
		}

		for (int i = data.length; i >= 0 ; i--) {
			for (int j = 0; j <data.length-1; j++) {
				if (data[j] > data[j+1]) {
					int tmp = data[j+1];
					data[j+1] = data[j];
					data[j] = tmp;
				}
			}
		}
		
		System.out.println("������ ");
		for(int i=0; i<data.length; i++) {
			if(i>0) System.out.print(" ");
			System.out.print(data[i]);
		}
		
		
		
		
	}
}
