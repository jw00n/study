import java.util.Scanner;

public class ex12 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); //스캐너
		System.out.print("정수를 입력하세요 : "); // 정수입력을 위한 안내문
		int num= sc.nextInt(); // int 변수 num에 스캐너 생성자 sc의 nextInt()값을 대입한다.

		//string 변수 result를 생성하여 홀짝을 구분하는 삼항연산자를 사용하여 정의한다. 
		String result = num%2!=0 ? num+"는(은) 홀수입니다.": num+"는(은 ) 짝수입니다.";
		// 홀짝은 나머지가 0이 아닌지를 통해 T과 F로 구분할 수있다.
		
		System.out.println(result); //출력
		

	}
}
