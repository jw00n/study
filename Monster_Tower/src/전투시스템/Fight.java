package 전투시스템;

public class Fight {
	private String name;
	private String skill;
	private int vhp;
	private int hp;
	private int vmp;
	private int mp;
	private int vexp;
	private int exp;
	private int att;
	private int lv;
	private int floorCount;
	
	public Fight() {
	}
	
	
	public Fight(String name,  int hp, int mp, int exp, int att,int floorCount,int lv) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.exp = exp;
		this.att = att;
		this.floorCount= floorCount;
		this.lv = lv;
	}

	public Fight(int vhp, int vmp, int vexp) {
		
		this.vhp = vhp;
		this.vmp = vmp;
		this.vexp = vexp;
		
	}

	
	public void charPrint() {
		System.out.println("닉네임 : "+name);
		System.out.println("체력 : "+hp);
		System.out.println("mp : "+mp);
		System.out.println("공격력 : "+att);
		System.out.println("경험치 : "+exp);
	}

	
	
	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public int getVhp() {
		return vhp;
	}

	public void setVhp(int vhp) {
		this.vhp = vhp;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getVmp() {
		return vmp;
	}

	public void setVmp(int vmp) {
		this.vmp = vmp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getVexp() {
		return vexp;
	}

	public void setVexp(int vexp) {
		this.vexp = vexp;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getAtt() {
		return att;
	}

	public void setAtt(int att) {
		this.att = att;
	}




	public int getFloorCount() {
		return floorCount;
	}



	public void setFloorCount(int floorCount) {
		this.floorCount = floorCount;
	}
	
	
}