package Ŭ����;

public class Main {

	public static void main(String[] args) {
		// ����Ǵ� ����
		// 1.���赵���� ���� ��ü�� ����
		Person jw = new Person();
		// new -> ���۷��� ���� ���� Ű����
		// jw�� �ּҰ��� ���� ���۷��� ���� <������ ����>
		// System.out.println(jw);
		// ���۷��������� ���� ����Ű�� �ִ�.

		jw.breathe();
		jw.name = "jw";
		System.out.println(jw.name);
		System.out.println(jw.talk());
		
		jw.gender='��';
		jw.age=25;
		
		System.out.println("����: "+jw.gender+"\n����: "+jw.age);
		
		
		//������ ���赵���� ���� �������� ��ü���� �����ϴ�.
		
		//person ���� 
		//name = �̸���
		//age 20
		//���� ��
		
		
		Person ���� = new Person();
		����.name="�̸���";
		����.age=20;
		����.gender='��';
		
		System.out.println(����.name);
		System.out.println(����.age);
		System.out.println(����.gender);
		
		

	}

}
