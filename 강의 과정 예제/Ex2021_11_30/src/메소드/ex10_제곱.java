package �޼ҵ�;

public class ex10_���� {

	public static void main(String[] args) {
		// 2���� ���� base , n�� �޾� base�� n������ŭ
		// ���� ��ȯ�ϴ� powerN() �޼ҵ带 �ۼ��ϼ���.

		int base = 12;
		int n = 3;
		int result = powerN(base, n);
		System.out.println("���Ȯ��: " + result);

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
