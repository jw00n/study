import java.util.Scanner;

public class ex1120_01 {
	public static void main(String[] args) {
		// 최대공약수 &최소공배수를 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1 입력>> ");
		int n1 = sc.nextInt();
		System.out.print("숫자2 입력>> ");
		int n2 = sc.nextInt();

		// 최대 횟수는 입력받은 숫자 중 작은 숫자까지만 반복될것이다.
		int length = n1 > n2 ? n2 : n1;

		int gcm = 1;// greatest common measure
		int lcm = 1; // least common multiple

		// 최대공약수 = 두 자연수에 대하여 공통된 약수 중 가장 큰 자연수를 의미합니다
		// 최소공배수 = 두 수의 최소공배수는 두 수에 서로 공통으로 존재하는 배수 중 가장 작은 수를 뜻합니다.

		for (int i = 2; i <= length; i++) {
			System.out.println("길이 ="+length);
			while (n1 % i == 0 && n2 % i == 0) { // 두 수가 i로 나뉠때 //소인수분해 방식으로
				n1 /= i;
				n2 /= i;
				gcm *= i;
			}
			length = n1 > n2 ? n2 : n1; //반복횟수를 최대한 줄이기 위해
		}

		lcm = gcm * n1 * n2;
		System.out.println("최대공약수 : " + gcm);
		System.out.println("최소공배수 : " + lcm);

	}
}
