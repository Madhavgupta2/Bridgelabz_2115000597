import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.sql.*;

public class GenerateJSONReportFromDB {
    public static void main(String[] args) throws SQLException, IOException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "username", "password");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT id, name, department FROM employees");
        
        ObjectMapper objectMapper = new ObjectMapper();
        while (rs.next()) {
            Employee employee = new Employee(rs.getInt("id"), rs.getString("name"), rs.getString("department"));
            String json = objectMapper.writeValueAsString(employee);
            System.out.println(json);
        }
    }

    static class Employee {
        public int id;
        public String name;
        public String department;

        public Employee(int id, String name, String department) {
            this.id = id;
            this.name = name;
            this.department = department;
        }
    }
}
