
public class ex1203_03 {

	public static void main(String[] args) {
				
		
		System.out.println(getMiddle("power"));
	}

	private static String getMiddle(String str) {
		char[] c= str.toCharArray();
		String mid;
		if(c.length %2!=0) {//���̰� Ȧ���ΰ��
			mid = ""+c[c.length/2];
		}else {//���̰� ¦���ΰ��
			mid=""+c[c.length/2-1]+c[c.length/2];
		}
		return mid;

		
	}

}
