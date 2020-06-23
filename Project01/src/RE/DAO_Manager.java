package RE;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO_Manager extends DBmethod{

	@Override
	public void getConnection() {
		super.getConnection();
	}
	@Override
	public void close() {
		super.close();
	}
	

	public int update(String pw1,String pw2) { // �ָ� ���� ����

		try {
			getConnection();
			if (pw1.equals(pw2)) {
				String sql = "update store set mgr_pw = ? ";
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, "ksk");/* �α��� �� ���� */
				int cnt = psmt.executeUpdate();
				if (cnt > 0) {
					System.out.println(cnt);
					return cnt;
				}

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return 0;
	}

	public int insert(String id, String pw, String name, String phone, String SecurityNum) { // ���� ���� ����

		try {
			getConnection();
			String sql = "insert into managermember values(?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, "ksk");// �Է��� id
			psmt.setString(2, "1234");// �Է��� pw1
			psmt.setString(3, "1234");// �Է��� �б�
			psmt.setString(4, "1234");// �Է��� �а�
			int cnt = psmt.executeUpdate();
			if (cnt > 0) {
				System.out.println(cnt);
				return cnt;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return 0;
	}	
	public int del(String pw1,String pw2) { // �ָ� ���� ����

		try {
			getConnection();
			if (pw1.equals(pw2)) {
				String sql = "delete from managermember where per_id = ? and per_pw = ? ";
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, "ksk");/* �α��� �� ���� */
				psmt.setString(2, pw1);// pw1
				int cnt = psmt.executeUpdate();
				if (cnt > 0) {
					System.out.println(cnt);
					return cnt;
				}

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return 0;
	}

}
