import java.io.*;
import java.util.*;

public class SortCSV {
    public static void main(String[] args) throws IOException {
        List<String[]> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("employees.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                records.add(line.split(","));
            }
        }

        records.sort((a, b) -> Double.compare(Double.parseDouble(b[3]), Double.parseDouble(a[3])));

        for (int i = 0; i < 5; i++) {
            String[] record = records.get(i);
            System.out.println("ID: " + record[0] + ", Name: " + record[1] + ", Department: " + record[2] + ", Salary: " + record[3]);
        }
    }
}
