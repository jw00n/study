package OOP����;

public class Pokemon {

	/*
	 * 1. �Ӽ�(ĸ��ȭ) �̸� name, ��ų skill, hp, ���� attack, Ÿ�� type
	 * 
	 * 2. �޼ҵ� - �ʵ�ȿ� �ִ� ��� �����͸� �ʱ�ȭ ��ų �� �ִ� ������
	 */

	private String name, skill,type;
	private int hp, attack;

	//������ ����Ű: alt shift s


	public Pokemon(String name, String skill, String type, int hp, int attack) {
		this.name = name;
		this.skill = skill;
		this.type = type;
		this.hp = hp;
		this.attack = attack;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public String getSkill() {
		return skill;
	}

	public String getType() {
		return type;
	}

	public int getAttack() {
		return attack;
	}
	

}
 