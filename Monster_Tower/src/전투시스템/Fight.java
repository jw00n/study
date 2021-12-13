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
	
	public Fight() {
		// TODO Auto-generated constructor stub
	}
	
	public Fight(String name, String skill, int vhp, int hp, int vmp, int mp, int vexp, int exp, int att, int lv) {
		super();
		this.name = name;
		this.skill = skill;
		this.vhp = vhp;
		this.hp = hp;
		this.vmp = vmp;
		this.mp = mp;
		this.vexp = vexp;
		this.exp = exp;
		this.att = att;
		this.lv = lv;
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
	
	
}