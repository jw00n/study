package �ڹ��佺Ƽ��;

import java.util.Arrays;
import java.util.Random;

public class ex12 {

	public static void main(String[] args) {
		Random rd = new Random();
		int[] num = new int[8];

		for (int i = 0; i < num.length; i++) {
			num[i] = rd.nextInt(100);
		}

		int min = num[0], max = num[0];
		for (int i = 1; i < num.length; i++) {

			if (num[i] > max) {
				max = num[i];
			}
			if (num[i] < min) {
				min = num[i];
			}
		}
		
		System.out.println(Arrays.toString(num));
		System.out.println("���� ū ��: "+max);
		System.out.println("���� ���� ��: "+min);

	}

}
