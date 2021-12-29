package JDBC;

import model.DAO;
import model.VO;

public class ex06_dao실행 {
	public static void main(String[] args) {

		DAO dao = new DAO();
		VO vo= dao.select();
		//vo에는 id,pw,name, age가 들어있다.
		System.out.println(vo.getName());
		
		// dao.insert();
		// dao.update();

	}
}
