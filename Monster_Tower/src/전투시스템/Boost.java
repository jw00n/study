package 전투시스템;

	import java.util.Random;
	import java.util.Scanner;

	public class Boost {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();


		public void choice() {

			System.out.println("부스터 공간입니다 원하시는 선택지를 고르세요");
			System.out.println("1.회복공간 ");
			System.out.println("2.공격부스터");
			System.out.println("3.마나회복");
			System.out.println("4.최대체력증가");
		}

		public void recovery(Fight fight ) {
           
			Random rd = new Random();

			System.out.print("회복공간 설명 :");
			System.out.println("회복공간에서는 hp를 채울수잇습니다");
			System.out.println("채우는 양은 랜덤으로 (+5,+3,+1) 등장합니다");
			System.out.println("10층을 오를수록 랜덤량은 +1씩 증가합니다");

			int[] arrys = { 1, 3, 5 };

			if (fight.getFloorCount() > 10) {
				for (int i = 0; i < arrys.length; i++) {
					for (int j = 0; j < fight.getFloorCount() - 10; j++) {
						arrys[i] += j;

					}

				}
			}
			System.out.println("회복량 결정");
			int recovery = rd.nextInt(3);
			System.out.println(arrys[recovery] + "만큼의 회복량이 결정됫습니다.");
			if(fight.getVhp()<fight.getHp() + arrys[recovery]) {
				fight.setHp(fight.getVhp());
			}else {
				fight.setHp(fight.getHp()+arrys[recovery]);
				
			}
			System.out.println("현재 hp :  ");
			System.out.println(fight.getHp());
			
		}

		public void powerup(Fight fight) {

			System.out.print("공격부스터 설명:");
			System.out.println("공격부스터에서는 공격력을 올릴수있습니다.");
			System.out.println("올라가는양은 +1입니다");

			fight.setAtt(fight.getAtt()+1);

		}

		public void manarecover(Fight fight) {

			Random rd = new Random();

			System.out.print("마나회복공간 설명 :");
			System.out.println("마나회복공간에서는 mp를 채울수잇습니다");
			System.out.println("채우는 양은 랜덤으로 (+5,+3,+1) 등장합니다");
			System.out.println("10층을 오를수록 랜덤량은 +1씩 증가합니다");

			int[] arrys = { 1, 3, 5 };

			if (fight.getFloorCount() > 10) {
				for (int i = 0; i < arrys.length; i++) {
					for (int j = 0; j < fight.getFloorCount() - 10; j++) {
						arrys[i] += j;

					}

				}
			}
			System.out.println("회복량 결정");
			int recovery = rd.nextInt(3);
			System.out.println(arrys[recovery] + "만큼의 회복량이 결정됫습니다.");
			if(fight.getVmp()<fight.getMp() + arrys[recovery]) {
				fight.setMp(fight.getVmp());
			}else {
				fight.setMp(fight.getMp()+arrys[recovery]);
				
			}
			System.out.println("현재 mp :  ");
			System.out.println(fight.getMp());

		}

		public void maxhpup(Fight fight) {

			Random rd = new Random();

			System.out.print("최대체력증가공간 설명 :");
			System.out.println("최대체력증가공간에서는 최대체력을 증가시킬수잇습니다");
			System.out.println("오르는 양은 랜덤으로 (+5,+3,+1) 등장합니다");
			System.out.println("10층을 오를수록 랜덤량은 +1씩 증가합니다");

			int[] arrys = { 1, 3, 5 };

			if (fight.getFloorCount() > 10) {
				for (int i = 0; i < arrys.length; i++) {
					for (int j = 0; j < fight.getFloorCount() - 10; j++) {
						arrys[i] += j;

					}

				}
			}
			System.out.println("최대체력증가량 결정");
			int recovery = rd.nextInt(3);
			System.out.println(arrys[recovery] + "만큼의 증가량이 결정됫습니다.");
			fight.setVhp(fight.getVhp()+arrys[recovery]);
			
			System.out.println("현재 최대 체력 :  ");
			System.out.println(fight.getVhp());
 

			
		}

	}