import java.util.Scanner;


public class ex03 {

	public static void main(String[] args) {

//		ȸ������ �� ���̵� �ߺ�üũ ��� �����ϱ�
//		ȸ�� �ټ��� ���̵� �����س���
		String[] Ids = { "������", "�̸���", "�赿��", "������", "�����" };

//		���� ������ ���̵� �Է¹ޱ�

		Scanner sc = new Scanner(System.in);
		System.out.println("���̵� �Է� >> ");
		String input = sc.next();

//		�ߺ����̵� �ִ��� �˻�

		boolean flag = false;
		for (int i = 0; i < Ids.length; i++) {
			if (input.equals(Ids[i])) {
				flag = true;
			}
		}

		if (flag == true)
			System.out.println("�ߺ��Դϴ�.");
		else
			System.out.println("�ߺ��� �ƴմϴ�.");
	}
}
