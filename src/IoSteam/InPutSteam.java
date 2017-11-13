package IoSteam;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Stelawliet on 17/9/19.
 */
public class InPutSteam {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fileOutputStream = new FileOutputStream("b.txt");
//        byte[] bytes;
//        String s = " ";
//        bytes = s.getBytes();
//        fileOutputStream.write(bytes);
//
//        File file = new File("a.txt");
//        FileInputStream fileInputStream = new FileInputStream(file);
//        int i;
//        while ((i = fileInputStream.read()) != -1){
//
//            fileOutputStream.write(i);
//            System.out.print(i);
//        }
//        fileInputStream.close();
//        fileOutputStream.close();

        BufferedInputStream fi = new BufferedInputStream(new FileInputStream("a.txt"));
        BufferedOutputStream fo = new BufferedOutputStream(new FileOutputStream("c.txt"));

        byte[] bytes1 = new byte[1024];
        int len = 0;
        while ((len = fi.read(bytes1))!=-1)
//        while ((len = fi.read(bytes1))!=-1){
//            fo.write(bytes1,0,len);
//            System.out.print(new String(bytes1 ,0,len ));
//        }
        fo.close();
        fi.close();



    }
}
