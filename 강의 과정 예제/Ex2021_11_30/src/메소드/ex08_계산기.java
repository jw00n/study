package �޼ҵ�;

import java.util.Scanner;

public class ex08_���� {

	/*
	 * op�� ������ ���ϴ� �����ڷ� �ʱ�ȭ �ϼ���. �����ڿ� �°� ������ �������� ��ȯ���ִ� cal�޼ҵ带 �ۼ��ϼ���.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���>>");
		int num1 = sc.nextInt();
		char op = sc.next().charAt(0);
		int num2 = sc.nextInt();
		System.out.println(cal(num1, num2, op));

	}

	// 1. �Ű������� �޾ƿ� op�� ���� ���

	// 2. num1+num2 �� ���Ѱ��� result�� ����ּ��뤷

	// 3. op - ��� ���� ���̸� result�� ����޿�
	// ū������ �������� �����ؼ� ������� result�� ����ּ���
	// 5. op��

	public static int cal(int num1, int num2, char op) {
		int result = 0;

		switch (op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 > num2 ? num1 - num2 : num2 - num1;
			break;
		case '*':
			result= num1*num2;
			break;
		case '/':
			result =num1/num2;
			break;
		default :
			//���ܻ��� ����
		}
		

		return result;
	}
}
