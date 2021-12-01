import java.util.Scanner;

public class ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("DB ");
		int n1 = sc.nextInt();
		System.out.print("전자계산기 구조 ");
		int n2 = sc.nextInt();
		System.out.print("OS ");
		int n3 = sc.nextInt();
		System.out.print("데이터통신 ");
		int n4 = sc.nextInt();
		System.out.print("소프트웨어공학 ");
		int n5 = sc.nextInt();

		boolean b1 = n1 >= 8 && n2 >= 8 && n3 >= 8 && n4 >= 8 && n5 >= 8;
		boolean b2 = n1 + n2 + n3 + n4 + n5 >= 60;
		
	

//		if (n1 >= 8 && n2 >= 8 && n3 >= 8 && n4 >= 8 && n5 >= 8) {
//			String result = n1 + n2 + n3 + n4 + n5 >= 60 ? "합격입니다." : "불합격입니다.";
//			System.out.println(result);
		
		if (b1 && b2) {
			System.out.println("합격입니다.");
		} else {
			System.out.println(" 불합격입니다.");
		}
	}
}