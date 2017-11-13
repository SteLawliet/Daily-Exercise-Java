package StudentThread;

import java.io.File;
import java.util.TimerTask;

/**
 * Created by Stelawliet on 17/9/25.
 */
public class myTimeTask extends TimerTask {
    private File srcFile = null;

    protected myTimeTask(File file) {
        this.srcFile = file;
    }

    @Override
    public void run() {
        del(this.srcFile);
    }

    private void del(File srcFile) {

        File[] files = srcFile.listFiles();
        for (File file0 : files) {
            if (file0.isDirectory()) {
                del(file0);

            } else {

                System.out.println(file0.getName() + ":del ");

            }
        }
        System.out.println(srcFile.getName() + ":del ");
    }
}
