//package Jdbc;
//
//import java.sql.*;
////types of  statement
////normal statement "id","name","salary" 
////prepared statement ??? con.prepared
////callable statement
//
//public class JDBCdemo {
//	public static void main(String[]args) throws Exception{
//		String url="jdbc:mysql://localhost:3306/jdbcdemo";
//		String userName="root";
//		String password="Krishrk@3";
//		String query="select * from employee";
//
//		Connection con = DriverManager.getConnection(url,userName,password);
//		Statement st = con.createStatement();
//		ResultSet rs = st.executeQuery(query);//execute already register values
//
//		while(rs.next()) {
//			System.out.println("Id is:"+" "+rs.getInt(1));
//			System.out.println("Name is:"+" "+rs.getString(2));
//			System.out.println("Salary is:"+" "+rs.getString(3));
//		}
//
//
//		con.close();
//	}
//}
