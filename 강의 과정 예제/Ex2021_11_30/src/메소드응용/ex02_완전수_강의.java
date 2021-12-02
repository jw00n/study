package 메소드응용;

public class ex02_완전수_강의 {

	public static void main(String[] args) {

		// 6은 1,2,3,6 약수 / 8은 1,2,4,8
		// 완전수란 자신을 제외한 약수의 합이 자신과 같을때 완전수라고 한다.

		// 1. 약수를 구하는 메소드
		//2. 1~ 1000까지 완전수를 뽑아내라

		int num1 = 6;
		int num2 = 2;
		
		
		System.out.println(isPerfect(num1));

	}

	// num2가 num1의 약수? 16 1 2 4 8 16
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

		// 10의 약수 1,2,5,10
		// 6의 약수 1,2,3,6
		// 14의 약수 1,2,7,14
		// 3의 약수 1,3

		// 약수의 특징

		// i*i <= n 소인수분해일때만 되는
		for (int i = 1; i <= num / 2; i++) {
			sum+= isDivisor(num,i);
		}
		return sum;
	}

}
