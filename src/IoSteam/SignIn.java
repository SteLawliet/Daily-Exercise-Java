package IoSteam;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * Created by Stelawliet on 17/9/22.
 */
public class SignIn {
    public static File file = new File("users.txt");
    public static void in(String name,String pass){
        if(!file.exists()){
            System.out.println("please signIn");
        }
        String names = name;
        String passs = pass;
        Properties properties = new Properties();
        int i = 1;
        try {
            properties.load(new FileReader(file));

            System.out.println(properties);
            if(properties.containsKey(names)&&properties.getProperty(names).equals(passs)) {
                    System.out.println(names + ":" + "SignIn success");
            }else {
                System.out.println(names + ":" + "password is not right");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
