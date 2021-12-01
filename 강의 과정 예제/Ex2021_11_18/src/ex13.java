import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요.");
		int pay = sc.nextInt(); // 입력받은 금액

		System.out.print("메뉴를 고르세요\n 1.콜라(800원) 2. 생수(500원) 3. 비타민워터(1500원)) >>");
		int menuNum = sc.nextInt(); // 선택된 메뉴
		int coin = 0; // 잔돈
		int price = 0;

		// 스위치문 menuNum을 인수로 받아서 선택값에 따라 각 케이스 문을 실행한다
		// 주문번호 이외의 입력이 있을 시에 default로 잘못된 선택임을 알리는 안내문을 출력한다.
		switch (menuNum) {
		case 1:
			price = 800;
			break; // 일반적으로 잔돈 계산이 된 경우
		case 2: // 이하 같음.
			price = 500;
			break;
		case 3:
			price = 1500;
			break;
		default: // 정의된 케이스 이외의 값이 입력된 경우
			coin = pay;// 잔돈으로 원래 금액대입하고 반환
			System.out.println("메뉴를 잘못 선택하셨습니다");// 안내문
			break;
		}

		if (coin < 0) { // 선택된 메뉴 가격보다 입력된 가격이 적은 경우 = 잔돈이 음수인 경우
			System.out.println("돈이 부족해요"); // 돈이 부족함을 알림
			coin = pay;// 잔돈에 다시 원래 금액을 대입
		}

		coin = pay - price;

		// 잔돈계산
		int m1 = coin / 1000; // 1천원 단위 -> 잔돈을 1000으로 나눈 몫
		int m2 = (coin % 1000) / 500; // 500원 단위 -> 1000으로 나눈 나머지를 500으로 나눈 몫
		int m3 = (coin % 500) / 100; // 100원 단위 ->500으로 나눈 나머지를 100으로 나눈 몫

		// 잔돈 및 단위 출력
		System.out.println("잔돈: " + coin + "원");
		System.out.println("천원 : " + m1 + " 오백원 : " + m2 + " 백원 : " + m3);

	}

}
