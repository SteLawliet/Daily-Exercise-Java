package XML.DOM4J.DOM4J;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Stelawliet on 17/10/7.
 */
public class Dom4j1 {
    public static void main(String[] args) throws DocumentException, IOException {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(new File("test.xml"));
        Element root =
        document.getRootElement();
        String xpath ="//student[@name='yxq']";
        String xpath1 = "//student";

        Element element = (Element) document.selectSingleNode(xpath);
        root.remove(element);


        new XMLWriter(new FileOutputStream("test.xml"),OutputFormat.createPrettyPrint()).write(document);
    }
}
