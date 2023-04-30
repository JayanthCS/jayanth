package com.xworkz.jdbc.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcRunner1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded Succesfully");

		String url = "jdbc:mysql://localhost:3306/jdbcemo";
		String userName = "root";
		String password = "4AI17CV028";
		String query = "select * from demo";

		Connection connection = DriverManager.getConnection(url, userName, password);
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(query);
		resultSet.next();

		System.out.println(resultSet.getInt(1));
		System.out.println(resultSet.getString(2));
		System.out.println(resultSet.getString(3));
		System.out.println(resultSet.getInt(4));

		
	}
}
