package com.jdbc.basic.part1;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class P23_ExecuteMethodLoopHoles2T1 {

	public static void main(String[] args) throws Exception
	{

		String driver="sun.jdbc.odbc.JdbcOdbcDriver";
		String jdbc_url="jdbc:odbc:demodsn";
		String user="system";
		String pwd="shambhu";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
		Statement st = con.createStatement();
		ResultSet rs=st.executeQuery("update employees set esal=7777 where ename='Sachin'");
		con.close();
	}

}
