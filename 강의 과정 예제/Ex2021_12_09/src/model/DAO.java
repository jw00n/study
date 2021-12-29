package model;

import java.sql.Connection;
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
		
		//vo�� ���� ������
		String vo_id=null;
		String vo_pw=null;
		String vo_name=null;
		int vo_age=0;
		
		conn();
		String sql = "select * from info where id = ? ";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			
			rs = psmt.executeQuery();
			while (rs.next()) {
			//	System.out.println(rs.getString("name"));
				//vo �� �Է�
				vo_id=rs.getString("id");
				vo_pw=rs.getString("pw");
				vo_name = rs.getString("name");
				vo_age = rs.getInt("age");
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
		VO vo=new VO(vo_id, vo_pw, vo_name, vo_age);
		return vo;
	}

	public void insert() {
		// db�� ������ ��.
		System.out.println("ȸ������ ������ �Է��ϼ���.");

		System.out.print("ID>> ");
		String id = sc.next();
		System.out.print("PW>> ");
		String pw = sc.next();
		System.out.print("NAME>> ");
		String name = sc.next();
		System.out.print("AGE>> ");
		int age = sc.nextInt();

		conn();
		String sql = "insert into info values(?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setInt(4, age);

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

	}

	public void update() {
		System.out.println("������Ʈ �� ������ �Է��ϼ���.");

		// id�� pw�� �Է¹޾Ƽ� info ���̺��� �ش�id�� �˻��ϰ� pw�� �Է¹��� ������ ����
		System.out.print("ID>> ");
		String id = sc.next();
		System.out.print("PW>> ");
		String pw = sc.next();

		conn();
		String sql = "update info set pw= ? where id = ?";
		try {
			psmt = conn.prepareStatement(sql);

			psmt.setString(2, id);
			psmt.setString(1, pw);

			int count = psmt.executeUpdate();
			if (count > 0) {
				System.out.println("����");
			} else {
				System.out.println("����");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

	}

}
