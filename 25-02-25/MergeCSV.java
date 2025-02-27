import java.io.*;
import java.util.*;

public class MergeCSV {
    public static void main(String[] args) throws IOException {
        Map<Integer, String[]> students1 = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader("students1.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                students1.put(Integer.parseInt(data[0]), data);
            }
        }

        try (BufferedReader br = new BufferedReader(new FileReader("students2.csv"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("merged_students.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                if (students1.containsKey(id)) {
                    bw.write(String.join(",", students1.get(id)) + "," + data[1] + "," + data[2] + "\n");
                }
            }
        }
    }
}
