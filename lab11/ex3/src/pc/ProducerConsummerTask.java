package pc;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsummerTask {
    private List<Integer> integers = new ArrayList<>();
    int capacity = 5;


    public void produce() throws InterruptedException{
        int value = 0;
        while (true){
            synchronized (this){
                while(integers.size() == capacity){
                    wait();
                }

                integers.add(value ++);
                System.out.println("We produced task - " + value);
                notify();
                Thread.sleep(500);
            }
        }
    }

    public void consume() throws InterruptedException{
        while (true) {
            synchronized (this){
                while(integers.size() == 0){
                    wait();
                }
                int removedElement = integers.remove(0);
                System.out.println("We consumed task " + removedElement);
                notify();
                Thread.sleep(500);
            }
        }
    }
}
