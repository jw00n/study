package ���;

public class Main {
	public static void main(String[] args) {
		// �����ϴ� ����

		// 1. parent p ��ü
		Parent p = new Parent(); // << ������ <<

		// 2. child c ��ü
		Child c = new Child();

		// parent
		p.makeAlio();
		p.makeGambas();
		p.makePickle();

		// child
		c.makeAlio();
		c.makeGambas();
		c.makeSteak();

		// 1. upCasting �ڵ�����ȯ

		Parent p2 = new Child(); // ex) �������� ����Ʈ���̴�.
		p2.makeGambas();
		//p2.makeSteak() << ���Ұ�.
		p2.makeAlio(); // ���� Ŭ������ ����Ŭ������ �������̵� �� ���, ����Ŭ������ �������̵��� �޼ҵ带 ���.

		// 2. �ٿ� ĳ����
		//-��ĳ���õ� Ŭ������  �ٽ� ���� ���·� ��������ȯ�ϴ� ��.
		//Child c3=(Child) new Parent();
		//-> classCastException �߻� // �������� ������ ������ ���������� �������� �߻�:
		//parent���� steak()�� ���
		
		Child c3 = (Child)p2;
		c3.makeSteak();
		
	}

}
