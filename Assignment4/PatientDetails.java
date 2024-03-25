/*write a java program to display the patient id, name, problem 
and bill using JDBC connectivity with Oracle Database. */

import java.sql.*;

public class PatientDetails {

    public static void main(String[] args) {
        // Step 1: Allocate a Connection object
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");

            // Step 2: Allocate a Statement object
            Statement statement = connection.createStatement();

            // Step 3: Write a SQL query and execute the query
            String sql = "SELECT patient_id, name, problem, bill FROM patients";
            ResultSet resultSet = statement.executeQuery(sql);

            // Step 4: Process the query result
            while (resultSet.next()) {
                int patientId = resultSet.getInt("patient_id");
                String name = resultSet.getString("name");
                String problem = resultSet.getString("problem");
                double bill = resultSet.getDouble("bill");

                System.out.println("Patient ID: " + patientId);
                System.out.println("Name: " + name);
                System.out.println("Problem: " + problem);
                System.out.println("Bill: " + bill);
            }

            // Step 5: Close the Statement and Connection
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}