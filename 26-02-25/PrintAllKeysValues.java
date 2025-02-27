import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;

public class PrintAllKeysValues {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = objectMapper.readTree(new File("users.json"));

        Iterator<Entry<String, JsonNode>> fields = rootNode.fields();
        while (fields.hasNext()) {
            Entry<String, JsonNode> field = fields.next();
            System.out.println(field.getKey() + ": " + field.getValue());
        }
    }
}
