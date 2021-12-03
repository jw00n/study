package OOP응용;

public class Pokemon {

	/*
	 * 1. 속성(캡슐화) 이름 name, 스킬 skill, hp, 공격 attack, 타입 type
	 * 
	 * 2. 메소드 - 필드안에 있는 모든 데이터를 초기화 시킬 수 있는 생성자
	 */

	private String name, skill,type;
	private int hp, attack;

	//생성자 단축키: alt shift s


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
 