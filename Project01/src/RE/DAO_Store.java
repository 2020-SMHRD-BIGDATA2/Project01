package RE;

import java.sql.SQLException;

public class DAO_Store extends DBmethod {
	@Override
	public void getConnection() {
		super.getConnection();
	}

	@Override
	public void close() {
		super.close();
	}

	public int booking(String table, String time) {
		int cnt = 0;
		try {
			getConnection();
			int n = 0;
			String sql = "insert into booking values('" + n + "','" + n + "','" + "n" + "','" + "n" + "','"+n+"','"+n+"','"+"n"+"') "; // 예약한																									// 일치할때
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			n++;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
}