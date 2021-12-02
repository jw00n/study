package 메소드응용;

public class ex03_메소드오버로딩 {

	public static void main(String[] args) {
		System.out.println(add(7,4));
		System.out.println(add(7.2,4.3));
		System.out.println();
	}

	//동일 메소드명 매개변수 데이터 타입이 다름 -> 오버로딩
	
	private static double add(double d, double e) {
		// TODO Auto-generated method stub
		return d+e;
	}

	private static int add(int i, int j) {
		return i+j;
	}
}
