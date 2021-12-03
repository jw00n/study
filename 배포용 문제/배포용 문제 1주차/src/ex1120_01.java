import java.util.Scanner;

public class ex1120_01 {
	public static void main(String[] args) {
		// �ִ����� &�ּҰ������ ����Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("����1 �Է�>> ");
		int n1 = sc.nextInt();
		System.out.print("����2 �Է�>> ");
		int n2 = sc.nextInt();
		
		int length= n1>n2? n2: n1;
		
		
		int gcm=1;//greatest common measure
		int lcm=1; //least common multiple

		// �ִ����� = �� �ڿ����� ���Ͽ� ����� ��� �� ���� ū �ڿ����� �ǹ��մϴ�
		// �ּҰ���� = �� ���� �ּҰ������ �� ���� ���� �������� �����ϴ� ��� �� ���� ���� ���� ���մϴ�.

		// ���μ����غ��� �ؾߵǴ°žƴѰ�?������ �������� �ٵ� ���γ��������� �� ���������� ����
		//����� �� i*i�� �ϸ� �ȵǴ°ɱ�. �װ� �ǹ��̷δ�
		for (int i = 2; i<= length; i++) {
			while (n1 % i == 0 && n2 % i == 0) { //�� ���� i�� ������ 
				n1/=i;
				n2/=i;
				gcm*=i;
			}	
		}
		
		lcm= gcm*n1*n2;
		System.out.println("�ִ����� : "+gcm);
		System.out.println("�ּҰ���� : "+lcm);

	}
}
