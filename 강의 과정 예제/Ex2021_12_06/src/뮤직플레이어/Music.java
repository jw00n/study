package 뮤직플레이어;

public class Music {
	
	//음악 정보 하나를 관리
	
	//1. 필드 속성 - 가수, 제목, 경로
	private String singer;
	private String title;
	private String path;
	
	//2. 메소드 기능 
	
	//필드 세개를 초기화하는 생성자
	
	public Music(String singer, String title, String path) {
		this.singer = singer;
		this.title = title;
		this.path = path;
	}

	//모든 필드들 갖고 오는 getter메소드
	
	public String getSinger() {
		return singer;
	}

	public String getTitle() {
		return title;
	}

	public String getPath() {
		return path;
	}	
	
	


}
