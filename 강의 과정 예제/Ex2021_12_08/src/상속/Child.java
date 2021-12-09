package 상속;

public class Child extends Parent {
	// 자식클래스, 서브클래스, 하위클래스
	// 1.스테이크
	public void makeSteak() {
		System.out.println("스테이크를 굽는다.");
	}

	// 2. 기존의 기능을 바꿔주는 오버라이딩 알리오올리오!
	@Override //@ -> annotation
	public void makeAlio() {
		System.out.println("마늘이 듬뿍 들어간 알리오올리오");
	}
	
	
	//alt-shift-s : override/implements
//	@Override
//	public void makeGambas() {
//		super.makeGambas(); //super => 부모
//		//super(); //<<부모의 생성자 부르는
//	}


	
	
}
