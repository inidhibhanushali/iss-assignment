//XML parser
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.parsers.*;
import java.io.IOException;

public class CJava10 {
    public static void main(String[] args) {
        System.out.println("XML file parsing");
        String xmlFile = "data.xml";
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse(xmlFile);//parsing XML file
            Element rootElement = document.getDocumentElement();//get root element
            //printing the root element name
            System.out.println("Root element = " + rootElement.getNodeName());

            //getting child elements
            NodeList nodeList = rootElement.getChildNodes();
            Node node;
            
            for (int i = 0; i < nodeList.getLength(); i++) {
                node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String tagName = element.getTagName();
                    String tagValue = element.getTextContent();
                    System.out.println(tagName + " = " + tagValue);
                }
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
