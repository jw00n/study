package 뮤직플레이어;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 노래를 재생해주는 도구를 생성
		MP3Player mp3 = new MP3Player();
		// 노래 재생
//		mp3.play("C:\\Users\\smhrd\\Documents\\카카오톡 받은 파일\\player\\Blossom.mp3");
//		//노래 정지
//		mp3.stop();

		int i = 1;
		String defaultPath = "C:\\Users\\smhrd\\Documents\\player\\";
		// 노래 객체 생성

		// 모든 노래를 하나로 묶어서 관리할 수 있는 list 생성
		ArrayList<Music> musicList = new ArrayList<Music>();
		musicList.add(new Music("브레이브 걸스", "롤린", defaultPath + "Rollin.mp3"));
		musicList.add(new Music("버스커버스커", "Blossom", defaultPath + "Blossom.mp3"));
		musicList.add(new Music("전영호", "Butterfly", defaultPath + "Butterfly.mp3"));
		musicList.add(new Music("저스틴 비버", "Peaches", defaultPath + "Peaches.mp3"));

		while (true) {
			System.out.print("[1] 재생 [2]정지 [3]다음곡 [4]이전곡 [5]종료 >>");
			int input = sc.nextInt();
			if (input == 1) {
				System.out.println("===재생===");
				// 0번째 노래를 재생하세요.
				// 단, 노래가 겹쳐서 들리지않게

//				Music m = musicList.get(0);
//				m.getPath();

//				if (mp3.isPlaying())
//					mp3.stop();

				// 노래가 재생중이라면 노래를 재생해주는 코드를 실행하지 않겠다.
				if (!mp3.isPlaying()) {
					mp3.play(musicList.get(0).getPath());
					// 가수와 노래제목을 출력해주세요.
					System.out.println("가수 - " + musicList.get(0).getSinger());
					System.out.println("제목 - " + musicList.get(0).getTitle());
				}

			} else if (input == 2) {
				System.out.println("===정지===");
				// 재생 중일때만 정지
				if (mp3.isPlaying()) {
					mp3.stop();
				} else {
					System.out.println("재생 중인 노래가 없습니다.");
				}

			} else if (input == 3) {
				System.out.println("==========다음곡==========");
				// 1. 노래 재생
				// 겹치지 않게 만들어주기
				// 가수이름 - 노래제목 출력
				// 1번방 노래
				if (i > 3) {
					System.out.println("다음 곡이 없습니다.");
					continue;
				}
				if (i < 0) {
					++i;
				}
				mp3.stop();
				mp3.play(musicList.get(i).getPath());
				System.out.println(musicList.get(i).getTitle() + "-" + musicList.get(i).getSinger());
				i++;

				// ex) 0번방 -> 1번방 노래가 재생
				// 2번방 -> 3번방 노래가 재생
				// 3번방 (마지막번째 방이 재생) -> 다음곡이 없습니다. 출력

			} else if (input == 4) {
				System.out.println("==========이전곡==========");
				if (i < 0) {
					System.out.println("이전 곡이 없습니다.");
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
				System.out.println("===종료===");
				break;
			} else {
				System.out.println("잘못된 숫자입니다.");
			}
		}

	}

}
