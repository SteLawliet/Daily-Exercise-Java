package IoSteam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

/**
 * Created by Stelawliet on 17/9/23.
 */
public class SignSet {
    private String name;
    private String pass;
    public static File file = new File("users.txt");
    SignSet(String name,String pass){
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println(".......txt");
            }
        }
        this.name = name;
        this.pass = pass;

    }
    public void load(){
        try {
            Properties properties = new Properties();
            properties.load(new FileReader(file));
            if(!properties.containsKey(this.name))
            {
                properties.setProperty(this.name,this.pass);
                properties.store(new FileWriter(file),"users");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
