package �޼ҵ�����;

public class ex02_������_���� {

	public static void main(String[] args) {

		// 6�� 1,2,3,6 ��� / 8�� 1,2,4,8
		// �������� �ڽ��� ������ ����� ���� �ڽŰ� ������ ��������� �Ѵ�.

		// 1. ����� ���ϴ� �޼ҵ�
		//2. 1~ 1000���� �������� �̾Ƴ���

		int num1 = 6;
		int num2 = 2;
		
		
		System.out.println(isPerfect(num1));

	}

	// num2�� num1�� ���? 16 1 2 4 8 16
	public static int isDivisor(int num1, int num2) {
		int result = 0;
		if (num1 % num2 == 0) 
			result =num2;
		return result;
	}

	public static boolean isPerfect(int num) {
		return num == getSum(num);
	}

	public static int getSum(int num) {
		int sum = 0;

		// 10�� ��� 1,2,5,10
		// 6�� ��� 1,2,3,6
		// 14�� ��� 1,2,7,14
		// 3�� ��� 1,3

		// ����� Ư¡

		// i*i <= n ���μ������϶��� �Ǵ�
		for (int i = 1; i <= num / 2; i++) {
			sum+= isDivisor(num,i);
		}
		return sum;
	}

}
