import sum.MyCallable;
import sum.SumNumbersInParallel;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[200];

        for(int i = 0 ; i < arr.length ; i++) {
            arr[i] = i * 10;
        }
        System.out.println(Arrays.toString(arr));

        long st1 = System.nanoTime();
        SumNumbersInParallel t1 = new SumNumbersInParallel(Arrays.copyOfRange(arr,0,100));
        SumNumbersInParallel t2 = new SumNumbersInParallel(Arrays.copyOfRange(arr,100,200));

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        long st2 = System.nanoTime();
        System.out.println("Suma prin Threads : " + (t1.getSum() + t2.getSum()) + " Time: " + (st2-st1));
        long st3 = System.nanoTime();
        int sumNotInParallel = new SumNumbersInParallel().sumElements(arr);
        long st4 = System.nanoTime();
        System.out.println("Suma fara Threads : " + new SumNumbersInParallel().sumElements(arr) + " Time: " + (st4-st3));


        System.out.println("===========================================================================");
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        MyCallable m1 = new MyCallable(Arrays.copyOfRange(arr,0,100));
        MyCallable m2 = new MyCallable(Arrays.copyOfRange(arr,100,200));

        List<Future<Integer>> ftResult = executorService.invokeAll(Arrays.asList(m1,m2));
        int callableSum = ftResult.stream()
                .mapToInt(result -> {
                    try {
                        return result.get();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                    throw new RuntimeException("Error on calculation!!!");
                }).sum();

        System.out.println("Result from callable: " + callableSum);

    }
}
