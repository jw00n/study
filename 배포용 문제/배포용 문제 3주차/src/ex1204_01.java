
public class ex1204_01 {

	public static void main(String[] args) {
		// 하샤드 수

		System.out.println(isHarshad(11));

	}

	public static boolean isHarshad(int i) {
		boolean flag = false;

		int sum = 0;
		int x = i; // 맨 마지막에 비교해야하므로 따로 저장

		while (x >= 1) {
			sum += x % 10; // 1의 자리-> 10의 자리 -> ...순으로 sum에 더해짐
			x /= 10;
		}

		if (i % sum == 0) { // 나뉘면 true 아니라면 false인 채로
			flag = true;
		}
		return flag;
	}

}
