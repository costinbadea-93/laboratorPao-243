import runnable.MyRunnable;
import thread.MyThread;

public class Main {
    public static void main(String[] args) {

        Thread t1 = new MyThread();
        Runnable r1 = new MyRunnable();

        t1.start();
        r1.run();


        /**
         *  State New(start()) -> Running -> Terminated
         *                     -> [sleep(),suspend(),wait()] - Blocked  - [resume(), notify(), notifyAll()]  -> Running
         */

    }
}
