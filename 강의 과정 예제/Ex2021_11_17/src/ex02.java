/*
 ���� ���� Home, Shift + End. ���콺 3�� Ŭ��
���� �̵� Alt + (��,��)
���� ���� Alt + Ctrl + (��,��)
���� ���� Ctrl + D
 */



public class ex02 {
	public static void main(String[] args) {

		//		 �� 1��
		boolean state= true;
		System.out.println(state);
		//		����(����) 5��
		char c ='A'; //character 
		System.out.println(c);

		byte b = 127; 
		short sh=32767;
		int i=2147483647;
		long l=22;

		//		�Ǽ� 2��
		float f= 15.7f;
		double d=20.5;
		System.out.println(f+"\n"+d);


		int num1= 15;
		long num3 = num1; //long <- int (����)
		//num1= num3; int <- long  (�Ұ���)

		double num2= (double)num1;
		num1=(int)d; //��������ȯ

		System.out.println(num1+"\n"+num2);

		int maxValue=Integer.MAX_VALUE;
		System.out.println(maxValue);

		byte bmv= Byte.MAX_VALUE;
		System.out.println(bmv);

		/*
		  Integer.MAX_VALUE;
		  Short.MAX_VALUE;
		 * 
		 */

		double num4 = num1; //�ڵ�����ȯ
		System.out.println("num4="+num4);
	
		int num5= (int)num4; // double -> int (��������ȯ)
		
		int num6= 22; //4byte
		float num7= num6; //4byte ���� ũ��� ����?
		System.out.println(num7);
		
		int num8= (int)num7; //!!���� ũ��� �ȵ�. ������ �ս��� �Ͼ���ֱ⶧��.
		
		

	}
}
