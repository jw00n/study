import java.util.Random;
import java.util.Scanner;


public class ch3_op {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int ans = random.nextInt(1000);// 0~99
		System.out.println("���� �����Ͽ����ϴ�. ���߾���� >>");
		String str;
		boolean flag = true;

		while (flag) {
			int x = sc.nextInt();

			if (x == ans) { // ������ ���� ���
				System.out.println("������ϴ�.");
				System.out.println("�ٽ� �Ͻðڽ��ϱ�? Y/N");
				str = sc.next();

				if (str.equals("Y")) { // �ٽ� �ϰڴٿ� Y�� ���� ���
					ans = random.nextInt(100);// 0~99�� ���� �ο��ϰ�
					System.out.println("���� �����Ͽ����ϴ�. ���߾���� >>");
					continue;// �����
				} else
					flag = false; // N�� �Է������� flag�� false���� �ο��Ͽ� while���� ����� �Ѵ�.

			} else if (x > ans) { // �Է��� ���ڰ� ���亸�� �� ū ���
				System.out.println("�� ����");
				continue; // ���� �ݺ�
			} else { // �Է��� ���ڰ� ���亸�� �� ���� ���
				System.out.println("�� ����");
				continue; // ���� �ݺ�
			}

		}

		System.out.println("���� ����");
		System.exit(0);

	}
}

/*
 * 0~99 ������ ���� �Է¹޾� ī���� ���ڿ� ��ġ�ϴ� �� ���ÿ�. ���ٸ� �� ���� ���ٸ� �� ���� ������ �������� ���ٿ� ����
 * 
 * ������ �ݺ��Ϸ��� y/n�� ���� n�� ��� ����ȴ�.
 * 
 * 
 */