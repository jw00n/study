package �޼ҵ�;

public class ex08_���� {

	/*
	 * op�� ������ ���ϴ� �����ڷ� �ʱ�ȭ �ϼ���.
	 * �����ڿ� �°� ������ �������� ��ȯ���ִ� cal�޼ҵ带 �ۼ��ϼ���.
	 */
	public static void main(String[] args) {
		
		int num1= 50;
		int num2 =15;
		char op = '-';
		System.out.println(cal(num1,num2,op));

	}
	
	//1. �Ű������� �޾ƿ� op�� ���� ���
	
	//2. num1+num2 �� ���Ѱ��� result�� ����ּ��뤷
	
	//3. op - ��� ���� ���̸� result�� ����޿�
	//ū������ �������� �����ؼ� ������� result�� ����ּ���
	//5. op�� 
	
	// split������
	
	

	public static int cal(int num1, int num2,char op) {
		int result= 0;
		
		if(op=='-') {
			result=Math.abs(num1-num2);
		}
		
		
		return result;
	}
}
