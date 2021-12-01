import java.util.Scanner;

public class ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hourWage = 5000;
		System.out.print("노동시간을 입력하세요: ");
		int hour = sc.nextInt();

		// hourWage*8+hourWage*1.5*(hour-8)
		// 왜 더블인가 했다 1.5가 있으니까
		double result = hour > 8 ? hourWage * (1.5 * hour - 4) : hourWage * hour;
		System.out.println("총 임금은 " + (int)result + "원 입니다.");
	}
}
