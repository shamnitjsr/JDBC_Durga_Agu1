package com.jdbc.basic.part1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class P25_ExecuteMethodLoopHoles1T1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		String driver="sun.jdbc.odbc.JdbcOdbcDriver";
		String jdbc_url="jdbc:odbc:demodsn";
		String user="scott";
		String pwd="tiger";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
		Statement st = con.createStatement();
		int updateCount=st.executeUpdate("create table emp1(eno number)");
		System.out.println(updateCount);
		con.close();
	}

}
