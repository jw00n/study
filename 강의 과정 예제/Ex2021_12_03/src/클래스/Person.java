package 클래스;

//설계
public class Person {
	//클래스 == 설계도면 == 객체를 생성하기 전 우리가 직접 설계하는 도면
	//1. Field(데이터, 속성)
	String name;
	char gender;
	int age;
	
	//2. Method(로직, 기능, 행위)
	//숨쉬기
	public void breathe() {
		System.out.println("호흡 중");
	}
	
	//말하기
	public String talk() {
		return "말하는 중";
	}

}
