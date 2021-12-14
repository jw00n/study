import java.util.Random;
import java.util.Scanner;

import Game.Game_DAO;
import System.DAO;
import System.VO;
import 전투시스템.Boost;
import 전투시스템.Fight;
import 전투시스템.FightSpace;
import 전투시스템.Mon;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		DAO dao = new DAO();
//		Game_VO game = new Game_VO();
		Game_DAO gDao = new Game_DAO();
		Fight fight = new Fight();
		Mon mon = new Mon();

		int floorCount = 0; // 층수 출력용

		Random rd = new Random();
		boolean flag = true;

		while (flag) {
			System.out.println("[1]회원가입 [2]로그인 [3]랭킹 확인");
			ans = sc.nextInt();

			if (ans == 1) { // 회원가입
				// 계정 생성
				VO vo_register = dao.insert();
				// 캐릭터 생성
				fight = gDao.Initial_insert(vo_register.getName());

			} else if (ans == 2) { // 로그인
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
				fight.setSkill("스킬명");
				mon.setHp(0);
				mon.setAtt(0);
				mon.setJ(2);

				if (vo_login.getId() != null && vo_login.getPw() != null) {
					System.out.println("로그인 성공");

					while (flag) {
						System.out.println("[1] 게임시작 [2] 게임설명");
						ans = sc.nextInt();

						if (ans == 1) {
							System.out.println("타워에 입장하셨습니다.");
							// 인게임 타워
							int e;// floor_index
							FightSpace fightSpace = new FightSpace();
							Boost boost = new Boost();
							int i = 0;
							while (flag) {
								System.out.println(i + "층에 입장하셨습니다.");
								System.out.println("[1] 캐릭터 정보 확인  [2] 오르기 [3] 중단");
								ans = sc.nextInt();
								if (ans == 1) {
									fight.charPrint(); // 인쇄용
								} else if (ans == 2) {// 올라가기

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
											boost.recovery(fight);// 타워 층,
										} else if (input == 2) {
											boost.powerup(fight);// 공격력
										} else if (input == 3) {
											boost.manarecover(fight);// 타워층,
										} else if (input == 4) {
											boost.maxhpup(fight);// 타워층, 캐릭터 최대 체력
										}
									} else if (e == 2 || e == 3) {
										System.out.println("빈 공간이다.");
									}

									i++;
									fight.setFloorCount(i);

								} else if (ans == 3) {
									flag = false; // 게임종료

								} else {// 오입력
									continue;
								}

							}
						} else if (ans == 2) {
							System.out.println("게임설명");

						}

					}

				} else {
					System.out.println("로그인 실패");
					System.out.println("메인 화면으로 돌아갑니다.");
					continue;
				}

			} else if (ans == 3) { // 랭킹
				dao.rankSelect();

			} else {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
		}

		// 게임 종료
		System.out.println("게임이 종료되었습니다.");
		System.out.println("최종 스테이지 = " + fight.getFloorCount());
		System.out.println("캐릭터 정보를 확인하십시오.");
		fight.charPrint();
		gDao.save_update(fight);
		dao.last_insert(fight.getFloorCount());

	}
}
