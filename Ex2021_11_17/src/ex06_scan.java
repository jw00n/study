import java.util.Scanner;

//Ű����� �Է¹ޱ�

public class ex06_scan {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		//�ǰ�, ���� nextline���� �� �ް� �ٸ��� ����ȯ ��Ű�°� �������� Integer.parseInt()����.
		
		
		// �� ������ �Է¹޾Ƽ� �� ���� ���ϱ�, ����, ���ϱ�, ������ , ������ ������� ����Ұ�
		System.out.print("1��° ������ �Է��ϼ���. ");
		int n1= sc.nextInt();
		
		System.out.print("2��° ������ �Է��ϼ���. ");
		int n2= sc.nextInt();
		
		
		System.out.println("�� ���� ���ϱ�: "+(n1/n2));
		System.out.println("�� ���� ����: "+Math.abs(n1-n2));
		System.out.println("�� ���� ���ϱ�: "+n1*n2);
		System.out.println("�� ���� ������: "+(n1/(double)n2));
		System.out.println("�� ���� ������: "+n1%n2);
		
	

	}
}
