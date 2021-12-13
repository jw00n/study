import java.util.Random;
import java.util.Scanner;

import Game.Game_DAO;
import Game.Game_VO;
import System.DAO;
import System.VO;
import �����ý���.Boost;
import �����ý���.Fight;
import �����ý���.FightSpace;

/*
 
 	//vo�� ���� ������
	String vo_id=null;
	String vo_pw=null;
	String vo_name=null;

 
 
 * */

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		DAO dao = new DAO();
		Game_VO game = new Game_VO();
		Fight fight=new Fight();
	
		int floorCount = 0; // ���� ��¿�

		Random rd = new Random();

		while (true) {
			System.out.println("[1]ȸ������ [2]�α��� [3]��ŷ Ȯ��");
			ans = sc.nextInt();

			if (ans == 1) { // ȸ������
				// ���� ����
				VO vo_register = dao.insert();
				// ĳ���� ����
				Game_DAO gDao = new Game_DAO();
				game = gDao.Initial_insert(vo_register.getName());
				floorCount = game.getFloorCount();

			} else if (ans == 2) { // �α���
				VO vo_login = dao.select();
				if (vo_login.getId() != null && vo_login.getPw() != null) {
					System.out.println("�α��� ����");

					while (true) {
						System.out.println("[1] ���ӽ��� [2] ���Ӽ���");

						ans = sc.nextInt();

						if (ans == 1) {
							System.out.println("Ÿ���� �����ϼ̽��ϴ�.");
							// �ΰ��� Ÿ��

							int e;// floor_index

							
							// ���⼭ �������� �Ѱ��ֿ����Ѵ�.
							FightSpace fightSpace= new FightSpace();
							Boost boost = new Boost();

							int i = 0;
							while (true) {
								System.out.println(i + "���� �����ϼ̽��ϴ�.");
								while (true) {
									System.out.println("[1] ĳ���� ���� Ȯ��  [2] ������ [3] �ߴ�");
									ans = sc.nextInt();
									if (ans == 1) {
										game.charPrint(); // �μ��
									} else if (ans == 2) {// �ö󰡱�
										break;
									} else if (ans == 3) {
										break;
									} else {// ���Է�
										continue;
									}
								}
								if (ans == 3) { // �ߴ��ϱ��� ��������
									System.out.println("������ ����Ǿ����ϴ�.");
									System.out.println("ĳ���� ������ Ȯ���Ͻʽÿ�.");
									game.charPrint();
									break;
								}

								e = rd.nextInt(2);
								if (e == 0) {
									fightSpace.Fight();
								} else if (e == 1) {
									boost.choice();
									int input = sc.nextInt();
								}
								i++;

								game.setFloorCount(i);

							}

							// ���Ⱑ gameover?

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

			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			}
		}

	}

}
