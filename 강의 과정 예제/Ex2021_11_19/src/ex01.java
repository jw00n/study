import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("금액을 입력하세요.");
	      int inputMoney = sc.nextInt();
	      System.out.println("메뉴를 고르세요.");
	      System.out.print("[1]콜라(800원) [2]생수(500원) [3]비타민워터(1500원) >> ");
	      int choice = sc.nextInt();
	      
	      int price = 0;
	      
	      if(choice==1) {
	         price = 800;
	      }else if(choice == 2) {
	         price = 500;
	      }else if(choice == 3) {
	         price = 1500;
	      }
	      
	      if(inputMoney<price) {
	         System.out.println("돈이 부족해요ㅠㅠ");
	         price = 0;
	      }
	      int change = inputMoney-price;
	      System.out.println("잔돈 : "+change+"원");
	      
	      int ch1000 = change/1000;
	      int ch500 = change%1000/500;
	      int ch100 = change%500/100;
	      System.out.print("천원 : "+ch1000+"개, ");
	      System.out.print("오백원 : "+ch500+"개, ");
	      System.out.println("백원 : "+ch100+"개");
	}
}
