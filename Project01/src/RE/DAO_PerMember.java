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

	public int update(String pw, String name, String phone) { // ���� ���� ���� ����

		try {
			getConnection();
			String sql = "update personalmember set per_pw = ? , per_name = ?, per_phone = ? where per_id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, "1234");// �Է��� pw1
			psmt.setString(2, "1234");// �Է��� name
			psmt.setString(3, "1234");// �Է��� phone
			psmt.setString(4, "1234");// �α����� id
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

	public int insert(String id, String pw, String name, String phone, String SecurityNum) { // ȸ������
		int cnt = 0;
		try {
			getConnection();
			String sql = "insert into personalmember values(?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);// �Է��� id
			psmt.setString(2, pw);// �Է��� pw1
			psmt.setString(3, name);// �Է��� name
			psmt.setString(4, phone);// �Է��� phone
			psmt.setString(5, SecurityNum);// �Է��� securityNum
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

	public PMVO login(String id, String pw) {
		PMVO vo = null;

		getConnection();

		try {
			String sql = "Select * from PERSONALMEMBER where PER_ID = ? AND PER_PW = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			rs = psmt.executeQuery();
			if (rs.next()) {
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

	public boolean idCheck(String id) { // ���ξ��̵� �ߺ�Ȯ�� �޼ҵ�
		boolean isCheck = false;
		getConnection();
		String sql = "select * from PERSONALMEMBER where PER_ID = ? ";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			if (rs.next()) {
				isCheck = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return isCheck;
	}

	public boolean idCheck2(String id) { // �����ھ��̵� �ߺ�Ȯ�� �޼ҵ�
		boolean isCheck = false;
		getConnection();
		String sql = "select * from managerMember where PER_ID = ? ";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			if (rs.next()) {
				isCheck = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return isCheck;
	}

	public boolean del(String pw) {
		boolean isCheck = false;
		getConnection();
		String sql = "select * from managerMember where PER_PW = ? ";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, pw);
			rs = psmt.executeQuery();
			if (rs.next()) {
				isCheck = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return isCheck;
	}
}