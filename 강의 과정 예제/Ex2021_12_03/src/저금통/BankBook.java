package 저금통;

/*설계도면
 1. Field(속성)
 	이름 name
 	잔액 money
 
 2. 기능
 	입금하는 기능 deposit
 	- 매개변수 정수형 데이터
 	- 리턴타입 x
 	
 	출금하는 기능 withdraw
 	- 매개변수 정수형 데이터
 	- 리턴타입은 없음
 	
 	잔액 표시 showMoney
 	- 매개변수 없고
 	- 리턴타입  X
 */


public class BankBook {
	
	
	private String name;
	private int money; //캡슐화(정보은닉)
	
	
	//객체를 생성할때 field에 있는 데이터 초기화 시켜줄 메소드 생성
	//생성자 constructor
	
	public BankBook(String name, int money) {
		this.name= name;
		this.money= money;
	}
	
	//생성자 오버로딩
	//기본 생성자
	/*
	public BankBook() {
		//클래스 설계도면에 어떠한 생성자도 없을때, 생략가능하다.
		//새롭게 정의하는 생성자가 생겼을 경우에는 덮어씌워진다.
	}
	 */
	public void deposit(int money) {
		//money+=money;
		this.money+=money;
		//this -> 현재 속해진 클래스를 지칭한다.
	}

	public void wihtdraw(int money) {
		this.money-=money;
	}
	
	public void showMoney() {
		System.out.println("잔액 : "+money);
	}
	

	
}
