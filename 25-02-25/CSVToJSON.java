import com.fasterxml.jackson.databind.*;
import java.io.*;
import java.util.*;

public class CSVToJSON {
    public static void main(String[] args) throws IOException {
        List<Student> students = new ArrayList<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader("students.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (!data[0].equals("ID")) {
                    students.add(new Student(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3])));
                }
            }
        }

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("students.json"), students);
    }
}

class Student {
    private int id;
    private String name;
    private int age;
    private int marks;

    public Student(int id, String name, int age, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public int getMarks() { return marks; }
}
