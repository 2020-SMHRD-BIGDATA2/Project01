package RE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBmethod { // 커넥션 getConnection() & 클로즈close()

	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;

	public void getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "psh";
			String db_pw = "psh";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			System.out.println("연결성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("classnotFound연결실패");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQLE연결실패");
		}
	}

	public void close() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
