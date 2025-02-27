import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.IOException;

public class ValidateJSONStructure {
    public static void main(String[] args) throws IOException {
        String json = "{\"name\":\"John\", \"age\": 20}";
        
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(json);
        
        if (jsonNode.has("name") && jsonNode.has("age")) {
            System.out.println("Valid JSON structure");
        } else {
            System.out.println("Invalid JSON structure");
        }
    }
}
