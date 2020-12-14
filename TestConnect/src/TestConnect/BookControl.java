package TestConnect;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BookControl {
	public static ArrayList<Books> getAllBook() {
		ArrayList<Books> list = new ArrayList<>();

		try {
			Connection conn = TestConnect.getConnection();
			Statement st = conn.createStatement();
			String sql = "select * from SACH";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Books book = new Books(rs.getInt("ID"), rs.getString("Title"), rs.getFloat("Price"));
				list.add(book);
			}
			rs.close();
			st.close();
			conn.close();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return list;
	}
}
