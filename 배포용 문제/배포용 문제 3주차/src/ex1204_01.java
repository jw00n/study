
public class ex1204_01 {

	public static void main(String[] args) {
		// �ϻ��� ��

		System.out.println(isHarshad(11));

	}

	public static boolean isHarshad(int i) {
		boolean flag = false;

		int sum = 0;
		int x = i; // �� �������� ���ؾ��ϹǷ� ���� ����

		while (x >= 1) {
			sum += x % 10; // 1�� �ڸ�-> 10�� �ڸ� -> ...������ sum�� ������
			x /= 10;
		}

		if (i % sum == 0) { // ������ true �ƴ϶�� false�� ä��
			flag = true;
		}
		return flag;
	}

}
