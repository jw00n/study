import java.util.Scanner;

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

		for (int i=0; i<data.length; i++) {
			//i�� �ѹ��� �ݺ��ɶ����� ������ ���� ���� ���� ���Ƿ� n-1���� n-1-i������ �ݺ��ϸ� �ȴ�.
			for (int j = 0; j < data.length - 1 - i; j++) {
				if (data[j] > data[j + 1]) {
					
					int tmp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = tmp;
					
				}
			}
		}

		System.out.println("������ ");
		for (int i = 0; i < data.length; i++) {
			if (i > 0)
				System.out.print(" ");
			System.out.print(data[i]);
		}

	}
}
