import java.util.Scanner;

public class ex09 {
	public static void main(String[] args) {
		// ������ 90�� �̻� >> A�����Դϴ�.
		// ������ 90> 80< B����
		// 80> 70<> C�����Դϴ�.

		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��Ͻʽÿ�.");
		int grade = sc.nextInt();

		if (grade >= 90) {
			System.out.println("A�����Դϴ�.");
		} else if (grade >= 80) {
			System.out.println("B�����Դϴ�.");
		} else if (grade >= 70) {
			System.out.println("C�����Դϴ�.");
		} else if (grade >= 60) {
			System.out.println("D�����Դϴ�.");
		} else { //������Ű�� ���� ���� ������                    
			System.out.println("F���� �Դϴ�. ����");
		}
	}

}
