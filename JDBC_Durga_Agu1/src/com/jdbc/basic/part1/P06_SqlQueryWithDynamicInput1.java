package com.jdbc.basic.part1;

import java.util.Scanner;

public class P06_SqlQueryWithDynamicInput1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Employee Number::");
				int eno=sc.nextInt();
				System.out.println("Enter employee name::");
				String ename = sc.next();
				System.out.println("Enter employee salary");
				int esal = sc.nextInt();
				System.out.println("Enter employee address::");
				String eaddr= sc.next();
				String sql_query= String.format("insert into employees67 values(%d,'%s',%d,'%s')",eno,ename,esal,eaddr);
				System.out.println("Hello query with your Dynamic Input is::");
				System.out.println(sql_query);
				

	}

}
