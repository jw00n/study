package �ڹ��佺Ƽ��;


import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ex���ʽ�03 {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		int[] data= new int[5];
		for(int i=0; i<5; i++) {
			System.out.print((i+1)+"��° �� �Է�>>");
			data[i]=scanner.nextInt();
		}
		
		int tmp=0;
		for(int j=0; j<4;j++) {
			for(int i=0; i<4;i++ ) {
			if(data[i]>data[i+1])
				tmp = data[i+1];
			data[i+1]=data[i];
			data[i]=tmp;
		}
		}
		System.out.println(Arrays.toString(data));
	}

}
