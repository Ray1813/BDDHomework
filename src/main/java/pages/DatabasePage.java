package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePage {
	Connection connection;
	Statement statement;
	ResultSet resultSet;
	 String columnValue;

	public String getDataFromDb(String columnName) {

		try {
			// Set Properties for mysql
			Class.forName("com.mysql.cj.jdbc.Driver");

			String sqlUrl = "jdbc:mysql:// 44.195.13.80:3306/april_2023";
			String sqlUsername = "student";
			String sqlPassword = "Student@123";
			String sqlQuery= " Select * from users;";

			// Create Connection to our desire database

			connection = DriverManager.getConnection(sqlUrl, sqlUsername, sqlPassword);

			// Empower connection reference variable to execute quary
			statement = connection.createStatement();
			
			// Execute the query
			
			resultSet = statement.executeQuery(sqlQuery);
			
			while (resultSet.next()) {
			String ColumnValue	=resultSet.getString (columnName);
				
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (resultSet!=null) { 
			
			}
		}

		return null;
	}

}
