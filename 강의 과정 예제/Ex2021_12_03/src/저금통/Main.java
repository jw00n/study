package 저금통;

//실행공간
public class Main {

	public static void main(String[] args) {
		//1. bank 객체생성
		BankBook bank= new BankBook("정운",7000);
		
		//2. 본인 이름 넣기
		
		//3. 잔액에 7000원을 넣어주세
		bank.deposit(7000);
		//변수에 직접 접근하는 방법 사용x
		//4. 잔액을 출력
		bank.showMoney();
		
		//5.bank객체 잔액에서 2000원 출금
		bank.wihtdraw(2000);
		//6.잔액 출력 5000
		bank.showMoney();
		
	}

}
