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

	public void select() { // ������ ��� ���� //���� �ð�������

		try {
			getConnection();

			String sql = "select from Booking where ? orderby book_time "; //������ �ָ����̸���  �����ڹ�ȣ�� ��ġ�Ҷ�
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

	public int del() { // �ָ� ���� ����

		try {
			getConnection();
				String sql = "delete from store where store_num = ?"; //�ָ� ����� �ָ��̸��� ������
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, "ksk");//�ָ���ȣ�� ���� ��
				rs = psmt.executeQuery();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return 0;
	}
	public int insert() { // ���� ���� ����

		try {
			getConnection();
			String sql = "insert into store values(?,?,?,?,?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, "ksk");// �Է��� ��ȣ
			psmt.setString(2, "1234");// �Է��� ��¥
			psmt.setString(3, "1234");// �Է��� ��ð�
			psmt.setString(4, "1234");// �Է��� �޴��Է�
			psmt.setString(5, "1234");// �Է��� �޴��ݾ�
			psmt.setString(6, "1234");// �Է��� �ָ���ġ
			psmt.setString(7, "1234");// ����Ϸ��� �������� �Ҽ�
			psmt.setString(8, "1234");// �Է��� ���̺� ����
			psmt.setString(9, "1234");// ����Ϸ��� �������� id
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

}
