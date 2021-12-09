package 상속예제_인형뽑기;

public class Main {

	public static void main(String[] args) {
		//메인
		
		Machine m= new Machine();
		Pika p= new Pika();
		Apeach a=new Apeach();
		Ompang o=new Ompang();
		

		m.start(p);
		m.start(a);
		m.start(o);
		
	//	Doll doll= new Doll();
		
	}

}
