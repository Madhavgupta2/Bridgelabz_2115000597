import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountCSVRows {
    public static void main(String[] args) {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("students.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                count++;
            }
            System.out.println("Number of rows: " + (count - 1));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
