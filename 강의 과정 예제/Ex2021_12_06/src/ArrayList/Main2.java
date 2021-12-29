package ArrayList;

import java.util.ArrayList;

import 객체배열.Student;

public class Main2 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student("오정운", 20211206, 50));
		list.add(new Student("노미란", 20211205, 60));
		list.add(new Student("양정환", 20211202, 40));
		list.add(new Student("김도현", 20211201, 70));
		list.add(new Student("양민준", 20211204, 80));
		
		
		//System.out.println( list.size());
		
	//	System.out.println(list.get(2).getName());
		
		//list안에 있는 모든 이름, 모든 학번, 모든 점수를 출력 
		//이름 학번 점수
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i).getName()+"\t");
			System.out.print(list.get(i).getNumber()+"\t");
			System.out.println(list.get(i).getJavaScore()+"\t");
		}

	}
}
