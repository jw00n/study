
public class ex1202_01_Perfect {

	/*
	 * startValue부터 endValue까지 숫자 중 완전수
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
		System.out.println("2~1000까지의 완전수: " + ans);
	}

	// 완전수인지 일치하는가? 묻는 function
	public static boolean isPerfect(int num) {
		return num == getSum(num);
	}

	public static int getSum(int num) {
		int sum = 0;
		// 약수의 특징

		// i*i <= n 소인수분해일때만 되는
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
