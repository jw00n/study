package ArrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//ArrayList
		//Collection ��Ʈ�� ������ 
		
		//String�� �ڷ������� ���� ArrayList�� ����
		//<> : ���׸� ���
		ArrayList<String> list = new ArrayList<String>();
		
		//2. ������ ����
		list.add("�ؾ");
		list.add("��������");
		list.add("����");
		
		//3. ������ ��������
		System.out.println(list.get(1));

		//4. ������ �����ϱ�.
		list.remove(1);
		System.out.println(list.get(1));
		
		//5. ArrayList�� ũ�� 
		System.out.println(list.size());
		
	}

}
