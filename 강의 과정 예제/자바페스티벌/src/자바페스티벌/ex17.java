package 자바페스티벌;

public class ex17 {

	public static void main(String[] args) {
		int[][]  n= new int[5][5];
		
		int start=1;
		
		for(int j=0; j<5; j++){
			for(int i=0; i<5; i++) {
				n[i][j]=start++;
			}
		}
		
		
		for (int i = 0; i < 5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(n[i][j]+"\t");
			}
				System.out.println();
		}
	}

}
