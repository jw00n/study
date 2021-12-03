package OOP응용;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 포켓몬
		Pokemon pika = new Pokemon("피카츄", "백만볼트", "전기", 3000, 150);
		Pokemon lizamon = new Pokemon("리자몽", "지구던지기", "불", 2850, 135);

		while (true) {
			System.out.println("\n공격할 포켓몬을 선택하세요.");
			System.out.print("[1] 피카츄 [2] 리자몽 >>");
			int input = sc.nextInt();

			// 1. 피카츄를 선택했다면
			// 2.[1] 일반공격 [2] 스킬공격
			// 3. 일반공격을 선택했더라면, 피카츄의 공격력을 리자몽의 hp에서 감산
			// 4. 스킬 공격을 선택했더라면, 리자몽의 hp-피카츄 공격력*1.5배
			////////////////////////////////////////////////


			if (input == 1) {// 피카츄를 선택
				System.out.println("\n공격 유형을 선택하세요. ");
				System.out.print("[1] 일반공격 [2] 스킬공격  >>");
				input = sc.nextInt();
				if (input == 1) { // 일반공격
					lizamon.setHp(lizamon.getHp() - pika.getAttack());

				} else { // 스킬공격
					
					//자바의 기본 실수형은 double이다.
					lizamon.setHp((int) (lizamon.getHp() - 1.5 * pika.getAttack()));

				}

			} else if (input == 2) { // 리자몽을 선택
				System.out.println("\n공격 유형을 선택하세요. ");
				System.out.print("[1] 일반공격 [2] 스킬공격  >>");
				input = sc.nextInt();
				if (input == 1) { // 일반공격
					pika.setHp(pika.getHp() - lizamon.getAttack());

				} else { // 스킬공격
					pika.setHp((int) (pika.getHp() - 1.5 * lizamon.getAttack()));

				}
			} else {
				System.out.println("잘못선택하셨습니다. 다시 골라주십시오.");
				continue;
			}

			////////////////////////////////////////////////
			//hp가 0보다 클때는 hp출력
			if (pika.getHp() > 0 && lizamon.getHp() > 0) {
				System.out.println("피카츄의 hp: " + pika.getHp());
				System.out.println("리자몽의 hp: " + lizamon.getHp());
			}
			
			
			// 3. 둘 중 하나라도 hp<=0 게임을 종료

			if (pika.getHp() <= 0 || lizamon.getHp() <= 0) {
				if (pika.getHp() == 0) {
					System.out.println("피카츄 패배");
					break;
				} else
					System.out.println("리자몽 패배");
				break;
			}
		}

	}

}
