package �޼ҵ�;

import java.util.Scanner;



public class ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 1>>  ");
		int a = sc.nextInt();
		System.out.print("���� 2>>  ");
		int b = sc.nextInt();


		int result = minus(a, b);
		System.out.println(result);

	}

	// �޼ҵ� ����
	// classs ����, main �ٱ��ʿ� �޼ҵ� ����
	// ���� ������ ����Ÿ�� �޼ҵ� �̸�(){return �����}

	// 2���� ������ �Ű������� �޾Ƽ� �� ������� �ǵ����ִ� minus �޼ҵ� ����
	public static int minus(int a, int b) {
		int result = 0; // �ʱ�ȭ�� ���ִ°� ���ϴ�
		result = a - b; // ���� �����ϱ�

		return result; // ��ȯ
	}
}
