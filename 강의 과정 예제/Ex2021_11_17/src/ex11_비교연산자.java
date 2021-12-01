
public class ex11_비교연산자 {
	public static void main(String[] args) {
		boolean a=true; 
		boolean b=false;
		System.out.println(a==b);
		System.out.println(a!=b);
		//결과값 boolean true/false \\xor 같으면 false 다르면 true //eor
		System.out.println(a^b);

		/*
		  <삼항 연산자>
		   조건문 ? 실행문1 : 실행문2
		  			T	  F
		 */
		
		int i=3;
		int j=10;
		
		System.out.println(i!=j ? "같다" : "다르다");
		
		
	}
}
//1 1 1
//0 1 0
//1   1
//0 0 0 학교서점에서 삿군  && || !