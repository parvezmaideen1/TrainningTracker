/**
 * This class demonstrate how to connect to MySQL database
 */
package com.perficient.javacoe;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement; 
/**
 * @author parvez.maideen
 *
 */
public class MySQLConnection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection con = null;
		try {
			//Class.forName("com.mysql.jdbc.Driver"); 
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/appdb","root","MySQL1.com!_");
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from user"); 
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getString(6));  
			}
			con.close();  
		}catch(ClassNotFoundException classNotFoundEx) {
			classNotFoundEx.printStackTrace();
		}
		catch(SQLException sqlEx) {
			sqlEx.printStackTrace();
		}finally {
			try {
				if(null != con)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}

	}

}