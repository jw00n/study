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
		// 아이디, 비밀번호, 이름, 나이를 입력받는다.
		// 테이블 명 - info
		// id - varchar2(50)
		// pw - varchar2(50)
		// name - varchar2(50)
		// age number

//		String id = "momo";
//		String pw = "1234";
//		String name = "모모";
//		int age = 3;

		// 회원가입 DB 값 입력
		// >> 키보드로 입력받기
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

		// 자바와 DB를 연결해주는 기능을 불러오기
		// try-catch 예외처리(오류 발생했을때 처리할 기능)
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 계정 연결
			// 경로, 아이디, 비밀번호
			// 경로
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			// id,pw
			String db_id = "hr";
			String db_pw = "hr";
			// 접속
			try {
				conn = DriverManager.getConnection(url, db_id, db_pw);

				// SQL문을 통해 쿼리문 작성.
				String sql = "insert into info values(?,?,?,?)";

				// ?의 위치에 값을 집어넣기
				psmt = conn.prepareStatement(sql);

				// 물음표 1,2,3,4
				psmt.setString(1, id);
				psmt.setString(2, pw);
				psmt.setString(3, name);
				psmt.setInt(4, age);

				// ==실행==
				// 값 변화가 일어나면
				// 1 row create 가 출력되면
				// 우항은 1(=추가된 행 수만큼)을 좌항에 반환한다.
				int count = psmt.executeUpdate();
				// 회원가입 완료 -> 가입완료 안내 출력
				if (count > 0) { // insert문 실행완료
					System.out.println("회원가입 성공");
				} else {
					System.out.println("회원가입 실패");
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		finally {
			// 끝났으면 psmt->conn 닫아줘야됨
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
