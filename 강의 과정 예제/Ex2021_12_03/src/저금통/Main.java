package ������;

//�������
public class Main {

	public static void main(String[] args) {
		//1. bank ��ü����
		BankBook bank= new BankBook("����",7000);
		
		//2. ���� �̸� �ֱ�
		
		//3. �ܾ׿� 7000���� �־��ּ�
		bank.deposit(7000);
		//������ ���� �����ϴ� ��� ���x
		//4. �ܾ��� ���
		bank.showMoney();
		
		//5.bank��ü �ܾ׿��� 2000�� ���
		bank.wihtdraw(2000);
		//6.�ܾ� ��� 5000
		bank.showMoney();
		
	}

}
