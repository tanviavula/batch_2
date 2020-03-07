package com.nubes.ipl2020;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {

	public static void main(String[] args) {
//		Connection con = null;
//		Statement st = null;
//		ResultSet rs = null;
//		try {
//			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ipl2020", "lakshman", "lakshman");
//			st = con.createStatement();
//			// st.execute("create table employee(empno int,ename varchar(200),salary
//			// float)");
//			// int count = st.executeUpdate("insert into employee(empno,ename,salary) values
//			// (1002,'Ramesh',54564)");
//			// System.out.println(count);
//
//			rs = st.executeQuery("select empno,ename,salary from employee");
//			while (rs.next()) {
//				int empno = rs.getInt("empno");
//				String name = rs.getString("ename");
//				double salary = rs.getDouble("salary");
//				System.out.println(empno + " " + name + " " + salary);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (st != null) {
//					st.close();
//				}
//				if (con != null) {
//					con.close();
//				}
//			} catch (SQLException e) {
//				System.out.println("While closing resources :" + e);
//			}
//}
		//addEmployee(1001, "Mahesh", 67678);
		deleteEmployee("Krish");
	}

	private static void addEmployee(int empno, String ename, float salary) {
		Connection con = null;
		PreparedStatement pst = null;
		try {
			con = DatabaseUtil.obj.getConnection();
			pst = con.prepareStatement("insert into employee(empno,ename,salary) values(?,?,?)");
			pst.setInt(1, empno);
			pst.setString(2, ename);
			pst.setDouble(3, salary);
			int res = pst.executeUpdate();
			System.out.println(res);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DatabaseUtil.obj.close(con, pst);
		}
	}
	
	private static void deleteEmployee(String ename) {
		Connection con = null;
		PreparedStatement pst = null;
		try {
			con = DatabaseUtil.obj.getConnection();
			pst = con.prepareStatement("delete from employee where ename = ?");
			pst.setString(1, ename);
			int res = pst.executeUpdate();
			System.out.println(res);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DatabaseUtil.obj.close(con, pst);
		}
	}
	
}
