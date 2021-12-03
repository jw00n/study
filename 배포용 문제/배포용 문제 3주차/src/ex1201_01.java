import java.util.Arrays;

public class ex1201_01 {

	public static void main(String[] args) {
		System.out.println(reverseStr("ZAbcdVefEg"));
	}

	// ��ҹ��� �����ؼ� ���ڿ��� ������� ��ȯ�ϴ� �޼ҵ带 �����Ͻÿ�.
	public static String reverseStr(String str) {
		char[] dict = str.toCharArray();
		// �迭 ���� -> A=65 Z=90 a=97 z=122

		int num = 0;

		for (int i = 0; i < dict.length; i++) {
			num = dict[i];
			for (int j = 0; j < dict.length - 1 - i; j++) {
				char tmp;
				if (num >= 65 && num <= 90) { // �빮��
					if (dict[j] > dict[j + 1]) {
						exchange(dict, j);
					}
				} else { // �ҹ���
					if (dict[j] > dict[j + 1]) {
						exchange(dict, j);
					}
				}
			}
		}
		// Arrays.sort(dict); //ġƮŰ

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
