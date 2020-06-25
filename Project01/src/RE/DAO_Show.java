package RE;

import java.sql.SQLException;

public class DAO_Show extends DBmethod{
	@Override
	public void getConnection() {
		super.getConnection();
	}

	@Override
	public void close() {
		super.close();
	}

	public int searchCeleb(String a) {
		int cnt = 0;
		try {
			getConnection();
			
			String sql = "select * from member where  celeb_name = '"+ a +"' ";
			
			while(rs.next()) {
				//String id = rs.getString(1);
				String perfomer = rs.getString(2);
				String job = rs.getString(3);
				String uni = rs.getString(4);
				
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
}
