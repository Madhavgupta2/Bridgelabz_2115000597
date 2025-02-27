import java.io.*;
import java.util.*;

public class DetectDuplicates {
    public static void main(String[] args) throws IOException {
        Set<String> seen = new HashSet<>();
        try (BufferedReader br = new BufferedReader(new FileReader("students.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (!seen.add(data[0])) {
                    System.out.println("Duplicate record: " + line);
                }
            }
        }
    }
}
