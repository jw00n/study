import java.util.Scanner;

/*
 * �ʸ� �Է¹޾�, �� �� �� ���·� ����ϼ���.
 */
public class ex07_�ú��� {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("�� �Է�: ");
		int totalSecond = sc.nextInt();
		
		int x = totalSecond/3600;
		int y = totalSecond/60-x*60; // totalSecond%3600/60
		int z= totalSecond%60; //totalSecond %3600 %60
		
		
		System.out.println(x+"�ð� "+y+"�� "+z+"�� �Դϴ�.");
	}

}
