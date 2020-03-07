package com.nubes.ipl2020;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.PreparedStatement;

public enum DatabaseUtil {
	obj;

	public Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ipl2020", "lakshman", "lakshman");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public void close(Connection con,Statement st) {
		try {
			if(st!=null && con!=null) {
				st.close();
				con.close();
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void close(Connection con,Statement st,ResultSet rs) {
		try {
			if(rs != null) {
				rs.close();
			}
			if(st!=null && con!=null) {
				st.close();
				con.close();
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void close(Connection con,PreparedStatement pst) {
		try {
			if(pst!=null && con!=null) {
				pst.close();
				con.close();
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
