import java.util.Scanner;

public class ex1118_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("�ݿø� �� ��:");
		int n = sc.nextInt();

		if (n % 10 >= 5) { // ���� �ڸ����� 5���� ŭ -> �ݿø�
			// �ݿø��� ���ڸ��� 0�̵Ǵ°ſ���?? 115->120 117 120 135 140
			n += 10 - n % 10;
			System.out.print("�ݿø� �� �� : " + n);

		} else { // 5���� ���� �� -> �������� 113 110 114 110 101 100
			n -= n % 10;
			System.out.print("�ݿø� �� �� : " + n);
		}

	}

}
