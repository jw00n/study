package JDBC;

import model.DAO;
import model.VO;

public class ex06_dao���� {
	public static void main(String[] args) {

		DAO dao = new DAO();
		VO vo= dao.select();
		//vo���� id,pw,name, age�� ����ִ�.
		System.out.println(vo.getName());
		
		// dao.insert();
		// dao.update();

	}
}
