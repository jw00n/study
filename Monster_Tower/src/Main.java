import java.util.Random;
import java.util.Scanner;

import Game.Game_DAO;
import Game.Game_VO;
import System.DAO;
import System.VO;
import 전투시스템.Boost;
import 전투시스템.Fight;
import 전투시스템.FightSpace;

/*
 
 	//vo에 넣을 변수들
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
	
		int floorCount = 0; // 층수 출력용

		Random rd = new Random();

		while (true) {
			System.out.println("[1]회원가입 [2]로그인 [3]랭킹 확인");
			ans = sc.nextInt();

			if (ans == 1) { // 회원가입
				// 계정 생성
				VO vo_register = dao.insert();
				// 캐릭터 생성
				Game_DAO gDao = new Game_DAO();
				game = gDao.Initial_insert(vo_register.getName());
				floorCount = game.getFloorCount();

			} else if (ans == 2) { // 로그인
				VO vo_login = dao.select();
				if (vo_login.getId() != null && vo_login.getPw() != null) {
					System.out.println("로그인 성공");

					while (true) {
						System.out.println("[1] 게임시작 [2] 게임설명");

						ans = sc.nextInt();

						if (ans == 1) {
							System.out.println("타워에 입장하셨습니다.");
							// 인게임 타워

							int e;// floor_index

							
							// 여기서 유저값을 넘겨주워야한다.
							FightSpace fightSpace= new FightSpace();
							Boost boost = new Boost();

							int i = 0;
							while (true) {
								System.out.println(i + "층에 입장하셨습니다.");
								while (true) {
									System.out.println("[1] 캐릭터 정보 확인  [2] 오르기 [3] 중단");
									ans = sc.nextInt();
									if (ans == 1) {
										game.charPrint(); // 인쇄용
									} else if (ans == 2) {// 올라가기
										break;
									} else if (ans == 3) {
										break;
									} else {// 오입력
										continue;
									}
								}
								if (ans == 3) { // 중단하기라면 게임종료
									System.out.println("게임이 종료되었습니다.");
									System.out.println("캐릭터 정보를 확인하십시오.");
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

							// 여기가 gameover?

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

			} else {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
		}

	}

}
