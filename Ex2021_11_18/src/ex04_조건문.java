import java.util.Scanner;

public class ex04_���ǹ� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���̸� �Է��ϼ���");
		int age = sc.nextInt();

		if (age >= 20) {
			System.out.println("�����Դϴ�.");
			System.out.println("�̼����ڰ� �ƴմϴ�.");
		} else {
			System.out.println("�̼������Դϴ�.");
		}

		System.out.println("���α׷� ����");
	}
}
