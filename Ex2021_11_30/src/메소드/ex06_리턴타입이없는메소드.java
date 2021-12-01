package 메소드;

import java.util.Scanner;

public class ex06_리턴타입이없는메소드 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String name=sc.next();

		welcome("st");

	}
	
	//메소드 생성
	//문자열 하나를 매개변수로 받아서 "~님 환영합니다."를 출력하는 로직
	//welcom 메소드
	
	public static void welcome(String name) {
		//void -> 리턴타입이 없다. 결과값을 반환하지 않는다.
	System.out.println(name+"님 환영합니다~");
	}

}
