package �����ý���;

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

			System.out.println("�ν��� �����Դϴ� ���Ͻô� �������� ������");
			System.out.println("1.ȸ������ ");
			System.out.println("2.���ݺν���");
			System.out.println("3.����ȸ��");
			System.out.println("4.�ִ�ü������");
		}

		public static int recovery(int towercnt, int hp) {

			Random rd = new Random();

			System.out.print("ȸ������ ���� :");
			System.out.println("ȸ������������ hp�� ä����ս��ϴ�");
			System.out.println("ä��� ���� �������� (+5,+3,+1) �����մϴ�");
			System.out.println("10���� �������� �������� +1�� �����մϴ�");

			int result = 0;

			int[] arrys = { 1, 3, 5 };

			if (towercnt > 10) {
				for (int i = 0; i < arrys.length; i++) {
					for (int j = 0; j < towercnt - 10; j++) {
						arrys[i] += j;

					}

				}
			}
			System.out.println("ȸ���� ����");
			int recovery = rd.nextInt(3);
			System.out.println(arrys[recovery] + "��ŭ�� ȸ������ �����̽��ϴ�.");
			result = hp + arrys[recovery];
			System.out.println(result);

			return result;

		}

		public static int powerup(int power) {

			System.out.print("���ݺν��� ����:");
			System.out.println("���ݺν��Ϳ����� ���ݷ��� �ø����ֽ��ϴ�.");
			System.out.println("�ö󰡴¾��� +1�Դϴ�");

			return power = +1;

		}

		public static int manarecover(int towercnt, int mana) {

			Random rd = new Random();

			System.out.print("����ȸ������ ���� :");
			System.out.println("����ȸ������������ mp�� ä����ս��ϴ�");
			System.out.println("ä��� ���� �������� (+5,+3,+1) �����մϴ�");
			System.out.println("10���� �������� �������� +1�� �����մϴ�");

			int result = 0;

			int[] arrys = { 1, 3, 5 };

			if (towercnt > 10) {
				for (int i = 0; i < arrys.length; i++) {
					for (int j = 0; j < towercnt - 10; j++) {
						arrys[i] += j;

					}

				}
			}
			System.out.println("����ȸ���� ����");
			int recovery = rd.nextInt(3);
			System.out.println(arrys[recovery] + "��ŭ�� ȸ������ �����̽��ϴ�.");
			result = mana + arrys[recovery];
			System.out.println(result);

			return result;

		}

		public static int maxhpup(int towercnt, int maxhp) {

			Random rd = new Random();

			System.out.print("�ִ�ü���������� ���� :");
			System.out.println("�ִ�ü���������������� �ִ�ü���� ������ų���ս��ϴ�");
			System.out.println("������ ���� �������� (+5,+3,+1) �����մϴ�");
			System.out.println("10���� �������� �������� +1�� �����մϴ�");

			int result = 0;

			int[] arrys = { 1, 3, 5 };

			if (towercnt > 10) {
				for (int i = 0; i < arrys.length; i++) {
					for (int j = 0; j < towercnt - 10; j++) {
						arrys[i] += j;

					}

				}
			}
			System.out.println("�ִ�ü�������� ����");
			int recovery = rd.nextInt(3);
			System.out.println(arrys[recovery] + "��ŭ�� �������� �����̽��ϴ�.");
			result = maxhp + arrys[recovery];
			System.out.println(result);

			return result;

		}

	}

