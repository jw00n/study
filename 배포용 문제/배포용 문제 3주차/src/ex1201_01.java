import java.util.Arrays;

public class ex1201_01 {

	public static void main(String[] args) {
		System.out.println(reverseStr("ZAbcdVefEg"));
	}

	// 대소문자 구별해서 문자열을 순서대로 반환하는 메소드를 구현하시오.
	public static String reverseStr(String str) {
		char[] dict = str.toCharArray();
		// 배열 정렬 -> A=65 Z=90 a=97 z=122

		int num = 0;

		for (int i = 0; i < dict.length; i++) {
			num = dict[i];
			for (int j = 0; j < dict.length - 1 - i; j++) {
				char tmp;
				if (num >= 65 && num <= 90) { // 대문자
					if (dict[j] > dict[j + 1]) {
						exchange(dict, j);
					}
				} else { // 소문자
					if (dict[j] > dict[j + 1]) {
						exchange(dict, j);
					}
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
