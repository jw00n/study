package System;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DAO {

	// 데이터 베이스에 접근하는 코드를 적는 공간.
	// Database Access Object
	// insert delete update select

	PreparedStatement psmt = null;
	Connection conn = null;
	ResultSet rs = null;
	Scanner sc = new Scanner(System.in);
	
	//vo에 넣을 변수들
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

	// ====이하 sql문====//

	public VO select() {
		// 입력받은 아이디가 있는 정보 출력
		System.out.print("id 입력>>");
		String id = sc.next();
		System.out.print("pw 입력>>");
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
				//vo 값 입력
				vo_id=rs.getString("memberid");
				vo_pw=rs.getString("memberpw");
				vo_name = rs.getString("nickname");
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // try 또는 catch가 실행된 후에 반드시 실행.
			close();
			if (rs != null) { // 다른 ddl에서는 사용하지않으므로 select문안에서만 close
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
		// db에 저장할 값.
		System.out.println("회원가입 정보를 입력하세요.");

		System.out.print("ID>> ");
		vo_id = sc.next();
		System.out.print("PW>> ");
		vo_pw = sc.next();
		System.out.print("닉네임>> ");
		vo_name = sc.next();
	
		conn();
		String sql = "insert into member(memberid,memberpw,nickname) values(?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, vo_id);
			psmt.setString(2, vo_pw);
			psmt.setString(3, vo_name);

			int count = psmt.executeUpdate(); // 실행

			if (count > 0) {
				System.out.println("회원가입 성공");
			} else {
				System.out.println("회원가입 실패");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		VO vo=new VO(vo_id, vo_pw, vo_name);//캐릭터를 저장
		return vo;

	}

	public void update() {}


}
