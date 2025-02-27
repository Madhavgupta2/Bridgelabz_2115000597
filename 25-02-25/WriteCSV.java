import java.io.FileWriter;
import java.io.IOException;

public class WriteCSV {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("employees.csv")) {
            writer.append("ID,Name,Department,Salary\n");
            writer.append("1,John,IT,5000\n");
            writer.append("2,Alice,HR,4000\n");
            writer.append("3,Bob,IT,6000\n");
            writer.append("4,Charlie,Sales,4500\n");
            writer.append("5,Dave,Finance,5500\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
