package Game;

/*
 charhp number(10) not null,
charatt number(10) not null,
chatexp number(10) not null,
charmp number(10) not null,
count number(5) not null,
 */
public class Game_VO {
	private String nickname = null; //ĳ���� ��
	private int charHp; //ü��
	private int charAtt; //���ݷ�
	private int charExp; //����ġ
	private int charMp; //�����Һ�
	private int floorCount; //�������� ��
	
	
	
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
		System.out.println("�г��� : "+nickname);
		System.out.println("ü�� : "+charHp);
		System.out.println("mp : "+charMp);
		System.out.println("���ݷ� : "+charAtt);
		System.out.println("����ġ : "+charExp);
	}

	public void Here() {
		System.out.println("���� ����� ����");
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




	// ���⿡ ĳ���� dao �� �ҷ��;��ҵ�?

}