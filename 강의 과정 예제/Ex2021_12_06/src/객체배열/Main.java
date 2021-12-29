package 객체배열;

public class Main {
	public static void main(String[] args) {
		// s1 김운비 20211206 80
		// s2 이명훈 20211207 50

		//Student s1 ;
		//Student s2 = new Student("이명훈", 20211207, 50);

		// 객체 배열
		Student[] student = new Student[5];
		System.out.println(student);
		System.out.println(student[0]);// 객체의 기본값은 null //String도 객체
		// 0번방에 데이터를 집어넣어보자

		student[0] = new Student("김운비", 20211206, 80);
		student[1] = new Student("이명훈", 20211207, 50);
		
		System.out.println(student[0].getName());
		System.out.println(student[1].getName());
		System.out.println(student[1].getJavaScore());
		
		

	}
}	
