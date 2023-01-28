package pl.workshops.intellij.debugger;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Debugger {

    public static final String str = "STR";

    public static Object obj = new Object();

    public static final Executor exec = Executors.newSingleThreadExecutor();

    public static void main(String[] args) {
        exec.execute(() -> {
            try {
                Thread.sleep(1000);
                System.out.println(obj);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        int j = 0;
        for (int i = 0; i < 10; i++) {
            j += i + 1;
            inside(j);
        }
        System.out.println(j);
    }

    static void inside(int j) {
        System.out.println("inside = " + j);
    }
}
