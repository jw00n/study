package �����÷��̾�;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// �뷡�� ������ִ� ������ ����
		MP3Player mp3 = new MP3Player();
		// �뷡 ���
//		mp3.play("C:\\Users\\smhrd\\Documents\\īī���� ���� ����\\player\\Blossom.mp3");
//		//�뷡 ����
//		mp3.stop();

		int i = 1;
		String defaultPath = "C:\\Users\\smhrd\\Documents\\player\\";
		// �뷡 ��ü ����

		// ��� �뷡�� �ϳ��� ��� ������ �� �ִ� list ����
		ArrayList<Music> musicList = new ArrayList<Music>();
		musicList.add(new Music("�극�̺� �ɽ�", "�Ѹ�", defaultPath + "Rollin.mp3"));
		musicList.add(new Music("����Ŀ����Ŀ", "Blossom", defaultPath + "Blossom.mp3"));
		musicList.add(new Music("����ȣ", "Butterfly", defaultPath + "Butterfly.mp3"));
		musicList.add(new Music("����ƾ ���", "Peaches", defaultPath + "Peaches.mp3"));

		while (true) {
			System.out.print("[1] ��� [2]���� [3]������ [4]������ [5]���� >>");
			int input = sc.nextInt();
			if (input == 1) {
				System.out.println("===���===");
				// 0��° �뷡�� ����ϼ���.
				// ��, �뷡�� ���ļ� �鸮���ʰ�

//				Music m = musicList.get(0);
//				m.getPath();

//				if (mp3.isPlaying())
//					mp3.stop();

				// �뷡�� ������̶�� �뷡�� ������ִ� �ڵ带 �������� �ʰڴ�.
				if (!mp3.isPlaying()) {
					mp3.play(musicList.get(0).getPath());
					// ������ �뷡������ ������ּ���.
					System.out.println("���� - " + musicList.get(0).getSinger());
					System.out.println("���� - " + musicList.get(0).getTitle());
				}

			} else if (input == 2) {
				System.out.println("===����===");
				// ��� ���϶��� ����
				if (mp3.isPlaying()) {
					mp3.stop();
				} else {
					System.out.println("��� ���� �뷡�� �����ϴ�.");
				}

			} else if (input == 3) {
				System.out.println("==========������==========");
				// 1. �뷡 ���
				// ��ġ�� �ʰ� ������ֱ�
				// �����̸� - �뷡���� ���
				// 1���� �뷡
				if (i > 3) {
					System.out.println("���� ���� �����ϴ�.");
					continue;
				}
				if (i < 0) {
					++i;
				}
				mp3.stop();
				mp3.play(musicList.get(i).getPath());
				System.out.println(musicList.get(i).getTitle() + "-" + musicList.get(i).getSinger());
				i++;

				// ex) 0���� -> 1���� �뷡�� ���
				// 2���� -> 3���� �뷡�� ���
				// 3���� (��������° ���� ���) -> �������� �����ϴ�. ���

			} else if (input == 4) {
				System.out.println("==========������==========");
				if (i < 0) {
					System.out.println("���� ���� �����ϴ�.");
					continue;
				}
				if (i > 3) {
					--i;
				}
				mp3.stop();
				mp3.play(musicList.get(i).getPath());
				System.out.println(musicList.get(i).getTitle() + "-" + musicList.get(i).getSinger());
				i--;

			} else if (input == 5) {
				System.out.println("===����===");
				break;
			} else {
				System.out.println("�߸��� �����Դϴ�.");
			}
		}

	}

}
