import java.util.Scanner;

//버블소팅이 웬말이냐~~~
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

		for (int i = data.length; i >= 0 ; i--) {
			for (int j = 0; j <data.length-1; j++) {
				if (data[j] > data[j+1]) {
					int tmp = data[j+1];
					data[j+1] = data[j];
					data[j] = tmp;
				}
			}
		}
		
		System.out.println("정렬후 ");
		for(int i=0; i<data.length; i++) {
			if(i>0) System.out.print(" ");
			System.out.print(data[i]);
		}
		
		
		
		
	}
}
