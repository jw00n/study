package 상속예제_인형뽑기;

public class Machine {
	//인형뽑기 기계
	
	//하위클래스(어피치,옴팡이)가 상위클래스(피카츄)로 업캐스팅되어서?
	//오버라이딩되어서 어피치랑 옴팡이에서 각각 출력되는걸로 보임
	public void start(Doll d) {
		d.pick();
	}
	
	
	
	
}
