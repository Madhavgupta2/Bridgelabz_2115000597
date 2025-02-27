import java.io.*;
import java.util.regex.*;

public class ValidateCSV {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("students.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (!Pattern.matches("[A-Za-z0-9+_.-]+@(.+)$", data[4]) || data[5].length() != 10) {
                    System.out.println("Invalid row: " + line);
                }
            }
        }
    }
}
