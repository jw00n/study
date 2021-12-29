import java.util.Arrays;

public class ex1201_01_alphbet {

	public static void main(String[] args) {
		System.out.println(reverseStr("ZAbcdVefEg"));
	}

	// 대소문자 구별해서 문자열을 순서대로 반환하는 메소드를 구현하시오.
	public static String reverseStr(String str) {
		char[] dict = str.toCharArray();
		// 배열 정렬 -> A=65 Z=90 a=97 z=122

		int num = 0;
		//정렬 방식은 버블정렬 
		for (int i = 0; i < dict.length; i++) {
			num = dict[i]; //아스키 코드값을 알아내기 위해 정수형 변수에 dict[i]를 넣어준다.
			
			//i가 한번씩 반복될때마다 오른쪽 끝의 값은 점점 차므로 n-1에서 n-1-i까지만 반복하면 된다.
			for (int j = 0; j < dict.length - 1 - i; j++) {
					if (dict[j] > dict[j + 1]) {
						exchange(dict, j);
					}
				} 
		}
		
		// Arrays.sort(dict); //치트키

		String result = "";
		for (int i = 0; i < dict.length; i++) {
			result += dict[i];
		}
		return result;
	}

	public static void exchange(char[] dict, int j) {
		char tmp = dict[j];
		dict[j] = dict[j + 1];
		dict[j + 1] = tmp;
	}

}
