package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ex02_INSERT {

	public static void main(String[] args) {
		PreparedStatement psmt = null;
		Connection conn = null;
		
		//변경할 부분

		Scanner sc = new Scanner(System.in);
		System.out.println("회원가입 정보를 입력하세요.");

		System.out.print("ID>> ");
		String id = sc.next();

		System.out.print("PW>> ");
		String pw = sc.next();

		System.out.print("NAME>> ");
		String name = sc.next();

		System.out.print("AGE>> ");
		int age = sc.nextInt();

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";

			try {
				conn = DriverManager.getConnection(url, db_id, db_pw);
				
				//변경할 부분
				String sql = "insert into info values(?,?,?,?)";
				psmt = conn.prepareStatement(sql);

				psmt.setString(1, id);
				psmt.setString(2, pw);
				psmt.setString(3, name);
				psmt.setInt(4, age);

				int count = psmt.executeUpdate();
				if (count > 0) {
					System.out.println("회원가입 성공");
				} else {
					System.out.println("회원가입 실패");
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
