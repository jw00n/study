import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		/*
	ȸ�������ϴ� ���α׷��� �����ʹ�!
	���̵� �ߺ�üũ ����� �����ϰ� �ʹ�
	-> ������ ���ԵǾ��ִ� id�� �߿��� ���� �Է��� id�� ���� ���� �ִ��� �˻�
		 */
		
		//���� ���̵�
		String str1="id1";
		String str2="id2";
		String str3="id3";
		String str4="id4";
		String str5="id5";
		
		//2) ���� �����ϴ� ���̵� �Է¹ޱ�
		Scanner sc= new Scanner(System.in);
		System.out.println("�����Ϸ��� ���̵� �Է����ּ���");
		String input= sc.next();//line�� ���߿� ����ȯ ����ߵǴϱ� next��
		System.out.println("���̵� Ȯ���ϼ���>> "+input);
		
		//�ߺ�üũ
		//-> 5���߿� input�̶� ���� ���� �ִٸ� �ߺ��̶�� ���
		
	
		if(str1.equals(input)||str2.equals(input)||str3.equals(input)||str4.equals(input)||str5.equals(input)) {
			System.out.println("�ߺ��Դϴ�.");
		}else System.out.println("�ƴ�.");

	}

}
