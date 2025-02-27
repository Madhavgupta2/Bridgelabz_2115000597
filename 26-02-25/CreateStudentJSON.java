import com.fasterxml.jackson.databind.ObjectMapper;

public class CreateStudentJSON {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        
        String studentJson = "{ \"name\": \"John\", \"age\": 20, \"subjects\": [\"Math\", \"Science\", \"History\"] }";
        
        Student student = objectMapper.readValue(studentJson, Student.class);
        System.out.println(objectMapper.writeValueAsString(student));
    }

    static class Student {
        public String name;
        public int age;
        public String[] subjects;
    }
}
