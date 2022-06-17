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

		// set the properties of muSQL, for this we need to call the driver
		// class.forname
		try {
			// set the properties of muSQL, for this we need to call the
			// driver----class.forname
			Class.forName("com.mysql.cj.jdbc.Driver");
			String sqlUrl = "jdbc:mysql://localhost:3306/dec2021";
			String sqlUsername = "root";
			String sqlPassword = "root";
			String sqlQuery = "Select * from users;";
			// create a connection to the local database
			connection = DriverManager.getConnection(sqlUrl, sqlUsername, sqlPassword);

			// Empower the connection reference variable to execute queries
			statement = connection.createStatement();

			// Deliver the query
			resultSet = statement.executeQuery(sqlQuery);
			
			//while loop; while condition is true, then do something
			while(resultSet.next()) {
			return columnValue = resultSet.getString(columnName);
				
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		if(connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		return columnValue;

	}
}
	
		

