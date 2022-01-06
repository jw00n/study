package 추상클래스;

public class RegularEmployee {

	private String empno;
	private String name;
	private int pay;
	private int bonus;
	
	
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super();
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.bonus = bonus;
	}
	
	
	public int getMoneyPay() {
		int result=(pay+bonus)/12;
		return result;
	}
	
	public String print() {
		String result= empno+" : "+name+" : "+pay;
		return result;
	}
	
	
	
	
}
