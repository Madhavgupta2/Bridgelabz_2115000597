import com.github.fge.jsonschema.core.exceptionsProcessingException;
import com.github.fge.jsonschema.core.utils.JsonLoader;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;

import java.io.IOException;

public class ValidateEmailJSONSchema {
    public static void main(String[] args) throws IOException, ProcessingException {
        String schema = "{\n" +
                "  \"$schema\": \"http://json-schema.org/draft-04/schema#\",\n" +
                "  \"type\": \"object\",\n" +
                "  \"properties\": {\n" +
                "    \"email\": { \"type\": \"string\", \"format\": \"email\" }\n" +
                "  },\n" +
                "  \"required\": [\"email\"]\n" +
                "}";
        
        JsonNode schemaNode = JsonLoader.fromString(schema);
        JsonSchema jsonSchema = JsonSchemaFactory.byDefault().getJsonSchema(schemaNode);
        
        String json = "{\"email\": \"test@example.com\"}";
        JsonNode jsonNode = JsonLoader.fromString(json);
        
        ProcessingReport report = jsonSchema.validate(jsonNode);
        
        System.out.println(report.isSuccess());
    }
}
