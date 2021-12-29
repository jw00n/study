
public class ex1202_01_Perfect {

	/*
	 * startValue���� endValue���� ���� �� ������
	 * 
	 */

	public static void main(String[] args) {

		int startValue = 2;
		int endValue = 1000;

		getPerfectNumber(startValue, endValue);

	}

	public static void getPerfectNumber(int startValue, int endValue) {
		String ans = "";

		boolean flag;
		for (int i = startValue; i < endValue; i++) {
			flag = isPerfect(i);
			
			if (flag) {
				ans += i + " ";
			} else
				continue;
		}
		System.out.println("2~1000������ ������: " + ans);
	}

	// ���������� ��ġ�ϴ°�? ���� function
	public static boolean isPerfect(int num) {
		return num == getSum(num);
	}

	public static int getSum(int num) {
		int sum = 0;
		// ����� Ư¡

		// i*i <= n ���μ������϶��� �Ǵ�
		for (int i = 1; i <= num / 2; i++) {
			sum += isDivisor(num, i);
		}
		return sum;
	}

	public static int isDivisor(int num1, int num2) {
		int result = 0;
		if (num1 % num2 == 0)
			result = num2;
		return result;
	}
}
