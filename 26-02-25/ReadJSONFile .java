import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ReadJSONFile {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = objectMapper.readTree(new File("users.json"));

        String name = rootNode.path("name").asText();
        String email = rootNode.path("email").asText();
        
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}
