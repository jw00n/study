package 상속예제_인형뽑기;

public class Mu extends Doll{
//추상클래스가 갖고있는 추상메소드를 반드시 오버라이딩해야한다.
	//-> 구현의 강제화
	@Override
	public void pick() {
		System.out.println("뮤인형이 뽑힌다.");
	}
	
	
}
