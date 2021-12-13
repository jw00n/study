package 전투시스템;

public class Mon {
	private String name;
	private int vhp;
	private int hp;
	private int exp;
	private int att;
	
	Mon(String name, int vhp, int hp, int exp, int att) {
		super();
		this.name = name;
		this.vhp = vhp;
		this.hp = hp;
		this.exp = exp;
		this.att = att;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
