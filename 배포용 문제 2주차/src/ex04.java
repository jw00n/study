import java.util.Arrays;
import java.util.Random;

//로또는 숫자 6개를 뽑는다.
public class ex04 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] arr = new int[6];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100);// 랜덤 숫자 지정
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("행운의 숫자: " + arr[i]);
		}
	}
}
