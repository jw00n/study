import java.util.Random;
import java.util.Scanner;


public class ch3_op {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int ans = random.nextInt(1000);// 0~99
		System.out.println("수를 결정하였습니다. 맞추어보세요 >>");
		String str;
		boolean flag = true;

		while (flag) {
			int x = sc.nextInt();

			if (x == ans) { // 정답을 맞춘 경우
				System.out.println("맞췄습니다.");
				System.out.println("다시 하시겠습니까? Y/N");
				str = sc.next();

				if (str.equals("Y")) { // 다시 하겠다에 Y를 답한 경우
					ans = random.nextInt(100);// 0~99을 새로 부여하고
					System.out.println("수를 결정하였습니다. 맞추어보세요 >>");
					continue;// 재시작
				} else
					flag = false; // N을 입력했을때 flag를 false값을 부여하여 while문을 벗어나게 한다.

			} else if (x > ans) { // 입력한 숫자가 정답보다 더 큰 경우
				System.out.println("더 낮게");
				continue; // 다음 반복
			} else { // 입력한 숫자가 정답보다 더 낮은 경우
				System.out.println("더 높게");
				continue; // 다음 반복
			}

		}

		System.out.println("게임 종료");
		System.exit(0);

	}
}

/*
 * 0~99 임의의 수를 입력받아 카드의 숫자와 일치하는 지 보시오. 낮다면 더 낮게 높다면 더 높게 범위를 좁혀가는 업다운 게임
 * 
 * 게임을 반복하려면 y/n을 묻고 n인 경우 종료된다.
 * 
 * 
 */