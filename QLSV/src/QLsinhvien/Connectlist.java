package QLsinhvien;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class Connectlist {
	public static ArrayList<String> LoadDatatoCombobox(){
		ArrayList<String> dsach = new ArrayList<>();
		Connection conn = null;
		ResultSet result = null;
		try {
			String dbURL = "jdbc:sqlserver://localhost; databaseName=SV; user=SA; password=nhatthinh190161";
			conn = DriverManager.getConnection(dbURL);
			String sql = "select fullname from student";
			PreparedStatement statement = conn.prepareStatement(sql);
			result = statement.executeQuery();
			while (result.next()) {
				dsach.add(result.getString("fullname")
				);
			}
		}catch(SQLException ex) {
				}
		return dsach;
	}
}

