
public class ex04 {
	public static void main(String[] args) {
		int num1 = 7;
		int num2= 3;

		System.out.println("���ϱ�������? "+ (num1+num2));
		System.out.println("���� �����? "+ (num1-num2)); //������ �������� �켱������ ��������
		System.out.println("���ϱ� �������? "+ num1*num2); //������ +���� ������ �켱������ ����.
		System.out.println("������ �������? "+ num1/(double)num2); //�Ǽ��� ǥ���� ��.
		System.out.println("������ �������? "+ num1%num2);

		System.out.println();


		/*  3729���� ���� ���� 52�� �ڽ��� �������Ҷ� �� ���� �ڽ��� �ʿ��Ѱ�?*/

		int org= 3729;
		int num= 52;
		int box= 0;

		box= org/num ==0? org/num : org/num+1;

		System.out.println("�ʿ��� �ڽ��� ������"+box);

		/*
		 100�ڸ� ���ϸ� ������ �ڵ��̴�. 
		 456? 400
		 111? 100
		 */

		int num4 = 456;
		int x = 100;

		System.out.println("\n���Ȯ��: " + (num4 - num4 % x)); // ���1
		System.out.println("���Ȯ��: " + (num4 / 100 * 100)); // ���2
		
		
		/*
		 * ���� num �� �߿��� ���� �ڸ��� 1�� �ٲٴ� �ڵ带 �ۼ�
		 * ex) 456 -> 451�� �����Ұ�
		 */
		
		int num5= 789;
		
		System.out.println("�������= "+(num5/10*10+1)); //�̰� �� ���ڱ��ϳ�
		System.out.println("�������= "+(num5-num5%10+1));

		
	}
}
