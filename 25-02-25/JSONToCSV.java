import com.fasterxml.jackson.databind.*;
import java.io.*;
import java.util.*;

public class JSONToCSV {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Student> students = Arrays.asList(objectMapper.readValue(new File("students.json"), Student[].class));
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("students.csv"))) {
            writer.write("ID, Name, Age, Marks\n");
            for (Student student : students) {
                writer.write(student.getId() + "," + student.getName() + "," + student.getAge() + "," + student.getMarks() + "\n");
            }
        }
    }
}

class Student {
    private int id;
    private String name;
    private int age;
    private int marks;

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public int getMarks() { return marks; }
}
