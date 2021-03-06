package RE;

import java.sql.SQLException;
import java.util.ArrayList;

public class DAO_Store extends DBmethod {
	
//==================================수현수정===================================================
	@Override
	public void getConnection() {
		super.getConnection();
	}

	@Override
	public void close() {
		super.close();
	}

	public int booking(String name, String table_num, String time) {

		int cnt = 0;
		try {
			getConnection();
			String sql = "insert into booking(book_num, book_tablenum, book_time, store_num) values(book_SEQ.NEXTVAL, '" + table_num + "','" + time + "','" + name + "') "; // 예약한 // 일치할때
			psmt = conn.prepareStatement(sql);
			int cnt2 = psmt.executeUpdate();
			if (cnt2 >0) {
				System.out.println(cnt2);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}

//	public int setName(String store_name) {
//		int cnt = 0;
//
//		try {
//			getConnection();
//			String sql = "insert into store(store_name) valeus ('" + store_name + "') ";
//			psmt = conn.prepareStatement(sql);
//			cnt = psmt.executeUpdate();
//			if (cnt > 0) {
//				System.out.println(cnt);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//			System.out.println("DB에 sotre_name insert 실패");
//		} finally {
//			close();
//		}
//
//		return cnt;
//	}

	public PMVO login(String id, String pw) {
		PMVO vo = null;

		getConnection();

		try {
//			String sql = "Select * from PERSONALMEMBER where PER_ID = ? AND PER_PW = ?";
			String sql = "select * from personalmember where per_ID = '" + id + "' AND per_pw = '" + pw + "' ";
			psmt = conn.prepareStatement(sql);
//			psmt.setString(1, id);
//			psmt.setString(2, pw);
			rs = psmt.executeQuery();
			if (rs.next()) {
				// 로그인 성공 시 들어옴
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

	public ArrayList<StoreVO> getinfo() {
		ArrayList<StoreVO> storelist = new ArrayList<StoreVO>();

		try {
			getConnection();
			String sql = "select * from store";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				int store_num = rs.getInt("STORE_NUM");
				String store_name = rs.getString("STORE_NAME");
				String uni_name = rs.getString("UNI_NAME");
				String major_name = rs.getString("MAJOR_NAME");
				storelist.add(new StoreVO(store_num, store_name, uni_name, major_name));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("주막 값 가져오기 실패");
		} finally {
			close();
		}
		return storelist;

	}
//	public int setName(String store_name) {
//	int cnt = 0;
//
//	try {
//		getConnection();
//		String sql = "insert into store(store_name) valeus ('" + store_name + "') ";
//		psmt = conn.prepareStatement(sql);
//		cnt = psmt.executeUpdate();
//		if (cnt > 0) {
//			System.out.println(cnt);
//		}
//	} catch (SQLException e) {
//		e.printStackTrace();
//		System.out.println("DB에 sotre_name insert 실패");
//	} finally {
//		close();
//	}
//
//	return cnt;
//}

	public int insertStore(String store_name, String store_location, int store_tableN, String date,
			String time, String menu_name, int menu_price) {
		int cnt = 0;
		try {
			getConnection();
			String sql = "insert into store(store_num, store_name, store_date, store_time, menu_name, nenu_price, store_location, store_tablenum) values (store_SEQ.NEXTVAL,'"+store_name+"','"+date+"','"+time+"','"+menu_name+"','"+menu_price+"','"+store_location+"','"+store_tableN+"') ";
//			String sql = "INSERT INTO STORE(store_num, store_name, store_date, store_time, menu_name, nenu_price, store_location, store_tablenum) VALUES (NUM_SEQ.NEXTVAL, '"+store_num+"', '"+store_date+"', store_time, menu_name, menu_price, store_location, store_talbenum)";
			psmt = conn.prepareStatement(sql);
			cnt = psmt.executeUpdate();
			if (cnt > 0) {
				System.out.println(cnt);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB에 주막등록 실패");
		} finally {
			close();
		
		return cnt;
	}
}}