package System;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DAO {

	// ������ ���̽��� �����ϴ� �ڵ带 ���� ����.
	// Database Access Object
	// insert delete update select

	PreparedStatement psmt = null;
	Connection conn = null;
	ResultSet rs = null;
	Scanner sc = new Scanner(System.in);
	
	//vo�� ���� ������
	String vo_id=null;
	String vo_pw=null;
	String vo_name=null;
	int vo_best=0;
	Date vo_date= null;
	int vo_count = 0;
	

	public void conn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";

			try {
				conn = DriverManager.getConnection(url, db_id, db_pw);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void close() {
		if (psmt != null) {
			try {
				psmt.close();
				if (conn != null) {
					conn.close();

				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// ====���� sql��====//

	public VO select() {
		// �Է¹��� ���̵� �ִ� ���� ���
		System.out.print("id �Է�>>");
		String id = sc.next();
		System.out.print("pw �Է�>>");
		String pw = sc.next();
		

		conn();
		String sql = "select * from member where memberid = ? and memberpw=?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			rs = psmt.executeQuery();
			while (rs.next()) {
			//	System.out.pr213intln(rs.getString("name"));
				//vo �� �Է�
				vo_id=rs.getString("memberid");
				vo_pw=rs.getString("memberpw");
				vo_name = rs.getString("nickname");
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // try �Ǵ� catch�� ����� �Ŀ� �ݵ�� ����.
			close();
			if (rs != null) { // �ٸ� ddl������ ������������Ƿ� select���ȿ����� close
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		VO vo=new VO(vo_id, vo_pw, vo_name);
		return vo;
	}

	public VO insert() {
		// db�� ������ ��.
		System.out.println("ȸ������ ������ �Է��ϼ���.");

		System.out.print("ID>> ");
		vo_id = sc.next();
		System.out.print("PW>> ");
		vo_pw = sc.next();
		System.out.print("�г���>> ");
		vo_name = sc.next();
	
		conn();
		String sql = "insert into member(memberid,memberpw,nickname) values(?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, vo_id);
			psmt.setString(2, vo_pw);
			psmt.setString(3, vo_name);

			int count = psmt.executeUpdate(); // ����

			if (count > 0) {
				System.out.println("ȸ������ ����");
			} else {
				System.out.println("ȸ������ ����");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		VO vo=new VO(vo_id, vo_pw, vo_name);//ĳ���͸� ����
		return vo;

	}

	public void update() {}


}
