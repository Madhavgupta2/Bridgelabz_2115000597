import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class MergeJSONFiles {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        
        JsonNode file1 = objectMapper.readTree(new File("file1.json"));
        JsonNode file2 = objectMapper.readTree(new File("file2.json"));
        
        ((ObjectNode) file1).setAll((ObjectNode) file2);
        
        System.out.println(file1.toString());
    }
}
