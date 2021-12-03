import java.util.Scanner;

//인접한 원소끼리 크기 비교를 해서 오른쪽이 더 작으면 서로 위치를 바꾼다.
//1회전 끝낸후에 맨 마지막원소(1회전 경과시 가장 큰 원소)는 정렬에서 제외시킨다.
public class ex09_버블정렬 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] data = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "번째 수 입력: ");
			data[i] = sc.nextInt();
		}

		for (int i=0; i<data.length; i++) {
			//i가 한번씩 반복될때마다 오른쪽 끝의 값은 점점 차므로 n-1에서 n-1-i까지만 반복하면 된다.
			for (int j = 0; j < data.length - 1 - i; j++) {
				if (data[j] > data[j + 1]) {
					
					int tmp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = tmp;
					
				}
			}
		}

		System.out.println("정렬후 ");
		for (int i = 0; i < data.length; i++) {
			if (i > 0)
				System.out.print(" ");
			System.out.print(data[i]);
		}

	}
}
