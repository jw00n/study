package 자바페스티벌;

import java.util.Calendar;

public class ex보너스05 {

	public static void main(String[] args) {
		
		int num1= 50;
		int num2 =15;
		char op= '*';
		
		System.out.println(cal(num1, num2, op));
	}

	public static int cal(int num1, int num2, char op) {
		int result = 0;
		
		switch (op) {
		case '+':
			result= num1+num2;
			
			break;
		case '-':
			result= num1>num2? num1-num2 : num2- num1;
			break;
		case '*':
			result= num1*num2;
			break;
		case '/':
			result = num1/num2;
			break;

		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
		
		
		return result;
	}

}
