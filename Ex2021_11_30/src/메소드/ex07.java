package �޼ҵ�;

public class ex07 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		int result = lagerNumbers(num1, num2);

		System.out.println("ū �� Ȯ��: " + result);

	}

	private static int lagerNumbers(int num1, int num2) {
		//int result = 0; // ������� ����� ����

		// 1.num1�� num2�� ���� �� ū�� ��
		// 2. �� ū ���� result�� ����ֱ�
		// 3. ��, �� ���� ���ٸ� result 0�̶�� ���ڸ� ����ֱ�

		
		if (num1 > num2) {
			return num1;
		} else if (num1 < num2) {
			return  num2;
		} else return 0;
			// ������ ���� ������ �����ʿ�� ������ else �����ص�
		

		//return result;
	}

}
