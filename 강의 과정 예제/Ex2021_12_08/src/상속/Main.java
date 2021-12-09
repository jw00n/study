package 상속;

public class Main {
	public static void main(String[] args) {
		// 실행하는 공간

		// 1. parent p 객체
		Parent p = new Parent(); // << 생성자 <<

		// 2. child c 객체
		Child c = new Child();

		// parent
		p.makeAlio();
		p.makeGambas();
		p.makePickle();

		// child
		c.makeAlio();
		c.makeGambas();
		c.makeSteak();

		// 1. upCasting 자동형변환

		Parent p2 = new Child(); // ex) 아이폰은 스마트폰이다.
		p2.makeGambas();
		//p2.makeSteak() << 사용불가.
		p2.makeAlio(); // 하위 클래스가 상위클래스의 오버라이딩 한 경우, 하위클래스가 오버라이딩한 메소드를 사용.

		// 2. 다운 캐스팅
		//-업캐스팅된 클래스를  다시 본래 형태로 강제형변환하는 것.
		//Child c3=(Child) new Parent();
		//-> classCastException 발생 // 문법상의 오류는 없으나 실행했을대 문제사향 발생:
		//parent에는 steak()가 없어서
		
		Child c3 = (Child)p2;
		c3.makeSteak();
		
	}

}
