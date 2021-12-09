import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ex04_UPDATE {

	public static void main(String[] args) {

		PreparedStatement psmt = null;
		Connection conn = null;
		
		//변경할 부분

		Scanner sc = new Scanner(System.in);
		System.out.println("업데이트 할 정보를 입력하세요.");

		// id와 pw를 입력받아서 info 테이블에서 해당id를 검색하고 pw를 입력받은 값으로 변경
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
				
				//변경할 부분
				String sql = "update info set pw= ? where id = ?";
				psmt = conn.prepareStatement(sql);

				psmt.setString(2, id);
				psmt.setString(1, pw);
				
				
				int count = psmt.executeUpdate();
				if (count > 0) {
					System.out.println("성공");
				} else {
					System.out.println("실패");
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
