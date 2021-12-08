package 자바페스티벌;

import java.util.Scanner;

public class ex26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫차리 0을 제외한 숫자를 입력해주세요>>");
		String num = sc.next();
		char[] numString= num.toCharArray();
		int result=0;
	
		for(int i=0; i<numString.length; i++) {
			result+=getDash(numString[i]);
		}
		
		System.out.println("대시 ('-')의 총합>>"+ result);

	}

	public static int getDash(char num) {
		int sum=0;
		
		if(num=='2'||num=='3'||num=='5') {
			sum+=5;
		}else if (num=='0'||num=='6'||num=='9') {
			sum+=6;
		}else if(num =='1') {
			sum+=2;
		}else if(num =='4') {
			sum+=4;
		}else if(num =='7') {
			sum+=3;
		}else if(num =='8') {
			sum+=7;
		}
		
		return sum;
	}

}
