import java.util.Scanner;

//키보드로 입력받기

public class ex06_scan {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		//권고, 차라리 nextline으로 다 받고 줄마다 형변환 시키는게 나을지도 Integer.parseInt()같은.
		
		
		// 두 정수를 입력받아서 두 수의 더하기, 빼기, 곱하기, 나누기 , 나머지 결과값을 출력할것
		System.out.print("1번째 정수를 입력하세요. ");
		int n1= sc.nextInt();
		
		System.out.print("2번째 정수를 입력하세요. ");
		int n2= sc.nextInt();
		
		
		System.out.println("두 수의 더하기: "+(n1/n2));
		System.out.println("두 수의 빼기: "+Math.abs(n1-n2));
		System.out.println("두 수의 곱하기: "+n1*n2);
		System.out.println("두 수의 나누기: "+(n1/(double)n2));
		System.out.println("두 수의 나머지: "+n1%n2);
		
	

	}
}
