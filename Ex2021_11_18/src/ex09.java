import java.util.Scanner;

public class ex09 {
	public static void main(String[] args) {
		// 점수가 90점 이상 >> A학점입니다.
		// 점수가 90> 80< B학점
		// 80> 70<> C학점입니다.

		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하십시오.");
		int grade = sc.nextInt();

		if (grade >= 90) {
			System.out.println("A학점입니다.");
		} else if (grade >= 80) {
			System.out.println("B학점입니다.");
		} else if (grade >= 70) {
			System.out.println("C학점입니다.");
		} else if (grade >= 60) {
			System.out.println("D학점입니다.");
		} else { //충족시키지 못한 값이 있을때                    
			System.out.println("F학점 입니다. ㅎㅎ");
		}
	}

}
