
public class ex01 {
	public static void main(String[] args) {

		for (int i = 2; i <= 9; i++) {
			System.out.println("==" + i + "´Ü==");
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "*" + j + "=" + j * i + "\t");
			}
			System.out.println();
		}
	}
} 
