import java.util.Scanner;

public class ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("2- ���� �Է��Ͻʽÿ�. : ");
		String str = sc.nextLine();
		
		String[] arr = str.split("��");
		System.out.println(arr[0]);
		
	}
}


