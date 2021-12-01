import java.util.Scanner;

public class ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		String obj[] = { "DB", "전자계산기 구조", "OS", "데이터통신", "소프트웨어공학" };
		int[] score = new int[obj.length];
		int total = 0;
		
		
		for (int i = 0; i < 5; i++) {
			System.out.print(obj[i] + " : ");
			score[i] = sc.nextInt();
		}

		
		for (int i = 0; i < score.length; i++) {
			if (score[i] > 7) { // 8문제 이상 맞을경우
				total += score[i];
				if (total >= 60) {
					System.out.println("합격입니다.case1");// 어디다 넣어야하지?
					break;
				} else {
					System.out.println("불합격입니다 case2");
					break;
				}
			} else { // 7문제만 맞은경우
				System.out.println("불합격입니다. case3");
				break;
			}
		}

	}

}