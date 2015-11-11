package br.com.beak.fj21.cap5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection(){
		try{
			/*try{
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e){
				throw new SQLException(e.getMessage())	;
			}
			//DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			//Class.forName("com.mysql.jdbc.Driver");
			 * 
			 */
			return DriverManager.getConnection("jdbc:mysql://localhost/fj21", "root", "");
		} catch (SQLException e){
			throw new RuntimeException(e);
		}
	}
}
