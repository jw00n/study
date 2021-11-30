import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		int[][] arr= new int[n][n];
	
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
			arr[i][j]=(i+1)+arr.length*j;
			System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
