package ��ü�迭;

public class Main {
	public static void main(String[] args) {
		// s1 ���� 20211206 80
		// s2 �̸��� 20211207 50

		//Student s1 ;
		//Student s2 = new Student("�̸���", 20211207, 50);

		// ��ü �迭
		Student[] student = new Student[5];
		System.out.println(student);
		System.out.println(student[0]);// ��ü�� �⺻���� null //String�� ��ü
		// 0���濡 �����͸� ����־��

		student[0] = new Student("����", 20211206, 80);
		student[1] = new Student("�̸���", 20211207, 50);
		
		System.out.println(student[0].getName());
		System.out.println(student[1].getName());
		System.out.println(student[1].getJavaScore());
		
		

	}
}	
