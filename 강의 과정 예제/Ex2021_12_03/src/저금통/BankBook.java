package ������;

/*���赵��
 1. Field(�Ӽ�)
 	�̸� name
 	�ܾ� money
 
 2. ���
 	�Ա��ϴ� ��� deposit
 	- �Ű����� ������ ������
 	- ����Ÿ�� x
 	
 	����ϴ� ��� withdraw
 	- �Ű����� ������ ������
 	- ����Ÿ���� ����
 	
 	�ܾ� ǥ�� showMoney
 	- �Ű����� ����
 	- ����Ÿ��  X
 */


public class BankBook {
	
	
	private String name;
	private int money; //ĸ��ȭ(��������)
	
	
	//��ü�� �����Ҷ� field�� �ִ� ������ �ʱ�ȭ ������ �޼ҵ� ����
	//������ constructor
	
	public BankBook(String name, int money) {
		this.name= name;
		this.money= money;
	}
	
	//������ �����ε�
	//�⺻ ������
	/*
	public BankBook() {
		//Ŭ���� ���赵�鿡 ��� �����ڵ� ������, ���������ϴ�.
		//���Ӱ� �����ϴ� �����ڰ� ������ ��쿡�� ���������.
	}
	 */
	public void deposit(int money) {
		//money+=money;
		this.money+=money;
		//this -> ���� ������ Ŭ������ ��Ī�Ѵ�.
	}

	public void wihtdraw(int money) {
		this.money-=money;
	}
	
	public void showMoney() {
		System.out.println("�ܾ� : "+money);
	}
	

	
}
