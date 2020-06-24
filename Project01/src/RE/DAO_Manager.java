package RE;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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

	public int insert(String id, String pw,  String major,String uni) {
		int cnt = 0;
		try {
			System.out.println("??????????????????????");
			getConnection();
			System.out.println("insert연결성공");
		//	String sql = "insert into managermember values ('"+id+"','"+pw+"','"+uni+"','"+major+"')";

			String sql = "insert into managermember values ('a','a',10,20)";
			psmt = conn.prepareStatement(sql);
			cnt = psmt.executeUpdate();
			System.out.println("cnt = "+cnt);
			if (cnt > 0) {
				System.out.println(cnt);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("입력 실패");
		} finally {
			close();
		}
		return cnt;
	}
	
	public MMVO login(String id, String pw) {
		MMVO vo = null;
		getConnection();

		try {
//			String sql = "Select * from PERSONALMEMBER where PER_ID = ? AND PER_PW = ?";
			String sql = "select * from managermember where mgr_ID = '" + id + "' AND mgr_pw = '" + pw + "' ";
			psmt = conn.prepareStatement(sql);
//			psmt.setString(1, id);
//			psmt.setString(2, pw);
			rs = psmt.executeQuery();
			if (rs.next()) {
				// 로그인 성공 시 들어옴
				String mgr_ID = rs.getString(1);
				String mgr_PW = rs.getString(2);
				String uni_name = rs.getString(3);
				String major_name = rs.getString(4);
				
				vo = new MMVO(mgr_ID, mgr_PW, uni_name, major_name);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return vo;
	}

}