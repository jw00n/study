import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ݾ��� �Է��ϼ���.");
		int pay = sc.nextInt(); // �Է¹��� �ݾ�

		System.out.print("�޴��� ������\n 1.�ݶ�(800��) 2. ����(500��) 3. ��Ÿ�ο���(1500��)) >>");
		int menuNum = sc.nextInt(); // ���õ� �޴�
		int coin = 0; // �ܵ�
		int price = 0;

		// ����ġ�� menuNum�� �μ��� �޾Ƽ� ���ð��� ���� �� ���̽� ���� �����Ѵ�
		// �ֹ���ȣ �̿��� �Է��� ���� �ÿ� default�� �߸��� �������� �˸��� �ȳ����� ����Ѵ�.
		switch (menuNum) {
		case 1:
			price = 800;
			break; // �Ϲ������� �ܵ� ����� �� ���
		case 2: // ���� ����.
			price = 500;
			break;
		case 3:
			price = 1500;
			break;
		default: // ���ǵ� ���̽� �̿��� ���� �Էµ� ���
			coin = pay;// �ܵ����� ���� �ݾ״����ϰ� ��ȯ
			System.out.println("�޴��� �߸� �����ϼ̽��ϴ�");// �ȳ���
			break;
		}

		if (coin < 0) { // ���õ� �޴� ���ݺ��� �Էµ� ������ ���� ��� = �ܵ��� ������ ���
			System.out.println("���� �����ؿ�"); // ���� �������� �˸�
			coin = pay;// �ܵ��� �ٽ� ���� �ݾ��� ����
		}

		coin = pay - price;

		// �ܵ����
		int m1 = coin / 1000; // 1õ�� ���� -> �ܵ��� 1000���� ���� ��
		int m2 = (coin % 1000) / 500; // 500�� ���� -> 1000���� ���� �������� 500���� ���� ��
		int m3 = (coin % 500) / 100; // 100�� ���� ->500���� ���� �������� 100���� ���� ��

		// �ܵ� �� ���� ���
		System.out.println("�ܵ�: " + coin + "��");
		System.out.println("õ�� : " + m1 + " ����� : " + m2 + " ��� : " + m3);

	}

}
