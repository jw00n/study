package �����ý���;

	import java.util.Random;
	import java.util.Scanner;

	public class Boost {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();


		public void choice() {

			System.out.println("�ν��� �����Դϴ� ���Ͻô� �������� ������");
			System.out.println("1.ȸ������ ");
			System.out.println("2.���ݺν���");
			System.out.println("3.����ȸ��");
			System.out.println("4.�ִ�ü������");
		}

		public void recovery(Fight fight ) {
           
			Random rd = new Random();

			System.out.print("ȸ������ ���� :");
			System.out.println("ȸ������������ hp�� ä����ս��ϴ�");
			System.out.println("ä��� ���� �������� (+5,+3,+1) �����մϴ�");
			System.out.println("10���� �������� �������� +1�� �����մϴ�");

			int[] arrys = { 1, 3, 5 };

			if (fight.getFloorCount() > 10) {
				for (int i = 0; i < arrys.length; i++) {
					for (int j = 0; j < fight.getFloorCount() - 10; j++) {
						arrys[i] += j;

					}

				}
			}
			System.out.println("ȸ���� ����");
			int recovery = rd.nextInt(3);
			System.out.println(arrys[recovery] + "��ŭ�� ȸ������ �����̽��ϴ�.");
			if(fight.getVhp()<fight.getHp() + arrys[recovery]) {
				fight.setHp(fight.getVhp());
			}else {
				fight.setHp(fight.getHp()+arrys[recovery]);
				
			}
			System.out.println("���� hp :  ");
			System.out.println(fight.getHp());
			
		}

		public void powerup(Fight fight) {

			System.out.print("���ݺν��� ����:");
			System.out.println("���ݺν��Ϳ����� ���ݷ��� �ø����ֽ��ϴ�.");
			System.out.println("�ö󰡴¾��� +1�Դϴ�");

			fight.setAtt(fight.getAtt()+1);

		}

		public void manarecover(Fight fight) {

			Random rd = new Random();

			System.out.print("����ȸ������ ���� :");
			System.out.println("����ȸ������������ mp�� ä����ս��ϴ�");
			System.out.println("ä��� ���� �������� (+5,+3,+1) �����մϴ�");
			System.out.println("10���� �������� �������� +1�� �����մϴ�");

			int[] arrys = { 1, 3, 5 };

			if (fight.getFloorCount() > 10) {
				for (int i = 0; i < arrys.length; i++) {
					for (int j = 0; j < fight.getFloorCount() - 10; j++) {
						arrys[i] += j;

					}

				}
			}
			System.out.println("ȸ���� ����");
			int recovery = rd.nextInt(3);
			System.out.println(arrys[recovery] + "��ŭ�� ȸ������ �����̽��ϴ�.");
			if(fight.getVmp()<fight.getMp() + arrys[recovery]) {
				fight.setMp(fight.getVmp());
			}else {
				fight.setMp(fight.getMp()+arrys[recovery]);
				
			}
			System.out.println("���� mp :  ");
			System.out.println(fight.getMp());

		}

		public void maxhpup(Fight fight) {

			Random rd = new Random();

			System.out.print("�ִ�ü���������� ���� :");
			System.out.println("�ִ�ü���������������� �ִ�ü���� ������ų���ս��ϴ�");
			System.out.println("������ ���� �������� (+5,+3,+1) �����մϴ�");
			System.out.println("10���� �������� �������� +1�� �����մϴ�");

			int[] arrys = { 1, 3, 5 };

			if (fight.getFloorCount() > 10) {
				for (int i = 0; i < arrys.length; i++) {
					for (int j = 0; j < fight.getFloorCount() - 10; j++) {
						arrys[i] += j;

					}

				}
			}
			System.out.println("�ִ�ü�������� ����");
			int recovery = rd.nextInt(3);
			System.out.println(arrys[recovery] + "��ŭ�� �������� �����̽��ϴ�.");
			fight.setVhp(fight.getVhp()+arrys[recovery]);
			
			System.out.println("���� �ִ� ü�� :  ");
			System.out.println(fight.getVhp());
 

			
		}

	}