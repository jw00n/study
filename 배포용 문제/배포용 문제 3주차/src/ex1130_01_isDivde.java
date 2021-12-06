
public class ex1130_01_isDivde {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		boolean result = isDivisor(num1, num2);

		System.out.println("결과확인 : "+result);
	}

	public static boolean isDivisor(int num1, int num2) {
		boolean result = false;

		if (num1 % num2 == 0)
			return result=true;
		else 
			return result;
	}

}
