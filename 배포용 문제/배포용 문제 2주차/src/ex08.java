import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int[] data= new int[5];

		for(int i=0; i<5; i++) {
			System.out.print((i+1)+"번째 수 입력: ");
			data[i]= sc.nextInt();
		}
		
		for(int i=0; i<data.length; i++) {
			for(int j=i;j<data.length; j++) {
				if(data[i]>data[j]) {
					int tmp=data[j];
					data[j]=data[i];
					data[i]=tmp;
				}
			}
		}
		
		System.out.println("정렬후 ");
		for(int i=0; i<data.length; i++) {
			if(i>0) System.out.print(" ");
			System.out.print(data[i]);
		}
		
		
	}

}
