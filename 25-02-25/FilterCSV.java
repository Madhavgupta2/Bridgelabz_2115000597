import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilterCSV {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("students.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (Integer.parseInt(data[3]) > 80) {
                    System.out.println("ID: " + data[0] + ", Name: " + data[1] + ", Age: " + data[2] + ", Marks: " + data[3]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
