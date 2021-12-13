package Game;

/*
 charhp number(10) not null,
charatt number(10) not null,
chatexp number(10) not null,
charmp number(10) not null,
count number(5) not null,
 */
public class Game_VO {
	private String nickname = null; //캐릭터 명
	private int charHp; //체력
	private int charAtt; //공격력
	private int charExp; //경험치
	private int charMp; //마나소비량
	private int floorCount; //스테이지 수
	
	
	
	public Game_VO() {
	}



	

	
	
	public Game_VO(String nickname, int charHp, int charAtt, int charExp, int charMp, int floorCount) {
		this.nickname = nickname;
		this.charHp = charHp;
		this.charAtt = charAtt;
		this.charExp = charExp;
		this.charMp = charMp;
		this.floorCount = floorCount;
	}

	public void charPrint() {
		System.out.println("닉네임 : "+nickname);
		System.out.println("체력 : "+charHp);
		System.out.println("mp : "+charMp);
		System.out.println("공격력 : "+charAtt);
		System.out.println("경험치 : "+charExp);
	}

	public void Here() {
		System.out.println("게임 실행될 공간");
	}

	public int getCharHp() {
		return charHp;
	}



	public void setCharHp(int charHp) {
		this.charHp = charHp;
	}



	public int getCharAtt() {
		return charAtt;
	}



	public void setCharAtt(int charAtt) {
		this.charAtt = charAtt;
	}



	public int getCharExp() {
		return charExp;
	}



	public void setCharExp(int charExp) {
		this.charExp = charExp;
	}



	public int getCharMp() {
		return charMp;
	}



	public void setCharMp(int charMp) {
		this.charMp = charMp;
	}



	public int getFloorCount() {
		return floorCount;
	}



	public void setFloorCount(int floorCount) {
		this.floorCount = floorCount;
	}



	public String getNickname() {
		return nickname;
	}




	// 여기에 캐릭터 dao 더 불러와야할듯?

}