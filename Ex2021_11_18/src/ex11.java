import java.util.Scanner;

public class ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("2- 월을 입력하십시오. : ");
		String str = sc.nextLine();
		
		String[] arr = str.split("월");
		System.out.println(arr[0]);
		
	}
}


