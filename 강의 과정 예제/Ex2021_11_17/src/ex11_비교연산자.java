
public class ex11_�񱳿����� {
	public static void main(String[] args) {
		boolean a=true; 
		boolean b=false;
		System.out.println(a==b);
		System.out.println(a!=b);
		//����� boolean true/false \\xor ������ false �ٸ��� true //eor
		System.out.println(a^b);

		/*
		  <���� ������>
		   ���ǹ� ? ���๮1 : ���๮2
		  			T	  F
		 */
		
		int i=3;
		int j=10;
		
		System.out.println(i!=j ? "����" : "�ٸ���");
		
		
	}
}
//1 1 1
//0 1 0
//1   1
//0 0 0 �б��������� ��  && || !