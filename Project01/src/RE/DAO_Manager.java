package RE;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO_Manager extends DBmethod {

	@Override
	public void getConnection() {
		super.getConnection();
	}
	@Override
	public void close() {
		super.close();
	}

	public boolean idCheck(String id) {
		boolean isCheck = false;
		getConnection();
		String sql = "select * from personalmember where per_ID = '" + id + "' ";
		try {
			psmt = conn.prepareStatement(sql);
			// psmt.setString(1, id);
			rs = psmt.executeQuery();
			if (rs.next()) {
				isCheck = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return isCheck;
	}

	public boolean idCheck2(String id) {
		boolean isCheck = false;
		getConnection();

		String sql = "select * from managermember where mgr_ID = '" + id + "' ";
		try {
			psmt = conn.prepareStatement(sql);
			// psmt.setString(1, id);
			rs = psmt.executeQuery();
			if (rs.next()) {
				isCheck = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return isCheck;
	}

	public int insert(String id, String pw, String uni, String major) {
		int cnt = 0;
		try {
			getConnection();
			String sql = "insert into managermember values '"+id+"' '"+pw+"' '"+uni+"' '"+major+"' ";
			psmt = conn.prepareStatement(sql);
//			psmt.setString(1, id);// �Է��� id
//			psmt.setString(2, pw);// �Է��� pw
//			psmt.setString(3, uni);// �Է��� �б�
//			psmt.setString(4, major);// �Է����а�
			cnt = psmt.executeUpdate();
			if (cnt > 0) {
				System.out.println(cnt);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("�Է� ����");
		} finally {
			close();
		}
		return cnt;
	}
}