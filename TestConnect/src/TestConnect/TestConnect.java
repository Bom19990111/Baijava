package TestConnect;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnect {
	public static Connection getConnection() {
		Connection conn = null;
		String dbURL = "jdbc:sqlserver://localhost; databaseName=QLSACH; user=SA; password=nhatthinh190161";
		try {
			conn = DriverManager.getConnection(dbURL);
			System.out.println("Đã kết nối");
		} catch (SQLException ex) {
			System.err.println(" Vui lòng cài win lại để thực thi tốt nhất " + ex);
			}
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			} catch (Exception e) {
				e.printStackTrace();
			}
		return conn;
		}
}
