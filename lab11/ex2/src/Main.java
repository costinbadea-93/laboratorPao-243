import thread.ThreadTask;

public class Main  {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new ThreadTask();
        Thread t2 = new ThreadTask();

        t1.start();
//        t1.join();
        t2.start();
    }
}
