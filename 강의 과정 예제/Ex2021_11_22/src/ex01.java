import java.util.Random;
import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);// ��ĳ��
		System.out.println("==Plus Game==");// �ȳ���

		// 0~19������ ������ ���� ���
		Random random = new Random();// ���� ������ ����
		int x = random.nextInt(100);// x,y�� 100�̸� ���� �� ������ ������ �Ҵ�
		int y = random.nextInt(100);

		String str;
		
	

		do {
			System.out.print(x + "+" + y + "=");// ���� ���
			int ans = sc.nextInt(); // ���� �Է¹���

			if (x + y == ans) { // �����ΰ��
				System.out.println("����"); // �������� ����ϰ�
				System.out.print("��� �Ͻðڽ��ϱ�? >>"); // ��������� �����.
				str = sc.next();// ������ �Է¹�����
				x = random.nextInt(100);// x,y�� �ٽ� 100�̸� ���� �� ������ ������ �Ҵ�
				y = random.nextInt(100);

			} else { // Ʋ�����
				System.out.println("����"); // ���п� ��� ������ ���
				System.out.print("��� �Ͻðڽ��ϱ�? >>");
				str = sc.next(); // ���� �Է¹޾Ҵٸ�
				continue; // ���������� �ѱ�

			}
		} while (str.equals("Y")); // �ϴ� ������ ��� �亯�� Y�� ��쿡 ������ ���ϴ�.

		System.out.println("����Ǿ����ϴ�!");
		System.exit(0);

	}
}
