import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class JSONToXML {
    public static void main(String[] args) throws Exception {
        String json = "{\"name\":\"John\", \"age\": 25}";
        
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode node = objectMapper.readTree(json);
        
        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(node);
        
        System.out.println(xml);
    }
}
