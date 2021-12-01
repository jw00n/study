import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// 초기화 구문, 검사조건, 반복 후 작업
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}

		for (int i = 100; i > 0; i--) {
			System.out.println(i);
		}

		System.out.println("========3번========");
		for (int i = 10; i <= 60; i += 2) {
			
			//if(i%2==0)
			if (i < 11)
				i += 1;
			System.out.println(i);
		}
		
		
		

	}

}
