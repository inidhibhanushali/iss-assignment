import java.sql.*;

//JDBC
public class CJava11 {
    public static void main(String[] args) {
        // DB connection parameters
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "user";
        String password = "password";

        String sqlQuery;

        // JDBC objects
        Connection connection = null;
        Statement statement = null;
        ResultSet resultofQ = null;

        try {
            // Register the JDBC driver & Establish connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
            sqlQuery = "SELECT * FROM students";// SQL query
            resultofQ = statement.executeQuery(sqlQuery);

            while (resultofQ.next()) {
                int rollno = resultofQ.getInt("rollno");
                String name = resultofQ.getString("name");
                String marks = resultofQ.getString("marks");
                // print data from db
                System.out.println("Roll No: " + rollno);
                System.out.println("Name: " + name);
                System.out.println("Marks: " + marks);
                System.out.println("\n");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Error to load the JDBC driver - " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Database Connection error - " + e.getMessage());
        } finally {
            // Close the JDBC objects
            try {
                if (resultofQ != null)
                    resultofQ.close();
                if (statement != null)
                    statement.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                System.out.println("Error closing the JDBC objects: " + e.getMessage());
            }
        }
    }
}