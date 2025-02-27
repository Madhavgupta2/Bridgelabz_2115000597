import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class MergeJSONObjects {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        
        String json1 = "{\"name\":\"John\", \"age\": 25}";
        String json2 = "{\"email\":\"john@example.com\", \"address\":\"123 Street\"}";
        
        JsonNode node1 = objectMapper.readTree(json1);
        JsonNode node2 = objectMapper.readTree(json2);
        
        JsonNode merged = node1.deepCopy();
        ((ObjectNode) merged).setAll((ObjectNode) node2);
        
        System.out.println(merged.toString());
    }
}
