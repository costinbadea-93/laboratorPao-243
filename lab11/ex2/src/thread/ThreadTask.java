package thread;

public class ThreadTask extends Thread{

    @Override
    public void run() {
       iterate();
    }

    public void iterate() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        }
    }

//    public synchronized void iterate() {
//            for (int i = 0; i < 10; i++) {
//                System.out.println(i);
//            }
//    }
}
