package �޼ҵ�����;

public class ex01_������ {
	public static void main(String[] args) {

		// 6�� 1,2,3,6 ��� / 8�� 1,2,4,8
		// �������� �ڽ��� ������ ����� ���� �ڽŰ� ������ ��������� �Ѵ�.

		// 1. ����� ���ϴ� �޼ҵ�

		int num1 = 24;
		int num2 = 2;
		boolean divisor = isDivisor(num1, num2);

		System.out.println(divisor);

	}

	// num2�� num1�� ���?

	public static boolean isDivisor(int num1, int num2) {
		boolean result = false;

		if (num1 % num2 != 0)
			return result; // false ����
		System.out.println(num2 + "�� ����Դϴ�! \n������ ����");

		int sum = getSum(num1);

		result = num1 == sum;
		return result;
	}

	public static int getSum(int num1) {
		int sum = 0;
		for (int i = 1; i < num1; i++) {
			if (num1 % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

}
