import java.util.Scanner;

public class ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		String obj[] = { "DB", "���ڰ��� ����", "OS", "���������", "����Ʈ�������" };
		int[] score = new int[obj.length];
		int total = 0;
		
		
		for (int i = 0; i < 5; i++) {
			System.out.print(obj[i] + " : ");
			score[i] = sc.nextInt();
		}

		
		for (int i = 0; i < score.length; i++) {
			if (score[i] > 7) { // 8���� �̻� �������
				total += score[i];
				if (total >= 60) {
					System.out.println("�հ��Դϴ�.case1");// ���� �־������?
					break;
				} else {
					System.out.println("���հ��Դϴ� case2");
					break;
				}
			} else { // 7������ �������
				System.out.println("���հ��Դϴ�. case3");
				break;
			}
		}

	}

}