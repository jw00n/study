import java.util.Scanner;

public class ex1121_01_소인수분해 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("소인수 분해 할 수를 입력>> ");
		int n = sc.nextInt();
		int org = n;

		System.out.print(n + "= ");

		int multi = 1;

		// 일단 i는 소인수라는 전제로 n을 소인수분해 해간다.
		// 그러므로 n은 소인수의 제곱보다 클 수 없으므로 i의 제곱이 n보다 크거나 같다.
		for (int i = 2; i * i <= n; i++) {

			while (n % i == 0) { // 입력받은 수가 i로 나뉠때까지 나눈다.

				multi *= i; // 출력 확인용
				n /= i;// 소인수분해 중 /i가 소인수라는 전제를 충족시켜주기위해 반복문으로 나누어준다.

				// * 출력문
				if (multi == org) {
					System.out.print(i);
				} else {
					System.out.print(i + "*");
				}
			}
		}

		if (n > 1) { //다 나눴음에도 더이상 나뉘지않는 맨 마지막 소수는 소인수..
			System.out.print("여기" + n);
		}

	}

}