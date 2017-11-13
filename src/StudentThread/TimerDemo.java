package StudentThread;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Timer;

/**
 * Created by Stelawliet on 17/9/25.
 */
public class TimerDemo {
    public static void main(String[] args) {
        Timer timer = new Timer();
//        File[] files = new File("ggg").listFiles();
//        for (File f: files) {
//            System.out.println(f);
//        }
//        Show(new File("ggg"));
        timer.schedule(new myTimeTask(new File("TXT")),20);

    }

    public static void Show(File file) {
        File[] files = file.listFiles();

        for (File file0: files) {
            if (file0.isDirectory()){
                Show(file0);
            }else {
                System.out.println(file0.getAbsolutePath());
            }
        }
    }

//    public static void copy(File file) {
//        Path path =
//        Files.copy()
//    }
}
