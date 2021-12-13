package 전투시스템;

	import java.util.Random;
	import java.util.Scanner;

	public class Boost {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		public int towercnt;
		public int hp;
		public int mana;
		public int maxhp;
		public int power;

		public int getTowercnt() {
			return towercnt;
		}

		public int getPower() {
			return power;
		}

		public int getHp() {
			return hp;
		}

		public int getMana() {
			return mana;
		}

		public int getMaxhp() {
			return maxhp;
		}

		public void setTowercnt(int towercnt) {
			this.towercnt = towercnt;
		}

		public void setHp(int hp) {
			this.hp = hp;
		}

		public void setMana(int mana) {
			this.mana = mana;
		}

		public void setMaxhp(int maxhp) {
			this.maxhp = maxhp;
		}

		public void setPower(int power) {
			this.power = power;
		}

		public void choice() {

			System.out.println("부스터 공간입니다 원하시는 선택지를 고르세요");
			System.out.println("1.회복공간 ");
			System.out.println("2.공격부스터");
			System.out.println("3.마나회복");
			System.out.println("4.최대체력증가");
		}

		public static int recovery(int towercnt, int hp) {

			Random rd = new Random();

			System.out.print("회복공간 설명 :");
			System.out.println("회복공간에서는 hp를 채울수잇습니다");
			System.out.println("채우는 양은 랜덤으로 (+5,+3,+1) 등장합니다");
			System.out.println("10층을 오를수록 랜덤량은 +1씩 증가합니다");

			int result = 0;

			int[] arrys = { 1, 3, 5 };

			if (towercnt > 10) {
				for (int i = 0; i < arrys.length; i++) {
					for (int j = 0; j < towercnt - 10; j++) {
						arrys[i] += j;

					}

				}
			}
			System.out.println("회복량 결정");
			int recovery = rd.nextInt(3);
			System.out.println(arrys[recovery] + "만큼의 회복량이 결정됫습니다.");
			result = hp + arrys[recovery];
			System.out.println(result);

			return result;

		}

		public static int powerup(int power) {

			System.out.print("공격부스터 설명:");
			System.out.println("공격부스터에서는 공격력을 올릴수있습니다.");
			System.out.println("올라가는양은 +1입니다");

			return power = +1;

		}

		public static int manarecover(int towercnt, int mana) {

			Random rd = new Random();

			System.out.print("마나회복공간 설명 :");
			System.out.println("마나회복공간에서는 mp를 채울수잇습니다");
			System.out.println("채우는 양은 랜덤으로 (+5,+3,+1) 등장합니다");
			System.out.println("10층을 오를수록 랜덤량은 +1씩 증가합니다");

			int result = 0;

			int[] arrys = { 1, 3, 5 };

			if (towercnt > 10) {
				for (int i = 0; i < arrys.length; i++) {
					for (int j = 0; j < towercnt - 10; j++) {
						arrys[i] += j;

					}

				}
			}
			System.out.println("마나회복량 결정");
			int recovery = rd.nextInt(3);
			System.out.println(arrys[recovery] + "만큼의 회복량이 결정됫습니다.");
			result = mana + arrys[recovery];
			System.out.println(result);

			return result;

		}

		public static int maxhpup(int towercnt, int maxhp) {

			Random rd = new Random();

			System.out.print("최대체력증가공간 설명 :");
			System.out.println("최대체력증가공간에서는 최대체력을 증가시킬수잇습니다");
			System.out.println("오르는 양은 랜덤으로 (+5,+3,+1) 등장합니다");
			System.out.println("10층을 오를수록 랜덤량은 +1씩 증가합니다");

			int result = 0;

			int[] arrys = { 1, 3, 5 };

			if (towercnt > 10) {
				for (int i = 0; i < arrys.length; i++) {
					for (int j = 0; j < towercnt - 10; j++) {
						arrys[i] += j;

					}

				}
			}
			System.out.println("최대체력증가량 결정");
			int recovery = rd.nextInt(3);
			System.out.println(arrys[recovery] + "만큼의 증가량이 결정됫습니다.");
			result = maxhp + arrys[recovery];
			System.out.println(result);

			return result;

		}

	}

