package XML.DOM4J;


import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Iterator;

/**
 * Created by Stelawliet on 17/10/7.
 */
public class Dom4j {
    public static void main(String[] args) throws Exception {
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File("s.xml"));
        Element rootElement = document.getRootElement();
        Element element = rootElement.element("student2");
        rootElement.remove(element);
//        Element element2 = RootElement.addElement("student").addAttribute("name","yxq");
//        element2.addElement("id").addText("004");
//        element2.addElement("sex").addText("female");
        Iterator<Element> elementIterator = rootElement.elementIterator("student");
        for (; elementIterator.hasNext();){
            Element student = elementIterator.next();

            String name = student.attributeValue("name");
           String id =  student.elementText("id");
            String sex = student.elementText("sex");

            System.out.println("name :" + name +" id :" + id + " sex :"+sex);
        }

        //System.out.println(document.asXML());

        OutputFormat format = OutputFormat.createPrettyPrint();
        String s = format.getEncoding();
        System.out.println(s);
        format.setEncoding("gbk");
        XMLWriter writer = new XMLWriter
                (new OutputStreamWriter(new FileOutputStream(new File("TXT/s_s.xml")))
                        , format);
        writer.write(document);
        writer.flush();
        writer.close();

    }
}
