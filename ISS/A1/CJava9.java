import com.fasterxml.jackson.databind.*;

public class CJava9 {
    public static void main(String[] args) {
        String json = "{\"name\":\"Tom\", \"age\":65,\"email\":\"tom@xyz.co\",, \"city\":\"New Delhi\"}";
        String name, city, email;
        int age;
        ObjectMapper objectMapper;
        JsonNode jsonDataNode;
        try {
            objectMapper = new ObjectMapper();
            jsonDataNode = objectMapper.readTree(json);
            // get & convert json value as text
            name = jsonDataNode.get("name").asText();
            age = jsonDataNode.get("age").asInt();
            city = jsonDataNode.get("city").asText();
            email = jsonDataNode.get("email").asText();
            // print
            System.out.println("Name =  " + name);
            System.out.println("Age =  " + age);
            System.out.println("Email = " + email);
            System.out.println("City = " + city);
        } catch (Exception e) {
            System.out.println("Error reading the JSON file as " + e.getMessage());
        }
    }
}