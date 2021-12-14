import java.util.Random;
import java.util.Scanner;

import Game.Game_DAO;
import System.DAO;
import System.VO;
import �����ý���.Boost;
import �����ý���.Fight;
import �����ý���.FightSpace;
import �����ý���.Mon;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		DAO dao = new DAO();
//		Game_VO game = new Game_VO();
		Game_DAO gDao = new Game_DAO();
		Fight fight = new Fight();
		Mon mon = new Mon();

		int floorCount = 0; // ���� ��¿�

		Random rd = new Random();
		boolean flag = true;

		while (flag) {
			System.out.println("[1]ȸ������ [2]�α��� [3]��ŷ Ȯ��");
			ans = sc.nextInt();

			if (ans == 1) { // ȸ������
				// ���� ����
				VO vo_register = dao.insert();
				// ĳ���� ����
				fight = gDao.Initial_insert(vo_register.getName());

			} else if (ans == 2) { // �α���
				VO vo_login = dao.select();
				dao.lastdate_update(vo_login.getId());
				fight = gDao.select(vo_login.getName());
				

				fight.setVexp(10);
				fight.setExp(0);
				fight.setVhp(10);
				fight.setHp(10);
				fight.setVmp(10);
				fight.setMp(10);
				fight.setLv(1);
				fight.setSkill("��ų��");
				mon.setHp(0);
				mon.setAtt(0);
				mon.setJ(2);

				if (vo_login.getId() != null && vo_login.getPw() != null) {
					System.out.println("�α��� ����");

					while (flag) {
						System.out.println("[1] ���ӽ��� [2] ���Ӽ���");
						ans = sc.nextInt();

						if (ans == 1) {
							System.out.println("Ÿ���� �����ϼ̽��ϴ�.");
							// �ΰ��� Ÿ��
							int e;// floor_index
							FightSpace fightSpace = new FightSpace();
							Boost boost = new Boost();
							int i = 0;
							while (flag) {
								System.out.println(i + "���� �����ϼ̽��ϴ�.");
								System.out.println("[1] ĳ���� ���� Ȯ��  [2] ������ [3] �ߴ�");
								ans = sc.nextInt();
								if (ans == 1) {
									fight.charPrint(); // �μ��
								} else if (ans == 2) {// �ö󰡱�

									e = rd.nextInt(5);
									if (e == 0 || e == 4) {
										fightSpace.Fight(fight, mon);
										if (fight.getHp() <= 0) {
											flag = false;
										}
									} else if (e == 1) {
										boost.choice();
										int input = sc.nextInt();

										if (input == 1) {
											boost.recovery(fight);// Ÿ�� ��,
										} else if (input == 2) {
											boost.powerup(fight);// ���ݷ�
										} else if (input == 3) {
											boost.manarecover(fight);// Ÿ����,
										} else if (input == 4) {
											boost.maxhpup(fight);// Ÿ����, ĳ���� �ִ� ü��
										}
									} else if (e == 2 || e == 3) {
										System.out.println("�� �����̴�.");
									}

									i++;
									fight.setFloorCount(i);

								} else if (ans == 3) {
									flag = false; // ��������

								} else {// ���Է�
									continue;
								}

							}
						} else if (ans == 2) {
							System.out.println("���Ӽ���");

						}

					}

				} else {
					System.out.println("�α��� ����");
					System.out.println("���� ȭ������ ���ư��ϴ�.");
					continue;
				}

			} else if (ans == 3) { // ��ŷ
				dao.rankSelect();

			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			}
		}

		// ���� ����
		System.out.println("������ ����Ǿ����ϴ�.");
		System.out.println("���� �������� = " + fight.getFloorCount());
		System.out.println("ĳ���� ������ Ȯ���Ͻʽÿ�.");
		fight.charPrint();
		gDao.save_update(fight);
		dao.last_insert(fight.getFloorCount());

	}
}
