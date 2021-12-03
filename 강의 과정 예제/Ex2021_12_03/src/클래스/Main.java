package 클래스;

public class Main {

	public static void main(String[] args) {
		// 실행되는 공간
		// 1.설계도면을 갖고 객체를 생성
		Person jw = new Person();
		// new -> 레퍼런스 변수 생성 키워드
		// jw은 주소값을 가진 레퍼런스 변수 <참조형 변수>
		// System.out.println(jw);
		// 레퍼런스변수가 힙을 가리키고 있다.

		jw.breathe();
		jw.name = "jw";
		System.out.println(jw.name);
		System.out.println(jw.talk());
		
		jw.gender='여';
		jw.age=25;
		
		System.out.println("성별: "+jw.gender+"\n나이: "+jw.age);
		
		
		//동일한 설계도면을 갖고 여러개의 객체생성 가능하다.
		
		//person 명훈 
		//name = 이명훈
		//age 20
		//성별 남
		
		
		Person 명훈 = new Person();
		명훈.name="이명훈";
		명훈.age=20;
		명훈.gender='남';
		
		System.out.println(명훈.name);
		System.out.println(명훈.age);
		System.out.println(명훈.gender);
		
		

	}

}
