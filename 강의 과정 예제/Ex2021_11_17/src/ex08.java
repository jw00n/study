
public class ex08 {

	public static void main(String[] args) {

		int num = 29;//대입연산자
		num -= 2+3*4; //num= 29-(2+3*4) += 복합대입연산자 -> 맨 마지막에 한가보네 난 원래 이런거못하더라~ㅋㅋ전위 후위 중위연산자
		System.out.println(num);
		
		// 연산자 우선순위 
		// http://tcpschool.com/codingmath/priority
		
		int a= 0;
		a++;
		++a;
		
		System.out.println(a);
		
	}
}
