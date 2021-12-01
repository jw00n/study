
public class ex04 {
	public static void main(String[] args) {
		int num1 = 7;
		int num2= 3;

		System.out.println("더하기결과값은? "+ (num1+num2));
		System.out.println("뺄셈 결과는? "+ (num1-num2)); //뺄셈은 덧셈보다 우선순위가 낮나봐용
		System.out.println("곱하기 결과값은? "+ num1*num2); //곱셈이 +보다 연산자 우선수위가 높음.
		System.out.println("나누기 결과값은? "+ num1/(double)num2); //실수로 표현할 것.
		System.out.println("나머지 결과값은? "+ num1%num2);

		System.out.println();


		/*  3729개의 귤을 단위 52개 박스에 담으려할때 몇 개의 박스가 필요한가?*/

		int org= 3729;
		int num= 52;
		int box= 0;

		box= org/num ==0? org/num : org/num+1;

		System.out.println("필요한 박스의 개수는"+box);

		/*
		 100자리 이하를 버리는 코드이다. 
		 456? 400
		 111? 100
		 */

		int num4 = 456;
		int x = 100;

		System.out.println("\n결과확인: " + (num4 - num4 % x)); // 방법1
		System.out.println("결과확인: " + (num4 / 100 * 100)); // 방법2
		
		
		/*
		 * 변수 num 값 중에서 일의 자리를 1로 바꾸는 코드를 작성
		 * ex) 456 -> 451로 변경할것
		 */
		
		int num5= 789;
		
		System.out.println("결과값은= "+(num5/10*10+1)); //이게 더 예쁘긴하넹
		System.out.println("결과값은= "+(num5-num5%10+1));

		
	}
}
