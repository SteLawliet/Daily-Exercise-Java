package IoSteam;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.zip.InflaterInputStream;

/**
 * Created by Stelawliet on 17/9/20.
 */
public class buffedIO {
    public static void main(String[] args) throws IOException{
//        myRead2("jdk6.chm","s.chm");
        myRead7();


    }

    private static void myRead(String r,String o) throws IOException {
        BufferedReader bufferedReader0 = new BufferedReader(new FileReader(r));
        BufferedWriter bufferedWriter0 = new BufferedWriter(new FileWriter(o));

        String line = null;
        while ((line = bufferedReader0.readLine() )!=null){
            System.out.println(line);
            bufferedWriter0.write(line);
            bufferedWriter0.newLine();
            bufferedWriter0.flush();

        }
        bufferedReader0.close();
        bufferedWriter0.close();
    }

    private static void myRead1(String r,String o) throws IOException {
        String s0 = "hello world!!";
        InputStreamReader inputStreamReader0 =
                new InputStreamReader(new FileInputStream(r),o);
        String encoding = inputStreamReader0.getEncoding();
        System.out.println(encoding);
        char[] chars = new char[1024];
        int l;
        while ( ( l = inputStreamReader0.read(chars))!= -1){
            System.out.print(new String(chars,0,l));
        }
        inputStreamReader0.close();

    }
    private static void myRead2(String r,String o) throws IOException {
        double start = System.currentTimeMillis();
        FileReader fileReader0 = new FileReader(r);
        FileWriter fileWriter0 = new FileWriter(o);

        char[] chars = new char[1024];
        int l;
        while ( (l = fileReader0.read(chars) ) != -1  ){
            fileWriter0.write(chars,0,l);
        }
        fileReader0.close();
        fileWriter0.close();
        double end =System.currentTimeMillis();
        double time = (end - start)/1000;
        System.out.println(time + "s");
    }

    private static void myRead3(String r,String o) throws IOException {
        double start = System.currentTimeMillis();
        BufferedInputStream bufferedInputStream0 =
                new BufferedInputStream(new FileInputStream(r));
        BufferedOutputStream bufferedOutputStream0 =
                new BufferedOutputStream(new FileOutputStream(o));

        byte [] bytes = new byte[1024];
        int l;
        while ((l= bufferedInputStream0.read(bytes))!=-1){
            bufferedOutputStream0.write(bytes,0,l);
        }
        bufferedInputStream0.close();
        bufferedOutputStream0.close();
        double end =System.currentTimeMillis();
        double time = (end - start)/1000;
        System.out.println(time + "s");
    }
    private static void myRead4(String r,String o) throws IOException {
        double start = System.currentTimeMillis();
        FileInputStream fileInputStream0 = new FileInputStream(r);
        FileOutputStream fileOutputStream0 = new FileOutputStream(o);

        byte[] bytes = new byte[1024];
        int l;
        while ( (l= fileInputStream0.read(bytes))!= -1  ){
            fileOutputStream0.write(bytes,0,l);
        }
        fileInputStream0.close();
        fileOutputStream0.close();
        double end =System.currentTimeMillis();
        double time = (end - start)/1000;
        System.out.println(time + "s");
    }
    private static void myRead5() throws IOException {
        BufferedWriter bufferedWriter0 = new BufferedWriter(new FileWriter(new File("\\Users\\zhaoziqi\\a.txt")));
        Scanner scanner0 = new Scanner(System.in);
        String [] strings =new String[4];
        for (int i =0 ; i < 4 ;i++) {
            System.out.println("please enter some strings:");
            strings[i] = scanner0.nextLine();
        }
        for (String s:strings) {
            bufferedWriter0.write(s);
            bufferedWriter0.newLine();
            bufferedWriter0.flush();
        }
        bufferedWriter0.close();


    }
    private static void myRead6() throws IOException {
        BufferedReader bufferedReader0 = new BufferedReader(new FileReader(".\\txt\\e.txt"));
        ArrayList<String> arrayList = new ArrayList<>();
        String l;
        while (( l =bufferedReader0.readLine()) != null){
            arrayList.add(l);
        }
        for (String s : arrayList) {
            System.out.println(s);

        }
    }
    private static void myRead7() throws IOException {

        File file0 = new File("/Users/zhaoziqi/Documents/Study/JAVA/IntelliJProject/S1");
        File file1 = new File(file0,"TXT");
        if (!file1.exists()){
            file1.mkdir();
        }
        File[] files =file0.listFiles(new FileFilter() {
            @Override
            public boolean accept(File name) {
                return name.getName().endsWith(".txt");
            }
        });
        int i = 0;
        for(File file : files){
            String name = String.valueOf(i)+".txt";
            System.out.println(file);
            copyFile(file,new File(file1,name));
            i++;
        }




        System.out.println(file0.getAbsolutePath());
    }

    private static void copyFile(File r,File o) throws IOException {
        BufferedInputStream bi = new BufferedInputStream(new FileInputStream(r));
        BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream(o));

        byte[] bytes = new byte[1024];
        int len;
        while (( len = bi.read(bytes))!=-1 ){
            bo.write(bytes,0,len);
        }
        bi.close();
        bo.close();
    }
}
