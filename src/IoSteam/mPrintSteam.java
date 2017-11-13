package IoSteam;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * Created by Stelawliet on 17/9/22.
 */
public class mPrintSteam {
    public static void main(String[] args) throws IOException {
        File file0 = new File("print.txt");
       if (!file0.exists()){
           file0.createNewFile();
       }
        BufferedReader br = new BufferedReader(new FileReader(file0));
        PrintWriter pw = new PrintWriter(new FileWriter("copy.txt"),true);
        String line = null;
        while ((line =br.readLine() )!=null){
            pw.println(line);
        }
        br.close();
        pw.close();

    }
}
