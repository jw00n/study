package Game;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import System.VO;
import 전투시스템.Fight;

public class Game_DAO {

	PreparedStatement psmt = null;
	Connection conn = null;
	ResultSet rs = null;
	Scanner sc = new Scanner(System.in);

	// vo에 넣을 변수들
	String nickname = null;
	int charHp; // 체력
	int charAtt; // 공격력
	int charExp; // 경험치
	int charMp; // 마나소비량
	int floorCount;
	int lv;

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

	public Fight select(String name) {

		conn();
		String sql = "select * from charact where nickname=?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);

			rs = psmt.executeQuery();
			while (rs.next()) {
				// System.out.pr213intln(rs.getString("name"));
				// vo 값 입력
				nickname = rs.getString("nickname");
				charHp = rs.getInt("charhp");
				charAtt = rs.getInt("charatt");
				charExp = rs.getInt("charexp");
				charMp = rs.getInt("charmp");
				floorCount = rs.getInt("count");
				lv= rs.getInt("lv");
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
		Fight fight = new Fight(nickname, charHp, charMp, charExp, charAtt, floorCount,lv);
		return fight;
	}

	public Fight Initial_insert(String name) {
		String nickname = name; // 캐릭터 명
		charHp = 10; // 체력
		charAtt = 2; // 공격력
		charExp = 0; // 경험치
		charMp = 10; // 마나소비량
		floorCount = 0;
		lv=1;
		// game_vo의 닉네임을 불러와서 넣어줘야함.

		conn();
		String sql = "insert into charact values(?,?,?,?,?,?,?)";

		try {
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, nickname);
			psmt.setInt(2, charHp);
			psmt.setInt(3, charAtt);
			psmt.setInt(4, charExp);
			psmt.setInt(5, charMp);
			psmt.setInt(6, floorCount);
			psmt.setInt(7, lv);

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
		Fight fight = new Fight(nickname, charHp, charAtt, charExp, charMp, floorCount,lv);
		return fight;

	}

	public void save_update(Fight fight) {
		conn();
		String sql = "update charact set charhp=?, charatt=?, charexp=?, charmp=?, count=? ,lv=? where nickname=?";
		try {
			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, fight.getHp());
			psmt.setInt(2, fight.getAtt());
			psmt.setInt(3, fight.getExp());
			psmt.setInt(4, fight.getMp());
			psmt.setInt(5, fight.getFloorCount());
			psmt.setInt(6, fight.getLv());
			psmt.setString(7, fight.getName());

			int count = psmt.executeUpdate();
			if (count > 0) {
				System.out.println("성공");
			} else {
				System.out.println("실패");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
			
		}
	}



}
