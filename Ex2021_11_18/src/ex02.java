import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�󱸰��� ������ �Է��ϼ���: ");
		int all = sc.nextInt(); // ��� �󱸰��� ������ �Է¹޴´�.
		int box = 5; // �� �ڽ��� �� ���ִ� ���� ��

		// ���� result�� �󱸰��� ������ �ڽ��� ������ �������� Ȯ���ϰ� �������� �ִٸ� +1 �Ѵ�.
		int result = all % box == 0 ? all / box : all / box + 1;
		System.out.println("�ʿ��� ������ ��: " + result);// ���

	}
}
