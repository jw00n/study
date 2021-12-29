package 메소드응용;

public class ex01_완전수 {
	public static void main(String[] args) {

		// 6은 1,2,3,6 약수 / 8은 1,2,4,8
		// 완전수란 자신을 제외한 약수의 합이 자신과 같을때 완전수라고 한다.

		// 1. 약수를 구하는 메소드

		int num1 = 24;
		int num2 = 2;
		boolean divisor = isDivisor(num1, num2);

		System.out.println(divisor);

	}

	// num2가 num1의 약수?

	public static boolean isDivisor(int num1, int num2) {
		boolean result = false;

		if (num1 % num2 != 0)
			return result; // false 리턴
		System.out.println(num2 + "는 약수입니다! \n완전수 여부");

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
