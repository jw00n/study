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

		// ������ �κ�

		Scanner sc = new Scanner(System.in);
		System.out.println("������Ʈ �� ������ �Է��ϼ���.");

		// �Է¹��� ���̵�� ��й�ȣ�� �ִ� ����� ������ ���
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

				// ������ �κ�
				String sql = "select * from info where id=? and pw = ?";
				psmt = conn.prepareStatement(sql);

				psmt.setString(1, id);
				psmt.setString(2, pw);

				// ����Ǵ� ��
				// executeUpdate -> DB���� ������ ���� ���Ҷ� ���.
				// executeQuery : ���ǿ� ���� ���� ���.
				ResultSet rs = psmt.executeQuery();
				// rs : ��¿� ���� ������� �ּҰ��� �Ҵ�
				// rs.next(); > ������ �Ѿ ���� �����ϸ� true ���������� �������� false
				while (rs.next()) {
					// �÷��̸�
					System.out.println(rs.getString("name"));
					System.out.println(rs.getString("id"));
					System.out.println(rs.getString("age"));
					// �÷���ȣ
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
