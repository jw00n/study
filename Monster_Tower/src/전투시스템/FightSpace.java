package �����ý���;

import java.util.Random;
import java.util.Scanner;

public class FightSpace {

	public void Fight(Fight user) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int he = 0;
		int att = 0;
		int j = 2;
		
		user.setVexp(10);
		user.setVhp(10);
		user.setVmp(10);
		user.setLv(1);
		user.setSkill("��ų��");
		
		he = rd.nextInt(j) + 4;
		att = rd.nextInt(j) + 1;
		Mon emon = new Mon("����", he, he, he, att);

		// ������ ���ݷ°� ü���� ���� ���� ����
		System.out.println("���Ϳ� �����ƴ�.");
		System.out.println("���� ����");
		while (true) {
			System.out.println(emon.getName() + "�� ���� >> " + "ü�� : " + emon.getVhp() + "/" + emon.getHp() + " ���ݷ� : "
					+ emon.getAtt());
			System.out.println(user.getName() + "�� ���� >> " + "ü�� : " + user.getVhp() + "/" + user.getHp() + " ���� : "
					+ user.getVmp() + "/" + user.getMp() + " ���ݷ� : " + user.getAtt());
			// ���� ���� : ������ ü�°� ���ݷ��� ����ؼ� �󸶳� ������ Ȯ���� �� �ְ� ����
			System.out.println("�ൿ�� �����ϼ���");
			System.out.print("[1]�Ϲݰ��� [2]��ų���� >> ");
			int input = sc.nextInt();
			System.out.println(emon.getName() + "�� ����");
			System.out.println(emon.getName() + "�� �������� " + user.getName() + "��(��) " + emon.getAtt() + "�� �������� �Ծ���.");
			user.setHp(user.getHp() - emon.getAtt());
			System.out.println(user.getName() + "�� ���� ü�� : " + user.getVhp() + "/" + user.getHp());
			// ���� ���� : �Ϲ� ������ �� �� ���� ��ų������ �� �� ���� ���� �� ������ ����
			if (input == 1) {
				System.out.println(user.getName() + "�� �Ϲݰ���");
				System.out
						.println(user.getName() + "�� �������� " + emon.getName() + "��(��) " + user.getAtt() + "�� �������� �Ծ���.");
				emon.setHp(emon.getHp() - user.getAtt());
				System.out.println(emon.getName() + "�� ���� ü�� : " + emon.getVhp() + "/" + emon.getHp());
				// �Ϲݰ��� ���� : ���� �������� �־��� ������ ���� ü���� ������ ǥ��
			} else if (input == 2) {
				if (user.getMp() >= 4) {
					System.out.println(user.getName() + "�� ��ų����");
					System.out.println(user.getName() + "�� " + user.getSkill() + "�� " + emon.getName() + "��(��) "
							+ (int) (user.getAtt() * 1.5) + "�� �������� �Ծ���.");
					emon.setHp((int) (emon.getHp() - user.getAtt() * 1.5));
					user.setMp(user.getMp() - 4);
					System.out.println(emon.getName() + "�� ���� ü�� : " + emon.getVhp() + "/" + emon.getHp());
					System.out.println(user.getName() + "�� ���� ���� : " + user.getVmp() + "/" + user.getMp());

					System.out.println("===========================");
					// ��ų���� ���� : ��ų�������� ���� �������� �־����� ǥ�� �� ������ ���� ü�°� ������ ���� ���� ǥ��
				} else {
					System.out.println("������ �����Ͽ� ���ݿ� �����߽��ϴ�.");
					// ������ �����ϸ� �ٽ� �����ϰ� ���� ���ư�
				}
			}
			if (user.getHp() <= 0) {
				System.out.println("���� ����");
				System.out.println("�й�");
				System.out.println("Game Over");
				break;
			} else if (emon.getHp() <= 0) {
				System.out.println("���� ����");
				System.out.println("�¸�!");
				System.out.println(emon.getExp() + "��ŭ�� ����ġ ���");
				user.setExp(user.getExp() + emon.getExp());
				System.out.println(user.getVexp() + "/" + user.getExp());
				if (user.getExp() >= user.getVexp()) {
					user.setExp(user.getExp() - user.getVexp());
					user.setVexp(user.getVexp() + 1);
					System.out.println("������ ����߽��ϴ�. ��ȭ�� �ɷ�ġ�� �������ּ���.");
					user.setLv(user.getLv() + 1);
					// �¸� �� ����ġ�� �ִ� ����ġ�� �Ѿ�� ������ ����ϰ� ����ġ�� 0���� �ʱ�ȭ �� �� ������ ����ġ �߰�
					// �������� �ִ� ����ġ�� 1���
					System.out.println("[1]�ִ�ü�� [2]�ִ븶�� [3]���ݷ� >> ");
					int status = sc.nextInt();
					if (status == 1) {
						user.setVhp(user.getVhp() + 2);
					} else if (status == 2) {
						user.setVmp(user.getVmp() + 2);
					} else if (status == 3) {
						user.setAtt(user.getAtt() + 2);
					}
					System.out.println("������ġ�� ü�°� ������ ȸ���˴ϴ�.");
					user.setMp(user.getVmp());
					if (user.getHp() < user.getVhp() / 2) {
						user.setHp(user.getHp() + user.getVhp() / 2);
					} else if (user.getHp() > user.getVhp() / 2) {
						user.setHp(user.getVhp());
					}
					j++;
					break;
					// ������ ����ϸ� ���ϴ� �������ͽ� �ϳ��� �����Ͽ� ��ȭ �� ������ġ�� ü�°� ������ ȸ��
				} else {
					break;
					// �������� �������� ��� ����ġ�� ����ϰ� �״�� ����
				}
			}
		}
	}
}
