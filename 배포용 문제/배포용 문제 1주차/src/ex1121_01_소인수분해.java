import java.util.Scanner;

public class ex1121_01_소인수분해 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("소인수 분해 할 수를 입력>> ");
		int n = sc.nextInt();
		int org = n;

		//여기서 굳이 배열을 쓸 필요는 없어보임.

		System.out.print(n + "= ");

		int multi = 1;
		for (int i = 2; i * i <= n; i++) {
			while (n % i == 0) { // 입력받은 수가 i로 나뉠때

				multi *= i; //출력 확인용
				n /= i;//소인수분해 중
				
				//* 출력문
				if (multi == org) {
					System.out.print(i);
				} else {
					System.out.print(i + "*"); 
				}
			}
		}

		if (n > 1) { //더이상 나뉘지않는  맨 마지막 소수
			System.out.print(n);
		}

	}
}
