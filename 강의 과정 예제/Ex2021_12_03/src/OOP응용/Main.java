package OOP����;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ���ϸ�
		Pokemon pika = new Pokemon("��ī��", "�鸸��Ʈ", "����", 3000, 150);
		Pokemon lizamon = new Pokemon("���ڸ�", "����������", "��", 2850, 135);

		while (true) {
			System.out.println("\n������ ���ϸ��� �����ϼ���.");
			System.out.print("[1] ��ī�� [2] ���ڸ� >>");
			int input = sc.nextInt();

			// 1. ��ī�� �����ߴٸ�
			// 2.[1] �Ϲݰ��� [2] ��ų����
			// 3. �Ϲݰ����� �����ߴ����, ��ī���� ���ݷ��� ���ڸ��� hp���� ����
			// 4. ��ų ������ �����ߴ����, ���ڸ��� hp-��ī�� ���ݷ�*1.5��
			////////////////////////////////////////////////


			if (input == 1) {// ��ī�� ����
				System.out.println("\n���� ������ �����ϼ���. ");
				System.out.print("[1] �Ϲݰ��� [2] ��ų����  >>");
				input = sc.nextInt();
				if (input == 1) { // �Ϲݰ���
					lizamon.setHp(lizamon.getHp() - pika.getAttack());

				} else { // ��ų����
					
					//�ڹ��� �⺻ �Ǽ����� double�̴�.
					lizamon.setHp((int) (lizamon.getHp() - 1.5 * pika.getAttack()));

				}

			} else if (input == 2) { // ���ڸ��� ����
				System.out.println("\n���� ������ �����ϼ���. ");
				System.out.print("[1] �Ϲݰ��� [2] ��ų����  >>");
				input = sc.nextInt();
				if (input == 1) { // �Ϲݰ���
					pika.setHp(pika.getHp() - lizamon.getAttack());

				} else { // ��ų����
					pika.setHp((int) (pika.getHp() - 1.5 * lizamon.getAttack()));

				}
			} else {
				System.out.println("�߸������ϼ̽��ϴ�. �ٽ� ����ֽʽÿ�.");
				continue;
			}

			////////////////////////////////////////////////
			//hp�� 0���� Ŭ���� hp���
			if (pika.getHp() > 0 && lizamon.getHp() > 0) {
				System.out.println("��ī���� hp: " + pika.getHp());
				System.out.println("���ڸ��� hp: " + lizamon.getHp());
			}
			
			
			// 3. �� �� �ϳ��� hp<=0 ������ ����

			if (pika.getHp() <= 0 || lizamon.getHp() <= 0) {
				if (pika.getHp() == 0) {
					System.out.println("��ī�� �й�");
					break;
				} else
					System.out.println("���ڸ� �й�");
				break;
			}
		}

	}

}
