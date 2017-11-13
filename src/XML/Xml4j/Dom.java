package XML.Xml4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * Created by Stelawliet on 17/10/8.
 */

public class Dom {

    private File XmlFile;
    private String xmlName;
    private SAXReader saxReader = new SAXReader();
    private Document document;
    private XMLWriter xmlWriter;

    public Dom(String xmlName) {
        this.xmlName = xmlName;
        this.XmlFile =new File(xmlName);
        try {
            this.document =  saxReader.read(this.XmlFile);
            xmlWriter = new XMLWriter(new FileOutputStream(XmlFile),
                    OutputFormat.createPrettyPrint());
        } catch (DocumentException | FileNotFoundException
                | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public Dom(File xmlFile) {
        XmlFile = xmlFile;
        try {
            this.document =  saxReader.read(this.XmlFile);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    public File getXmlFile() {
        return XmlFile;
    }

    public void setXmlFile(File xmlFile) {
        XmlFile = xmlFile;
    }

    public String getXmlName() {
        return xmlName;
    }

    public void setXmlName(String xmlName) {
        this.xmlName = xmlName;
    }

    public void Save(){
      try {
          xmlWriter.write(document);
          xmlWriter.flush();
          xmlWriter.close();
      }catch (IOException e){
          e.printStackTrace();
      }
    }
}
