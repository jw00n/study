package 전투시스템;

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
		user.setSkill("스킬명");
		
		he = rd.nextInt(j) + 4;
		att = rd.nextInt(j) + 1;
		Mon emon = new Mon("몬스터", he, he, he, att);

		// 랜덤한 공격력과 체력을 가진 몬스터 출현
		System.out.println("몬스터와 마주쳤다.");
		System.out.println("전투 개시");
		while (true) {
			System.out.println(emon.getName() + "의 상태 >> " + "체력 : " + emon.getVhp() + "/" + emon.getHp() + " 공격력 : "
					+ emon.getAtt());
			System.out.println(user.getName() + "의 상태 >> " + "체력 : " + user.getVhp() + "/" + user.getHp() + " 마나 : "
					+ user.getVmp() + "/" + user.getMp() + " 공격력 : " + user.getAtt());
			// 전투 개시 : 몬스터의 체력과 공격력을 출력해서 얼마나 강한지 확인할 수 있게 해줌
			System.out.println("행동을 선택하세요");
			System.out.print("[1]일반공격 [2]스킬공격 >> ");
			int input = sc.nextInt();
			System.out.println(emon.getName() + "의 공격");
			System.out.println(emon.getName() + "의 공격으로 " + user.getName() + "는(은) " + emon.getAtt() + "의 데미지를 입었다.");
			user.setHp(user.getHp() - emon.getAtt());
			System.out.println(user.getName() + "의 남은 체력 : " + user.getVhp() + "/" + user.getHp());
			// 전투 시작 : 일반 공격을 할 것 인지 스킬공격을 할 것 인지 선택 후 몬스터의 선공
			if (input == 1) {
				System.out.println(user.getName() + "의 일반공격");
				System.out
						.println(user.getName() + "의 공격으로 " + emon.getName() + "는(은) " + user.getAtt() + "의 데미지를 입었다.");
				emon.setHp(emon.getHp() - user.getAtt());
				System.out.println(emon.getName() + "의 남은 체력 : " + emon.getVhp() + "/" + emon.getHp());
				// 일반공격 선택 : 몇의 데미지를 주었고 몬스터의 남은 체력이 몇인지 표기
			} else if (input == 2) {
				if (user.getMp() >= 4) {
					System.out.println(user.getName() + "의 스킬공격");
					System.out.println(user.getName() + "의 " + user.getSkill() + "로 " + emon.getName() + "는(은) "
							+ (int) (user.getAtt() * 1.5) + "의 데미지를 입었다.");
					emon.setHp((int) (emon.getHp() - user.getAtt() * 1.5));
					user.setMp(user.getMp() - 4);
					System.out.println(emon.getName() + "의 남은 체력 : " + emon.getVhp() + "/" + emon.getHp());
					System.out.println(user.getName() + "의 남은 마나 : " + user.getVmp() + "/" + user.getMp());

					System.out.println("===========================");
					// 스킬공격 선택 : 스킬공격으로 얼마의 데미지를 주었는지 표기 후 몬스터의 남은 체력과 유저의 남은 마나 표기
				} else {
					System.out.println("마나가 부족하여 공격에 실패했습니다.");
					// 마나가 부족하면 다시 선택하게 위로 돌아감
				}
			}
			if (user.getHp() <= 0) {
				System.out.println("전투 종료");
				System.out.println("패배");
				System.out.println("Game Over");
				break;
			} else if (emon.getHp() <= 0) {
				System.out.println("전투 종료");
				System.out.println("승리!");
				System.out.println(emon.getExp() + "만큼의 경험치 상승");
				user.setExp(user.getExp() + emon.getExp());
				System.out.println(user.getVexp() + "/" + user.getExp());
				if (user.getExp() >= user.getVexp()) {
					user.setExp(user.getExp() - user.getVexp());
					user.setVexp(user.getVexp() + 1);
					System.out.println("레벨이 상승했습니다. 강화할 능력치를 선택해주세요.");
					user.setLv(user.getLv() + 1);
					// 승리 시 경험치가 최대 경험치를 넘어가면 레벨이 상승하고 경험치를 0으로 초기화 한 뒤 나머지 경험치 추가
					// 레벨업시 최대 경험치량 1상승
					System.out.println("[1]최대체력 [2]최대마나 [3]공격력 >> ");
					int status = sc.nextInt();
					if (status == 1) {
						user.setVhp(user.getVhp() + 2);
					} else if (status == 2) {
						user.setVmp(user.getVmp() + 2);
					} else if (status == 3) {
						user.setAtt(user.getAtt() + 2);
					}
					System.out.println("일정수치의 체력과 마나가 회복됩니다.");
					user.setMp(user.getVmp());
					if (user.getHp() < user.getVhp() / 2) {
						user.setHp(user.getHp() + user.getVhp() / 2);
					} else if (user.getHp() > user.getVhp() / 2) {
						user.setHp(user.getVhp());
					}
					j++;
					break;
					// 레벨이 상승하면 원하는 스테이터스 하나를 선택하여 강화 후 일정수치의 체력과 마나를 회복
				} else {
					break;
					// 레벨업을 하지못한 경우 경험치만 상승하고 그대로 종료
				}
			}
		}
	}
}
