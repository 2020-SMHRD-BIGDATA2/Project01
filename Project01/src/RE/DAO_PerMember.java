package RE;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO_PerMember extends DBmethod { // ȸ�� ���� ���� select > del > update > insert
	@Override
	public void getConnection() {
		super.getConnection();
	}

	@Override
	public void close() {
		super.close();
	}

	public void Select() { // ���� �ָ� ���� ����Ȯ��

		try {
			getConnection();

			String sql = "select from Store where per_id = ? ";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, "ksk");// �Ű������� �޾ƿ� id�� �ִ´�
			
			rs = psmt.executeQuery();

			while(rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String nick = rs.getString(3);
				
				System.out.println(id+"\n"+pw+"\tn"+nick);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
	}

	public int del(String pw1, String pw2) { // ���� ���� ����

		try {
			getConnection();

			if (pw1.equals(pw2)) {
				String sql = "delete from personalmember where per_id = ? and per_pw = ?";
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, "ksk");/* �α��� �� ���� */
				psmt.setString(2, "1234");/* �Է��� ��й�ȣ */
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
	public int update( String pw, String name, String phone) { // ���� ���� ���� ����

		try {
			getConnection();
			String sql = "update personalmember set per_pw = ? , per_name = ?, per_phone = ? where per_id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, "1234");// �Է��� pw1
			psmt.setString(2, "1234");// �Է��� name
			psmt.setString(3, "1234");// �Է��� phone
			psmt.setString(4, "1234");//�α����� id
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

	public int insert(String id, String pw, String name, String phone, String SecurityNum) { // ���� ���� ����

		try {
			getConnection();
			String sql = "insert into personalmember values(?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, "ksk");// �Է��� id
			psmt.setString(2, "1234");// �Է��� pw1
			psmt.setString(3, "1234");// �Է��� name
			psmt.setString(4, "1234");// �Է��� phone
			psmt.setString(5, "1234");// �Է��� securityNum
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

	public PMVO login(String id, String pw) {
		PMVO vo = null;
		
		getConnection();
		
		try {
			String sql = "Select * from PERSONALMEMBER where PER_ID = ? AND PER_PW = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			rs = psmt.executeQuery();
			if(rs.next()) {
				// �α��� ���� �� ����
				 String PER_ID = rs.getString(1);
				 String PER_PW = rs.getString(2);
				 String PER_NAME = rs.getString(3);
				 String PER_PHONE = rs.getString(4);
				 String PER_SECURITYNUM = rs.getString(5);
				 vo = new PMVO(PER_ID, PER_PW, PER_NAME, PER_PHONE, PER_SECURITYNUM);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return vo;
	}
}