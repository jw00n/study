import java.util.Arrays;
import java.util.Random;

//�ζǴ� ���� 6���� �̴´�.
public class ex04 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] arr = new int[6];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100);// ���� ���� ����
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("����� ����: " + arr[i]);
		}
	}
}
