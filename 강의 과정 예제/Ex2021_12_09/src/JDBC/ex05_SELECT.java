package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ex05_SELECT {
	public static void main(String[] args) {
		PreparedStatement psmt = null;
		Connection conn = null;

		// 변경할 부분

		Scanner sc = new Scanner(System.in);
		System.out.println("업데이트 할 정보를 입력하세요.");

		// 입력받은 아이디와 비밀번호가 있는 사람의 정보를 출력
		System.out.print("ID>> ");
		String id = sc.next();
		System.out.print("PW>> ");
		String pw = sc.next();

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";

			try {
				conn = DriverManager.getConnection(url, db_id, db_pw);

				// 변경할 부분
				String sql = "select * from info where id=? and pw = ?";
				psmt = conn.prepareStatement(sql);

				psmt.setString(1, id);
				psmt.setString(2, pw);

				// 변경되는 점
				// executeUpdate -> DB값이 쿼리로 인해 변할때 사용.
				// executeQuery : 조건에 대한 값을 출력.
				ResultSet rs = psmt.executeQuery();
				// rs : 출력에 대한 결과값이 주소값을 할당
				// rs.next(); > 다음로 넘어감 값이 존재하면 true 존재히자이 ㄴ않음녀 false
				while (rs.next()) {
					// 컬럼이름
					System.out.println(rs.getString("name"));
					System.out.println(rs.getString("id"));
					System.out.println(rs.getString("age"));
					// 컬럼번호
					System.out.println(rs.getString(3));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (psmt != null) {
				try {
					psmt.close();
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}
	}

}
