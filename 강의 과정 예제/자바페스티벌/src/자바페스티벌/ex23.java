package 자바페스티벌;

public class ex23 {

	public static void main(String[] args) {
		System.out.println(reverseStr("ZAbcdVefEg"));

	}

	public static String reverseStr(String string) {
		char[] c = string.toCharArray();

		for (int i = 0; i < c.length - 1; i++) {
			int num= c[i];
			
			
		
		}
		String result = "";
		for (int i = 0; i < c.length; i++) {
			result += c[i];
		}
		return result;
	}

}
