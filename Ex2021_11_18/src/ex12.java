
import java.util.Scanner;

public class ex12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("월 입력: ");
		int m=sc.nextInt();
		
		switch (m) {
		case 12: 
		case 1:
		case 2:
			System.out.println(m+"월은 겨울입니다.");
			break;
		
		case 3:
		case 4:
		case 5:
			System.out.println(m+"월은 봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(m+"월은 여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(m+"월은 겨울입니다.");
			break;
		default: //else와 같은 기능
			System.out.println("다시 입력해주세요");
		}

	}
}
