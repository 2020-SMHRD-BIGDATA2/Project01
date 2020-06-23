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

	public void select() { // 예약한 사람 보기 //예약 시간순으로

		try {
			getConnection();

			String sql = "select from Booking where ? orderby book_time "; //예약한 주막의이름이  관리자번호가 일치할때
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

	public int del() { // 주막 정보 삭제

		try {
			getConnection();
				String sql = "delete from store where store_num = ?"; //주막 등록한 주막이름이 같을때
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, "ksk");//주막번호가 같을 때
				rs = psmt.executeQuery();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return 0;
	}
	public int insert() { // 본인 계정 삭제

		try {
			getConnection();
			String sql = "insert into store values(?,?,?,?,?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, "ksk");// 입력한 번호
			psmt.setString(2, "1234");// 입력한 날짜
			psmt.setString(3, "1234");// 입력한 운영시간
			psmt.setString(4, "1234");// 입력한 메뉴입력
			psmt.setString(5, "1234");// 입력한 메뉴금액
			psmt.setString(6, "1234");// 입력한 주막위치
			psmt.setString(7, "1234");// 등록하려는 관리자의 소속
			psmt.setString(8, "1234");// 입력한 테이블 갯수
			psmt.setString(9, "1234");// 등록하려는 관리자의 id
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
