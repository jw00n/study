import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ex04_UPDATE {

	public static void main(String[] args) {

		PreparedStatement psmt = null;
		Connection conn = null;
		
		//������ �κ�

		Scanner sc = new Scanner(System.in);
		System.out.println("������Ʈ �� ������ �Է��ϼ���.");

		// id�� pw�� �Է¹޾Ƽ� info ���̺��� �ش�id�� �˻��ϰ� pw�� �Է¹��� ������ ����
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
				
				//������ �κ�
				String sql = "update info set pw= ? where id = ?";
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
