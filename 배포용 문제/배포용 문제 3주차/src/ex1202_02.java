import java.util.Scanner;

public class ex1202_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫차리 0을 제와한 숫자를 입력해주세요>>");
		String str = sc.next();
		char[] num = str.toCharArray();
		int sum=0;
		// 대시는 총 7개
		for (int i = 0; i < num.length; i++) {
			sum+=checkdash(num[i]);
		}
		
		System.out.println("대시('-')의 총 합 >> "+sum);
	}

	public static int checkdash(char num) {
		int count=0;
		
		switch (Character.getNumericValue(num)) {
		case 0: case 6: case 9:
			return count =6;
			
			
		case 2: case 3: case 5:
			return 	count =5;
			
		
		case 1: 
			return 	count =2;
			
		case 4: 
			return 	count =4;
			
		case 7: 
			return count =3;
			
		case 8: 
			return 	count =7;
			
	
		}
		return count;
		
	
	}

}
