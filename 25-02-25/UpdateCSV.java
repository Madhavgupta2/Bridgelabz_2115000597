import java.io.*;
import java.util.*;

public class UpdateCSV {
    public static void main(String[] args) throws IOException {
        List<String[]> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("employees.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[2].equals("IT")) {
                    data[3] = String.valueOf(Double.parseDouble(data[3]) * 1.1);
                }
                records.add(data);
            }
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("updated_employees.csv"))) {
            for (String[] record : records) {
                bw.write(String.join(",", record) + "\n");
            }
        }
    }
}
