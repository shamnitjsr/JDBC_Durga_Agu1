package com.jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class P4_DynamicInputDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee number::");
		int eno=sc.nextInt();
		System.out.println("Enter employee name::");
		String ename=sc.next();
		System.out.println("Enter employee salary::");
		int esal=sc.nextInt();
		System.out.println("Enter Address of employee::");
		String addr=sc.next();
		System.out.println("Your provided information is::");
		System.out.println(eno +"\t"+ ename +"\t" +esal +"\t" +addr);
		
		
		
	}

}
