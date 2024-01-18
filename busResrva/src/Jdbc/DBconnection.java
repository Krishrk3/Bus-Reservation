package Jdbc;

import java.sql.*;
public class DBconnection {
	private static final String url="jdbc:mysql://localhost:3306/busresv";
	private static final String userName="root";
	private static final String password="Krishrk@3";
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url,userName,password);
	}
}
