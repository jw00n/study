import java.util.Scanner;

public class ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N �Է� >>");
		int N = sc.nextInt();//n���� ���ڸ� �Է¹޴´�.
		System.out.print("X �Է� >>");
		int X = sc.nextInt();//����
		
		int[] data= new int[N];
		
		for(int i=0; i<N; i++) {
			System.out.print((i+1)+"��° ���� �Է�>> ");
			data[i]=sc.nextInt();
		}
		
		System.out.print("��� >> ");
		for(int i=0; i<data.length; i++) {
			if(data[i]<X) {
				System.out.print(data[i]+" ");
			}
		}
		
	}
}
