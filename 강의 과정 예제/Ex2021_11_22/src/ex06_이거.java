import java.util.Scanner;

public class ex06_이거 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("========4번========");
//		System.out.println("정수를 입력하세요");
//		int x = sc.nextInt();
//		for (int i = 1; i <= x; i++) {
//			System.out.println(i);
//		}
//
//		System.out.println("========5번========");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int tmp = a > b ? a : b;
//		int tmp2 = a < b ? a : b;
//
//		for (int i = tmp2; i <= tmp; i++) {
//			System.out.println(i);
//		}
//
//		System.out.println("========6번========");
//		
//		int sum = 0;
//		for (int i = 0; i <= 100; i+=3) { //쓸데없는 if문 쓰는것보다 이게 낫네
//				sum += i;
//		}
//		System.out.println("3의 배수합= " + sum);
//
//		System.out.println("========7번========");
//		//2*1=2 2*2=4 ...2*9=18
//		System.out.println("구구단");
//		int mul = 2;
//		for (int i = 1; i <= 9; i++) {
//			System.out.println("2*"+i+"="+i * mul);
//		}
		


		System.out.println("========8번========");
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j+"*"+i+"="+i * j+"\t");
			}
			System.out.println();
		}
	}
}
