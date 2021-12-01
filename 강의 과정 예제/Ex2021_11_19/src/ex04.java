import java.util.Scanner;

public class ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int out = 0;
		int i = 1;
		// 주차 별 감량 몸 무게를 입력받으세요.

		System.out.print("현재 몸무게: ");
		int present = sc.nextInt();
		System.out.print("목표 몸무게: ");
		int target = sc.nextInt();

		do {
			System.out.print(i + "주차 몸무게: ");
			out = sc.nextInt();
			present -= out;
			i++;

		} while (present > target);

		System.out.println(present + "kg 달성!! 축하합니다.");
	}
}
