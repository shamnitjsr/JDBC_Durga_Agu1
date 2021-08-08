package com.jdbc.basic.part1;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class P24_ExecuteMethodLoopHoles2T4 {

	public static void main(String[] args) throws Exception
	{

		String driver="oracle.jdbc.OracleDriver";
		String jdbc_url="jdbc:oracle:thin:@localhost:1521:XE";
		String user="system";
		String pwd="shambhu";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
		Statement st = con.createStatement();
		ResultSet rs=st.executeQuery("update employees67 set esal=7777 where ename='sam06'");
		while(rs.next())
		{
		}
		con.close();
	}

}
