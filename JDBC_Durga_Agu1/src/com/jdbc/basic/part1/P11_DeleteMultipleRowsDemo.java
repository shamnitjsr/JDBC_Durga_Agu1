package com.jdbc.basic.part1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class P11_DeleteMultipleRowsDemo {
	public static void main(String[] args) throws Exception
	{

		String driver="oracle.jdbc.OracleDriver";
		String jdbc_url="jdbc:oracle:thin:@localhost:1521:XE";
		String user="system";
		String pwd="shambhu";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
		Statement st = con.createStatement();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter CutOff Salary:");
		double cutOff =sc.nextDouble();
		String sqlQuery=String.format("delete from employees67 where esal>=%f",cutOff);
		int updateCount=st.executeUpdate(sqlQuery);
		System.out.println("The number of rows deleted :"+updateCount);
		con.close();
	}

}
