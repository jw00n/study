import java.util.Scanner;

public class ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("DB ");
		int n1 = sc.nextInt();
		System.out.print("���ڰ��� ���� ");
		int n2 = sc.nextInt();
		System.out.print("OS ");
		int n3 = sc.nextInt();
		System.out.print("��������� ");
		int n4 = sc.nextInt();
		System.out.print("����Ʈ������� ");
		int n5 = sc.nextInt();

		boolean b1 = n1 >= 8 && n2 >= 8 && n3 >= 8 && n4 >= 8 && n5 >= 8;
		boolean b2 = n1 + n2 + n3 + n4 + n5 >= 60;
		
	

//		if (n1 >= 8 && n2 >= 8 && n3 >= 8 && n4 >= 8 && n5 >= 8) {
//			String result = n1 + n2 + n3 + n4 + n5 >= 60 ? "�հ��Դϴ�." : "���հ��Դϴ�.";
//			System.out.println(result);
		
		if (b1 && b2) {
			System.out.println("�հ��Դϴ�.");
		} else {
			System.out.println(" ���հ��Դϴ�.");
		}
	}
}