import java.util.Scanner;

public class ex07 {
	public static void main(String[] args) {
//��������ȯ����'
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Է�");
		int dex= sc.nextInt();
		
		int bin=0;
		for(int i=0; dex>0; i++) {
		if(dex%2==0) System.out.print("1 ");
		else System.out.print("0 ");
		
		dex/=2;
		}
	}
}
