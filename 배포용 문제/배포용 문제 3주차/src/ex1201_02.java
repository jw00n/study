
public class ex1201_02 {
/*
 * names�� kim�� ��ġ x�� ã��, string�� ��ȯ�ϼ���.
 * kim�� �����ѹ��� ��Ÿ���� �߸��� ���� �ԷµǴ� ���� �����ϴ�.
 * 
 */
	public static void main(String[] args) {
		
		String[] names= {"Queen", "Tod","Kim"};
		System.out.println(findKim(names));

	}
	
	public static String findKim(String[] names) {
		int index=0;
		for(int i=0; i<names.length; i++) {
			if(names[i].equals("Kim")) {
				index=i+1;
			}
		}
		
		String ans="�輭���� "+index+"�� �ִ�.";
		return ans;
		
	}

}
