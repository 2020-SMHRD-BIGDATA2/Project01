//package RE;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class DBLogin { // JDBC 연결
//
////	Connection conn = null;
////	PreparedStatement pst = null;
////	// 01. oracle에서 제공하는 lib파일을 import
////	PreparedStatement pst = null;
////	Connection conn = null;
////	ResultSet rs = null;
//	try {
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//
//		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
//		String dbid = "hr";
//		String dbpw = "hr";
//
//		conn = DriverManager.getConnection(url, dbid, dbpw);
//		String sql = "select * from members where id = ? and pw = ?";
//
//		pst = conn.prepareStatement(sql); // 준비해주는 다리
//		pst.setString(1, "ksk");
//		pst.setString(2, "1234");
//		rs = pst.executeQuery();
//
//		while (rs.next()) {
//			String id = rs.getString(1);
//			String pw = rs.getString(2);
//			String name = rs.getString(3);
//			System.out.println(id + pw + name);
//		}
//
//	} catch (Exception e) { // 모든 예외를 통칭하는 애 >>Exception e (상속을 받고 있음)
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} finally {
//
//		try {
//			if (rs != null) {
//				rs.close();
//			}
//			if(pst!= null) {
//				pst.close();
//			}
//			if(conn!= null) {
//				conn.close();
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//}
//	
//
//
//}
