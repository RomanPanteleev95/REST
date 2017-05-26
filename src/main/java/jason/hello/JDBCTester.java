package jason.hello;

import java.sql.*;

public class JDBCTester {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/TestGreeting", "postgres", "123456");
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery("select * from users");
        while (result.next())
            System.out.println(result.getInt("id") + " " + result.getString("name"));

        PreparedStatement preparedStatement = connection.prepareStatement("select * from greeting where id > ?");
        preparedStatement.setInt(1, 3);

        result = preparedStatement.executeQuery();
        while (result.next())
            System.out.println(result.getInt("id") + " " + result.getString("content"));


    }
}
