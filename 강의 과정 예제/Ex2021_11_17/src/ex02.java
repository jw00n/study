/*
 한줄 선택 Home, Shift + End. 마우스 3번 클릭
한줄 이동 Alt + (↑,↓)
한줄 복사 Alt + Ctrl + (↑,↓)
한줄 삭제 Ctrl + D
 */



public class ex02 {
	public static void main(String[] args) {

		//		 논리 1개
		boolean state= true;
		System.out.println(state);
		//		정수(문자) 5개
		char c ='A'; //character 
		System.out.println(c);

		byte b = 127; 
		short sh=32767;
		int i=2147483647;
		long l=22;

		//		실수 2개
		float f= 15.7f;
		double d=20.5;
		System.out.println(f+"\n"+d);


		int num1= 15;
		long num3 = num1; //long <- int (가능)
		//num1= num3; int <- long  (불가능)

		double num2= (double)num1;
		num1=(int)d; //강제형변환

		System.out.println(num1+"\n"+num2);

		int maxValue=Integer.MAX_VALUE;
		System.out.println(maxValue);

		byte bmv= Byte.MAX_VALUE;
		System.out.println(bmv);

		/*
		  Integer.MAX_VALUE;
		  Short.MAX_VALUE;
		 * 
		 */

		double num4 = num1; //자동형변환
		System.out.println("num4="+num4);
	
		int num5= (int)num4; // double -> int (강제형변환)
		
		int num6= 22; //4byte
		float num7= num6; //4byte 같은 크기라 가능?
		System.out.println(num7);
		
		int num8= (int)num7; //!!같은 크기라도 안됨. 데이터 손실이 일어날수있기때문.
		
		

	}
}
