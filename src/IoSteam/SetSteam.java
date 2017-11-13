package IoSteam;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;

/**
 * Created by Stelawliet on 17/9/22.
 */
public class SetSteam {
    public static void main(String[] args) throws IOException {
        File file = new File("print.txt");
        FileWriter fileWriter0 = new FileWriter(file);

        Properties properties0 = new Properties();
        properties0.setProperty("0","lawliet");
        properties0.setProperty("1","520");
        properties0.setProperty("2","2333");
        properties0.setProperty("3","2333");

        properties0.store(fileWriter0,"test");

        Properties properties1 = new Properties();
        properties1.load(new FileReader(file));
        System.out.println(properties1);
        String s = properties1.get("0").toString();
        System.out.println(s);



    }
}
