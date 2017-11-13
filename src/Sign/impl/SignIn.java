package Sign.impl;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import Sign.Users;
import Sign.Sign;
/**
 * Created by Stelawliet on 17/9/23.
 */
public class SignIn implements Sign {

    static {
        try { new File("users.txt").createNewFile();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private File file0 = new File("users.txt");
    private Properties properties = new Properties();

    public Properties getProperties(){
        try {
            properties.load(new FileReader(file0));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    @Override
    public void in(Users users) {

            Properties p = this.getProperties();

            if(!p.containsKey(users.getuName()))
            {
                p.setProperty(users.getuName(),users.getuPassword());
                try {
                    p.store(new FileWriter(file0),users.getuName());
                } catch (IOException e) {
                    System.out.println("Data writer false");
                }
            }

    }



    @Override
    public boolean up(Users users) {
        boolean right = false;
        if(!file0.exists()){
            System.out.println("please signIn");
        }

        Properties properties = this.getProperties();
        int i = 1;
        try {
            properties.load(new FileReader(file0));

            System.out.println(properties);
            if(properties.containsKey(users.getuName())&&properties.getProperty(users.getuName()).equals(users.getuPassword())) {
                System.out.println(users.getuName()+ ":" + "SignIn success");
                right = true;

            }else {
                right = false;
                System.out.println(users.getuName() + ":" + "password is not right");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return right;
    }

    @Override
    public void out(Users users) {

    }
    public void InSuccess(boolean r ){

    }
    public void UpSuccess(boolean r){

    }
}
