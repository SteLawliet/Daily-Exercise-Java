package Sign;


import java.util.Properties;
import java.util.Set;

import Sign.impl.SignIn;

/**
 * Created by Stelawliet on 17/9/24.
 */
public class Management {

    public static void Show(){
        SignIn signin = new SignIn();
        Properties p = signin.getProperties();
        Set<String> set = p.stringPropertyNames();
        for (String s: set
             ) {
            System.out.println(s+"------"+p.getProperty(s));
        }
    }

}
