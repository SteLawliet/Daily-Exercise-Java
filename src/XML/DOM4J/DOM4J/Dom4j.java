package XML.DOM4J.DOM4J;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Stelawliet on 17/10/7.
 */
public class Dom4j {
    public static void main(String[] args) throws IOException, DocumentException {
        File file0 = new File("test.xml");
        SAXReader reader = new SAXReader();
        Document document = reader.read(file0);
       document.remove( document.getRootElement());
        document.addElement("students");
        Element root = document.getRootElement();
        Element element = root.addElement("student").addAttribute("name","zzq");
         element        .addElement("id").addText("001");
        Element element1 = root.addElement("student").addAttribute("name","lzy");
           element1     .addElement("id").addText("002");
        Element element2 = root.addElement("student").addAttribute("name","yxq");
          element2      .addElement("id").addText("003");
        element.addElement("sex").addText("male");
        element1.addElement("sex").addText("female");
        element2.addElement("sex").addText("female");

        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setEncoding("utf-8");
        XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("copy-.xml"),format);
        xmlWriter.write(document);
        xmlWriter.flush();
        xmlWriter.close();
    }
}
