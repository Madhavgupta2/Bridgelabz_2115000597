import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class FilterJSON {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = objectMapper.readTree(new File("users.json"));
        
        for (JsonNode user : rootNode) {
            if (user.path("age").asInt() > 25) {
                System.out.println(user);
            }
        }
    }
}
