import java.util.Scanner;

public class ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hourWage = 5000;
		System.out.print("�뵿�ð��� �Է��ϼ���: ");
		int hour = sc.nextInt();

		// hourWage*8+hourWage*1.5*(hour-8)
		// �� �����ΰ� �ߴ� 1.5�� �����ϱ�
		double result = hour > 8 ? hourWage * (1.5 * hour - 4) : hourWage * hour;
		System.out.println("�� �ӱ��� " + (int)result + "�� �Դϴ�.");
	}
}
