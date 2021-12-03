import java.util.Scanner;

public class ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N 입력 >>");
		int N = sc.nextInt();//n개의 숫자를 입력받는다.
		System.out.print("X 입력 >>");
		int X = sc.nextInt();//기준
		
		int[] data= new int[N];
		
		for(int i=0; i<N; i++) {
			System.out.print((i+1)+"번째 정수 입력>> ");
			data[i]=sc.nextInt();
		}
		
		System.out.print("결과 >> ");
		for(int i=0; i<data.length; i++) {
			if(data[i]<X) {
				System.out.print(data[i]+" ");
			}
		}
		
	}
}
