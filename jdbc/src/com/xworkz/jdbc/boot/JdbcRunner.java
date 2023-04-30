package com.xworkz.jdbc.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcRunner {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded Succesfully");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcemo", "root",
				"4AI17CV028");
		Statement statement = connection.createStatement();
		statement.execute("insert into demo values(2,'Jayanth','Male',24)");
		connection.close();
		System.out.println("Done");

	}
}
