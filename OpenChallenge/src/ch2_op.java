import java.util.Scanner;

//���� ç���� ch2 ���������� ���� ���� �̰���� ����Ͻÿ�.
public class ch2_op {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������������ �Է��ϼ���");

		System.out.print("����>>");
		String str1 = sc.next();
		System.out.print("ö��>>");
		String str2 = sc.next();

		// ������������ ���� �����Ұ��̳�? ����>�� /����>���� / ��> ����
		// ���۹���� ���� �ֳ�~ Ŭ���� ���� �ļ�? ������?

		// �ڹ� ��Ʈ���� ==�� �ƴ϶� equals()�� ����ؾ���
		if (str1.equals(str2)) {
			System.out.println("�����ϴ�.");
		}

		if (str1.equals("����")) {
			if (str2.equals("����")) {
				System.out.println("ö���� �̰���ϴ�.");
			}
			else if(str2.equals("��")) {
				System.out.println("���� �̰���ϴ�.");
			}
		}
		if (str1.equals("����")) {
			if (str2.equals("��")) {
				System.out.println("ö���� �̰���ϴ�.");
			}
			else if(str2.equals("����")) {
				System.out.println("���� �̰���ϴ�.");
			}
		}
		if (str1.equals("��")) {
			if (str2.equals("����")) {
				System.out.println("ö���� �̰���ϴ�.");
			}
			else if(str2.equals("����")) {
				System.out.println("���� �̰���ϴ�.");
			}
		}
	}
}