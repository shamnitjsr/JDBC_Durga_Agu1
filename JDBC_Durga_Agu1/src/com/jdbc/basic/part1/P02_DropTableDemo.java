package com.jdbc.basic.part1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class P02_DropTableDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		//jdbc:oracle:thin:@localhost:1521/xe","system","shambhu
		
				String driver="oracle.jdbc.OracleDriver";
				String jdbc_url="jdbc:oracle:thin:@localhost:1521:XE";
				String user="system";
				String pwd="shambhu";
				
				String sql_query="drop table employees67";
				Class.forName(driver);
		       	Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
				Statement st = con.createStatement();
				st.executeUpdate(sql_query);
				
				//System.out.println("Table deleted Successfully");
				con.close();

	}

}
