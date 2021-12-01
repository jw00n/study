
public class ex03 {
	public static void main(String[] args) {

		// +,-, *,/,%

		int num1= 10;
		int num2= 7;
		
		float num3= 10.0f;
		float num4= 7.0f;
		
		System.out.println(num1/num2);
		System.out.println(num1%num2);

		System.out.println(num3/num4);
		System.out.println(num1/num4); // int형/float형 = 실수형으로 자동형변환

		//두 결과는 다릅니다.
		System.out.println((float)(num1/num2));
		System.out.println(num1/(float)num2);
		
		String num5="10";
		//자바는 너무 공부한지 오래됏다
		
		System.out.println(num5);
		
		String num7=Integer.toString(num1);
		System.out.println("num7="+num7);
		
		String str1= "13545";
		int to = Integer.parseInt(str1);
		System.out.println("to="+to);

		String a= 10+7+""+9;
		String b= 8+""+2;
		String c=""+5+2;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		String cde = "cde";
		String d= cde.substring(0,2);
		System.out.println(d);

		
	}

}
