import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("농구공의 개수를 입력하세요: ");
		int all = sc.nextInt(); // 모든 농구공의 개수를 입력받는다.
		int box = 5; // 한 박스에 들어갈 수있는 공의 수

		// 변수 result에 농구공의 개수가 박스의 단위로 나뉘는지 확인하고 나머지가 있다면 +1 한다.
		int result = all % box == 0 ? all / box : all / box + 1;
		System.out.println("필요한 상자의 수: " + result);// 출력

	}
}
