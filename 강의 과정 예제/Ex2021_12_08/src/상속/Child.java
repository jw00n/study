package ���;

public class Child extends Parent {
	// �ڽ�Ŭ����, ����Ŭ����, ����Ŭ����
	// 1.������ũ
	public void makeSteak() {
		System.out.println("������ũ�� ���´�.");
	}

	// 2. ������ ����� �ٲ��ִ� �������̵� �˸����ø���!
	@Override //@ -> annotation
	public void makeAlio() {
		System.out.println("������ ��� �� �˸����ø���");
	}
	
	
	//alt-shift-s : override/implements
//	@Override
//	public void makeGambas() {
//		super.makeGambas(); //super => �θ�
//		//super(); //<<�θ��� ������ �θ���
//	}


	
	
}
