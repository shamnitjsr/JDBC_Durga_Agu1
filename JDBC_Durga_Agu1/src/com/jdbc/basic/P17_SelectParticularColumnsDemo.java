package com.jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class P17_SelectParticularColumnsDemo {

	public static void main(String[] args) throws Exception
	{

		String driver="oracle.jdbc.OracleDriver";
		String jdbc_url="jdbc:oracle:thin:@localhost:1521:XE";
		String user="system";
		String pwd="shambhu";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
		Statement st = con.createStatement();
		String sqlQuery="select ename,eaddr from employees67";
		boolean flag=false;
		ResultSet rs =st.executeQuery(sqlQuery);
		System.out.println("ENAME\tEADDR");
		System.out.println("------------------");
		while(rs.next())
		{
			flag=true;
			//System.out.println(rs.getString("ename")+"\t"+rs.getString("eaddr"));
			System.out.println(rs.getString(1)+"\t"+rs.getString(2));
		}
		if(flag==false)
		{
			System.out.println("No Records found");
		}
		con.close();
	}

}
