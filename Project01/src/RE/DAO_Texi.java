package RE;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO_Texi extends DBmethod{

	@Override
	public void getConnection() {
		super.getConnection();
	}
	@Override
	public void close() {
		super.close();
	}
	public void Select() { // 텍시 게시판 단어 검색 목록 보기

		try {
			getConnection();

			String sql = "select from taxi where taxi_title in ? ";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, "ksk");// 검색단어가 있는 data만 출력
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

	public int del(String pw1, String pw2) { // 개인 계정 삭제

		try {
			getConnection();

			if (pw1.equals(pw2)) {
				String sql = "delete from personalmember where per_id = ? and per_pw = ?";
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, "ksk");/* 로그인 한 계정 */
				psmt.setString(2, "1234");/* 입력한 비밀번호 */
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
	public int update( String pw, String name, String phone) { // 본인 계정 정보 수정

		try {
			getConnection();
			String sql = "update personalmember set per_pw = ? , per_name = ?, per_phone = ? where per_id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, "1234");// 입력한 pw1
			psmt.setString(2, "1234");// 입력한 name
			psmt.setString(3, "1234");// 입력한 phone
			psmt.setString(4, "1234");//로그인한 id
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

	public int insert(String id, String pw, String name, String phone, String SecurityNum) { // 본인 계정 삭제

		try {
			getConnection();
			String sql = "insert into personalmember values(?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, "ksk");// 입력한 id
			psmt.setString(2, "1234");// 입력한 pw1
			psmt.setString(3, "1234");// 입력한 name
			psmt.setString(4, "1234");// 입력한 phone
			psmt.setString(5, "1234");// 입력한 securityNum
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
