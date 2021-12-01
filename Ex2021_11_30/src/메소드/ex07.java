package 메소드;

public class ex07 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		int result = lagerNumbers(num1, num2);

		System.out.println("큰 수 확인: " + result);

	}

	private static int lagerNumbers(int num1, int num2) {
		//int result = 0; // 결과값을 담아줄 공간

		// 1.num1과 num2중 누가 더 큰지 비교
		// 2. 더 큰 수를 result에 담아주기
		// 3. 단, 두 수가 같다면 result 0이라는 숫자를 담아주기

		
		if (num1 > num2) {
			return num1;
		} else if (num1 < num2) {
			return  num2;
		} else return 0;
			// 같으면 굳이 변경을 해줄필요는 없으니 else 생략해도
		

		//return result;
	}

}
