import java.util.Random;

public class ex03 {
 public static void main(String[] args) {
	int[] arr= new int[8];
	Random random= new Random();
	System.out.print("배열에 있는 모든값: ");
	for(int i=0; i<arr.length; i++) {
		arr[i]= random.nextInt(100)+1;
		System.out.print(arr[i]+" ");
		
	}
	//비교군 - 초기화는 가장 첫번째 것으로 
	int max=arr[0]; 
	int min=arr[0];
	
	//비교는 최대,최대를 둘다 해야하는 상황이 있을수있으므로 if문 두 개
	for(int i=0; i<arr.length; i++) {
		if(arr[i]>max) max=arr[i];
		if(arr[i]<min) min=arr[i];
	}
	
	System.out.println("\n가장 큰값: "+max+"\n가장 작은값: "+min);
	 
}
}
