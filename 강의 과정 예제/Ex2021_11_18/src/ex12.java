
import java.util.Scanner;

public class ex12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("�� �Է�: ");
		int m=sc.nextInt();
		
		switch (m) {
		case 12: 
		case 1:
		case 2:
			System.out.println(m+"���� �ܿ��Դϴ�.");
			break;
		
		case 3:
		case 4:
		case 5:
			System.out.println(m+"���� ���Դϴ�.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(m+"���� �����Դϴ�.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(m+"���� �ܿ��Դϴ�.");
			break;
		default: //else�� ���� ���
			System.out.println("�ٽ� �Է����ּ���");
		}

	}
}
