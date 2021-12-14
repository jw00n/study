package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ex01_INSERT {

	public static void main(String[] args) {
		PreparedStatement psmt = null;
		Connection conn = null;
		// INSERT
		// ���̵�, ��й�ȣ, �̸�, ���̸� �Է¹޴´�.
		// ���̺� �� - info
		// id - varchar2(50)
		// pw - varchar2(50)
		// name - varchar2(50)
		// age number

//		String id = "momo";
//		String pw = "1234";
//		String name = "���";
//		int age = 3;

		// ȸ������ DB �� �Է�
		// >> Ű����� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("ȸ������ ������ �Է��ϼ���.");

		System.out.print("ID>> ");
		String id = sc.next();

		System.out.print("PW>> ");
		String pw = sc.next();

		System.out.print("NAME>> ");
		String name = sc.next();

		System.out.print("AGE>> ");
		int age = sc.nextInt();

		// �ڹٿ� DB�� �������ִ� ����� �ҷ�����
		// try-catch ����ó��(���� �߻������� ó���� ���)
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// ���� ����
			// ���, ���̵�, ��й�ȣ
			// ���
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			// id,pw
			String db_id = "hr";
			String db_pw = "hr";
			// ����
			try {
				conn = DriverManager.getConnection(url, db_id, db_pw);

				// SQL���� ���� ������ �ۼ�.
				String sql = "insert into info values(?,?,?,?)";

				// ?�� ��ġ�� ���� ����ֱ�
				psmt = conn.prepareStatement(sql);

				// ����ǥ 1,2,3,4
				psmt.setString(1, id);
				psmt.setString(2, pw);
				psmt.setString(3, name);
				psmt.setInt(4, age);

				// ==����==
				// �� ��ȭ�� �Ͼ��
				// 1 row create �� ��µǸ�
				// ������ 1(=�߰��� �� ����ŭ)�� ���׿� ��ȯ�Ѵ�.
				int count = psmt.executeUpdate();
				// ȸ������ �Ϸ� -> ���ԿϷ� �ȳ� ���
				if (count > 0) { // insert�� ����Ϸ�
					System.out.println("ȸ������ ����");
				} else {
					System.out.println("ȸ������ ����");
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		finally {
			// �������� psmt->conn �ݾ���ߵ�
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
