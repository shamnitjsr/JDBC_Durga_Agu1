package com.jdbc.basic.part1;

import java.sql.*;
public class P01_CreateTableDemo 
{
	public static void main(String[] args) throws Exception
	{
		//jdbc:oracle:thin:@localhost:1521/xe","system","shambhu
		
		String driver="oracle.jdbc.OracleDriver";
		String jdbc_url="jdbc:oracle:thin:@localhost:1521:XE";
		String user="system";
		String pwd="shambhu";
		String sql_query="create table employees67(eno number,ename varchar2(10),esal number(10,2),eaddr varchar2(10))";
		//String sql_query="drop table employees67";
		Class.forName(driver);
       	Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
		Statement st = con.createStatement();
		st.executeUpdate(sql_query);
		System.out.println("Table Created Successfully");
		//System.out.println("Table deleted Successfully");
		con.close();
	}
}
