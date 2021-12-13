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

	// vo에 넣을 변수들


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

	public Game_VO select() {

		
	}

	public Game_VO  Initial_insert(String name) {
		String nickname = name; // 캐릭터 명
		int charHp = 10; // 체력
		int charAtt = 2; // 공격력
		int charExp = 0; // 경험치
		int charMp = 10; // 마나소비량
		int floorCount = 0;
		// game_vo의 닉네임을 불러와서 넣어줘야함.

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

			int count = psmt.executeUpdate(); // 실행

			if (count > 0) {
				System.out.println("생성 성공");
			} else {
				System.out.println("생성 실패");
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
