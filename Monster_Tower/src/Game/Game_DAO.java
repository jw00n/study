package Game;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Game_DAO {

	PreparedStatement psmt = null;
	Connection conn = null;
	ResultSet rs = null;
	Scanner sc = new Scanner(System.in);

	// vo�� ���� ������


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

	public Game_VO select() {

		
	}

	public Game_VO  Initial_insert(String name) {
		String nickname = name; // ĳ���� ��
		int charHp = 10; // ü��
		int charAtt = 2; // ���ݷ�
		int charExp = 0; // ����ġ
		int charMp = 10; // �����Һ�
		int floorCount = 0;
		// game_vo�� �г����� �ҷ��ͼ� �־������.

		conn();
		String sql = "insert into charact values(?,?,?,?,?,?)";

		try {
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, nickname);
			psmt.setInt(2, charHp);
			psmt.setInt(3, charAtt);
			psmt.setInt(4, charExp);
			psmt.setInt(5, charMp);
			psmt.setInt(6, floorCount);

			int count = psmt.executeUpdate(); // ����

			if (count > 0) {
				System.out.println("���� ����");
			} else {
				System.out.println("���� ����");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		Game_VO gVo=new Game_VO(nickname, charHp, charAtt, charExp, charMp, floorCount);

	return gVo;
	}

}
