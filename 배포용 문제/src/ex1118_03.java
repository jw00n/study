import java.util.Scanner;

/*
������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
�����̶� 2���� 29���� �ִ� ���� ���Ѵ�.
4�� ����̸鼭 100�� ����� �ƴ� ���� �����̴�.
400�� ����� �� �����̴�.
 */

public class ex1118_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�⵵ �Է�>> ");
		int year = sc.nextInt();

		if (year % 4 == 0 && year % 100 != 0) { // 4�� ��� and 100�� ��� X
			System.out.println("����");
		} else if (year % 400 == 0) {// 400�� ���
			System.out.println("����");
		} else {
			System.out.println("���� �ƴ�");
		}
	}
}
