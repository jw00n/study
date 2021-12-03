package 메소드;


public class ex08_계산기 {

	/*
	 * op를 선언해 원하는 연산자로 초기화 하세요. 연산자에 맞게 연산한 최종값을 반환해주는 cal메소드를 작성하세요.
	char op = sc.next().charAt(0);
	 */
	public static void main(String[] args) {
		int num1=50;
		int num2 = 15;
		char op ='-';

		System.out.println(cal(num1, num2, op));

	}

	// 1. 매개변수를 받아온 op에 따라서 계산

	// 2. num1+num2 를 더한값을 result에 담아주세용ㅇ

	// 3. op - 라면 값의 차이를 result에 담아줏요
	// 큰수에서 작은수를 구별해서 결과값을 result에 담아주세요
	// 5. op가

	public static int cal(int num1, int num2, char op) {
		int result = 0;

		switch (op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 > num2 ? num1 - num2 : num2 - num1;
			break;
		case '*':
			result= num1*num2;
			break;
		case '/':
			result =num1/num2;
			break;
		default :
			//예외사항 결집
		}
		

		return result;
	}
}
