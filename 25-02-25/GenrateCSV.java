import java.io.*;
import java.sql.*;

public class GenerateCSV {
    public static void main(String[] args) throws SQLException, IOException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "username", "password");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT employee_id, name, department, salary FROM employees");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("employee_report.csv"))) {
            writer.write("Employee ID, Name, Department, Salary\n");
            while (rs.next()) {
                writer.write(rs.getInt("employee_id") + "," +
                             rs.getString("name") + "," +
                             rs.getString("department") + "," +
                             rs.getDouble("salary") + "\n");
            }
        }
        conn.close();
    }
}
