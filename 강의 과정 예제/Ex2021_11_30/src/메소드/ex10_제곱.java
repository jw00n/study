package 메소드;

public class ex10_제곱 {

	public static void main(String[] args) {
		// 2개의 정수 base , n을 받아 base의 n제곱만큼
		// 값을 반환하는 powerN() 메소드를 작성하세요.

		int base = 12;
		int n = 3;
		int result = powerN(base, n);
		System.out.println("결과확인: " + result);

	}

	public static int powerN(int base, int n) {
		int result = 1;

		if (n == 0) return result;
		
		for (int i = 0; i < n; i++) {
			result *= base;
		} 
		return result;
		
	}

}
