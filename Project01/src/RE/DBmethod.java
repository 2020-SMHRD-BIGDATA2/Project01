package RE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBmethod { //Ŀ�ؼ� getConnection() & Ŭ����close()

	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;

	public void getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
//<<<<<<< HEAD
			String db_url = "jdbc:oracle:thin:@172.30.1.56:1521:xe";
			String db_id = "psh";
			String db_pw = "psh";
//=======
//			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
//			String db_id = "ksk";
//			String db_pw = "ksk";
//>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA2/Project01.git
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			System.out.println("���Ἲ��");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("classnotFound�������");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQLE�������");
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
