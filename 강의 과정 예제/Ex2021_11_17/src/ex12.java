import java.util.Scanner;

public class ex12 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); //��ĳ��
		System.out.print("������ �Է��ϼ��� : "); // �����Է��� ���� �ȳ���
		int num= sc.nextInt(); // int ���� num�� ��ĳ�� ������ sc�� nextInt()���� �����Ѵ�.

		//string ���� result�� �����Ͽ� Ȧ¦�� �����ϴ� ���׿����ڸ� ����Ͽ� �����Ѵ�. 
		String result = num%2!=0 ? num+"��(��) Ȧ���Դϴ�.": num+"��(�� ) ¦���Դϴ�.";
		// Ȧ¦�� �������� 0�� �ƴ����� ���� T�� F�� ������ ���ִ�.
		
		System.out.println(result); //���
		

	}
}
