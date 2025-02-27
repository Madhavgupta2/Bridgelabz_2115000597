import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SearchCSV {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("employees.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[1].equalsIgnoreCase("John")) {
                    System.out.println("Department: " + data[2] + ", Salary: " + data[3]);
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
