package 메소드;

import java.util.Scanner;



public class ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 1>>  ");
		int a = sc.nextInt();
		System.out.print("숫자 2>>  ");
		int b = sc.nextInt();


		int result = minus(a, b);
		System.out.println(result);

	}

	// 메소드 생성
	// classs 안쪽, main 바깥쪽에 메소드 생성
	// 접근 제한자 리턴타입 메소드 이름(){return 결과값}

	// 2개의 정수형 매개변수를 받아서 뺀 결과값을 되돌려주는 minus 메소드 생성
	public static int minus(int a, int b) {
		int result = 0; // 초기화를 해주는게 편하당
		result = a - b; // 로직 수행하기

		return result; // 반환
	}
}
