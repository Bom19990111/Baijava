package SINHVIEN_PRO;

import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.lang.*;
import java.awt.*;

import javax.swing.JOptionPane;
import SINHVIEN_PRO.SINHVIEN;


public class SinhvienModify {
	public static List<SINHVIEN> findAll() {
		List<SINHVIEN> dsSV = new ArrayList<>();
		Connection conn = null;
		Statement statement = null;
		ResultSet result = null;

		try {
			String dbURL = "jdbc:sqlserver://localhost;databaseName=Account;user=SA;password=nhatthinh190161";
			conn = DriverManager.getConnection(dbURL);
			String sql = "select * from Account_2";
			statement = conn.createStatement();
			result = statement.executeQuery(sql);
			while (result.next()) {
				SINHVIEN sv = new SINHVIEN(result.getInt("id"), result.getString("fullname"),
						result.getString("gender"), result.getString("email"), result.getString("phone"),
						result.getInt("age"));
				dsSV.add(sv);
			}
			result.close();
			statement.close();
			conn.close();

		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}
		return dsSV;
	}

	public static void insert(SINHVIEN sv) {
		Connection conn = null;
		PreparedStatement statement = null;
		ResultSet result = null;

		try {
			String dbURL = "jdbc:sqlserver://localhost;databaseName=Account;user=SA;password=nhatthinh190161";
			conn = DriverManager.getConnection(dbURL);

			String sql = "insert into Account_2(fullname,gender,email,phone,age) values(?,?,?,?,?)";

			statement = conn.prepareCall(sql);

			statement.setString(1, sv.getFullname());
			statement.setString(2, sv.getGender());
			statement.setString(3, sv.getEmail());
			statement.setString(4, sv.getPhoneNumber());
			statement.setInt(5, sv.getAge());

			statement.execute();

			statement.close();
			conn.close();
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
		} 
	}

	public static void delete(int id) {
		Connection conn = null;
		PreparedStatement statement = null;
		ResultSet result = null;

		try {
			String dbURL = "jdbc:sqlserver://localhost;databaseName=Account;user=SA;password=nhatthinh190161";
			conn = DriverManager.getConnection(dbURL);

			String sql = "delete from Account_2 where id=?";

			statement = conn.prepareCall(sql);

			statement.setInt(1, id);

			statement.execute();

			statement.close();
			conn.close();

		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}
	}

	public static void update(SINHVIEN sv) {
		Connection conn = null;
		PreparedStatement statement = null;
		ResultSet result = null;

		try {
			String dbURL = "jdbc:sqlserver://localhost;databaseName=Account;user=SA;password=nhatthinh190161";
			conn = DriverManager.getConnection(dbURL);

			String sql = "UPDATE Account_2 SET fullname=?, gender=?, email=?, phone=?, age=? WHERE id=?;";

			statement = conn.prepareCall(sql);
			statement.setString(1, sv.getFullname());
			statement.setString(2, sv.getGender());
			statement.setString(3, sv.getEmail());
			statement.setString(4, sv.getPhoneNumber());
			statement.setInt(5, sv.getAge());

			statement.executeQuery();

			statement.close();
			conn.close();

		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}

	}

	public static List<SINHVIEN> find(String fullname) {
		List<SINHVIEN> dsSV = new ArrayList<>();
		Connection conn = null;
		PreparedStatement statement = null;
		ResultSet result = null;

		try {
			String dbURL = "jdbc:sqlserver://localhost;databaseName=Account;user=SA;password=nhatthinh190161";
			conn = DriverManager.getConnection(dbURL);
			String sql = "select * from Account_2 where fullname like ?";
			statement = conn.prepareCall(sql);
			statement.setString(1, "%" + fullname + "%");

			result = statement.executeQuery();

			while (result.next()) {// trung voi ten cot trong csdl
				SINHVIEN sv = new SINHVIEN(result.getInt("id"), result.getString("fullname"),
						result.getString("gender"), result.getString("email"), result.getString("phone"),
						result.getInt("age"));
				dsSV.add(sv);
			}
			result.close();
			statement.close();
			conn.close();
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}
		return dsSV;
	}

}
