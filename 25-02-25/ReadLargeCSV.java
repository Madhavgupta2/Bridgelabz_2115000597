import java.io.*;

public class ReadLargeCSV {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("large_file.csv"))) {
            String line;
            int count = 0;
            while ((line = br.readLine()) != null) {
                count++;
                if (count % 100 == 0) {
                    System.out.println("Processed " + count + " records.");
                }
            }
        }
    }
}
