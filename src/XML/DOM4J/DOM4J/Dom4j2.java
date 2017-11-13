package XML.DOM4J.DOM4J;


import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.dom4j.tree.DefaultDocument;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Stelawliet on 17/10/8.
 */
public class Dom4j2 {
    public static void main(String[] args) throws IOException {
        Document document = new DefaultDocument();
        document.addElement("students");
        Element root = document.getRootElement();
        Element element0 = root.addElement("student").addAttribute("name","zzq");
        element0.addElement("id").addText("001");
        element0.addElement("sex").addText("male");
        XMLWriter xmlWriter = new XMLWriter(new FileOutputStream(new File("copy-.xml")), OutputFormat.createPrettyPrint());
        xmlWriter.write(document);
        xmlWriter.flush();
        xmlWriter.close();
    }
}
