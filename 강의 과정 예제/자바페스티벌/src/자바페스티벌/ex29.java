package �ڹ��佺Ƽ��;

public class ex29 {

	public static void main(String[] args) {

		System.out.println(getMiddle("test"));
		
	}

	public static String getMiddle(String string) {

		char[] c= string.toCharArray();
		String result="";
		if(c.length%2==0) { //¦��
			result+=c[c.length/2-1];
			result+=c[c.length/2];
			
		}else { //Ȧ��
			result+=c[c.length/2];
		}
		
		
		return result;
	}

}
