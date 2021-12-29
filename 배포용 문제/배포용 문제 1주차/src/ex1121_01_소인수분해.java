import java.util.Scanner;

public class ex1121_01_소인수분해 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("소인수 분해 할 수를 입력>> ");
		int n = sc.nextInt();
		int org = n;

		System.out.print(n + "= ");

		int multi = 1;

		//N을 두 수의 곱셈으로 나타낼때, 하나의 수는 반드시 루트 N보다 값이 작다.
		//for문에서 사용할때는 sqrt라는 제곱근 함수보다 i의 제곱값이 n보다 작거나 크다라는 조건으로 대신하여 준다.
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

		//N이 1이 아니고 남아있다면 그 수는 소인수 이므로 조건문을 통해 출력해준다.
		if (n > 1) { //다 나눴음에도 더이상 나뉘지않는 맨 마지막 소수는 소인수..
			System.out.print(n);
		}

	}

}