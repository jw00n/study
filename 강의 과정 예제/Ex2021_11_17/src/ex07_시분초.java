import java.util.Scanner;

/*
 * 초를 입력받아, 시 분 초 형태로 출력하세요.
 */
public class ex07_시분초 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("초 입력: ");
		int totalSecond = sc.nextInt();
		
		int x = totalSecond/3600;
		int y = totalSecond/60-x*60; // totalSecond%3600/60
		int z= totalSecond%60; //totalSecond %3600 %60
		
		
		System.out.println(x+"시간 "+y+"분 "+z+"초 입니다.");
	}

}
