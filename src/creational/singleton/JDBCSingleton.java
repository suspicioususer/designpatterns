package creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCSingleton {

	private static JDBCSingleton jdbc;

	private JDBCSingleton() {

	}

	public static JDBCSingleton getInstance() {
		if (jdbc == null) {
			jdbc = new JDBCSingleton();
		}
		return jdbc;
	}

	private static Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection connection = null;
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/databaseName", "root", "password");
		return connection;
	}

	public int insert(String name, String password) throws SQLException {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int recordCounter = 0;

		try {
			connection = getConnection();
			preparedStatement = connection.prepareStatement("insert into userdata(uname, upassword) values(?, ?)");
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, password);
			recordCounter = preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (connection != null) {
				connection.close();
			}
		}
		return recordCounter;
	}

	public void view(String name) throws SQLException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			connection = getConnection();
			preparedStatement = connection.prepareStatement("select * from userdata where uname = ?");
			preparedStatement.setString(1, name);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println("Name= " + resultSet.getString(2) + "\t" + "Paasword= " + resultSet.getString(3));

			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (resultSet != null) {
				resultSet.close();
			}

			if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (connection != null) {
				connection.close();
			}
		}
	}

	public int update(String name, String password) throws SQLException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int recordCounter = 0;

		try {
			connection = getConnection();
			preparedStatement = connection
					.prepareStatement("update userdata set upassword = ? where uname = '" + name + "' ");
			preparedStatement.setString(1, password);
			recordCounter = preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (connection != null) {
				connection.close();
			}
		}
		return recordCounter;
	}

	public int delete(int userID) throws SQLException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int recordCounter = 0;

		try {
			connection = getConnection();
			preparedStatement = connection.prepareStatement("delete from userdata where uid='" + userID + "' ");
			recordCounter = preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (connection != null) {
				connection.close();
			}
		}
		return recordCounter;
	}
}
