package RE;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO_Texi extends DBmethod{

	@Override
	public void getConnection() {
		super.getConnection();
	}
	@Override
	public void close() {
		super.close();
	}
	public void Select() { // �ؽ� �Խ��� �ܾ� �˻� ��� ����

		try {
			getConnection();

			String sql = "select from taxi where taxi_title in ? ";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, "ksk");// �˻��ܾ �ִ� data�� ���
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String nick = rs.getString(3);
				
				System.out.println(id+"\t"+pw+"\t"+nick);
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
	public ArrayList<TaxiVO> gettaxiinfo() {
		ArrayList<TaxiVO> taxilist = new ArrayList<TaxiVO>();

		try {
			getConnection();
			String sql = "select * from taxi";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				int taxi_num = rs.getInt("taxi_num");
				String per_id = rs.getString("per_id");
				String taxi_title = rs.getString("taxi_title");
				String taxi_date = rs.getString("taxi_date");
				String taxi_sub = rs.getString("taxi_sub");
				taxilist.add(new TaxiVO(taxi_num, taxi_title, taxi_sub, taxi_date, per_id));
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("�ý� �Խ��� �� �������� ����");
		} finally {
			close();
		}
		return taxilist;

	};
}
	