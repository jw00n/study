package ArrayList;

import java.util.ArrayList;

import ��ü�迭.Student;

public class Main2 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student("������", 20211206, 50));
		list.add(new Student("��̶�", 20211205, 60));
		list.add(new Student("����ȯ", 20211202, 40));
		list.add(new Student("�赵��", 20211201, 70));
		list.add(new Student("�����", 20211204, 80));
		
		
		//System.out.println( list.size());
		
	//	System.out.println(list.get(2).getName());
		
		//list�ȿ� �ִ� ��� �̸�, ��� �й�, ��� ������ ��� 
		//�̸� �й� ����
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i).getName()+"\t");
			System.out.print(list.get(i).getNumber()+"\t");
			System.out.println(list.get(i).getJavaScore()+"\t");
		}

	}
}
