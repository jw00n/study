import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("�ݾ��� �Է��ϼ���.");
	      int inputMoney = sc.nextInt();
	      System.out.println("�޴��� ������.");
	      System.out.print("[1]�ݶ�(800��) [2]����(500��) [3]��Ÿ�ο���(1500��) >> ");
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
	         System.out.println("���� �����ؿ�Ф�");
	         price = 0;
	      }
	      int change = inputMoney-price;
	      System.out.println("�ܵ� : "+change+"��");
	      
	      int ch1000 = change/1000;
	      int ch500 = change%1000/500;
	      int ch100 = change%500/100;
	      System.out.print("õ�� : "+ch1000+"��, ");
	      System.out.print("����� : "+ch500+"��, ");
	      System.out.println("��� : "+ch100+"��");
	}
}
