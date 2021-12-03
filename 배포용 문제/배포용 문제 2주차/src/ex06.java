
public class ex06 {
	public static void main(String[] args) {

		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
		// 인덱스틀 출력하라는 뜻?

		int len = 0;
		int sp = Integer.MAX_VALUE;

		int idx1 = 0, idx2 = 0;

		for (int i = 0; i < point.length; i++) {
			for (int j = i + 1; j < point.length; j++) {
				len = Math.abs(point[i] - point[j]); // 거리 구해서
				if (len <= sp) {
					sp = len;
					idx1 = i;
					idx2 = j;
				}
			}
		}

		System.out.println("result = [" + idx1 + "," + idx2 + "]");

	}
//0,0//1,0 1,1//2,0 2,1 2,2 3,0
}
