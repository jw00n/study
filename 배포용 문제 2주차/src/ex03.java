import java.util.Random;

public class ex03 {
 public static void main(String[] args) {
	int[] arr= new int[8];
	Random random= new Random();
	System.out.print("�迭�� �ִ� ��簪: ");
	for(int i=0; i<arr.length; i++) {
		arr[i]= random.nextInt(100)+1;
		System.out.print(arr[i]+" ");
		
	}
	
	int max=arr[0];
	int min=arr[0];
	
	for(int i=0; i<arr.length; i++) {
		if(arr[i]>max) max=arr[i];
		if(arr[i]<min) min=arr[i];
	}
	
	System.out.println("\n���� ū��: "+max+"\n���� ������: "+min);
	 
}
}
