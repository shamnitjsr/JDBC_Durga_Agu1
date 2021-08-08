package com.jdbc.basic.part1;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class P21_SelectAllRowsToHtmlDemo {

	public static void main(String[] args) throws Exception
	{

		String driver="oracle.jdbc.OracleDriver";
		String jdbc_url="jdbc:oracle:thin:@localhost:1521:XE";
		String user="system";
		String pwd="shambhu";
		String sqlQuery="select * from employees67";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
		Statement st = con.createStatement();
		ResultSet rs =st.executeQuery(sqlQuery);
		String data="";
		data = data+"<html><body bgcolor='green' text='white'><center><table border='2' >";
		data=data+"<tr><td>ENO</td><td>ENAME</td><td>ESAL</td><td>EADDR</td></tr>";
		while(rs.next())
		{
			data=data+"<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getDouble(3)+"</td><td>"+rs.getString(4)+"</td></tr>";
		}
		data=data+"</table></center></body></html>";
		FileOutputStream fos = new FileOutputStream("emp.html");
		byte[] b = data.getBytes();
		fos.write(b);//write byte[] to html
		fos.flush();
		System.out.println("Open emp.html to get Employees data");
		fos.close();
		con.close();
	}

}
