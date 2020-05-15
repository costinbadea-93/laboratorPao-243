package sum;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    int [] arr;
    int sum = 0;

    public MyCallable(int [] arr ){
        this.arr = arr;
    }

    @Override
    public Integer call() throws Exception {
        return sumElements(arr);
    }


    public int sumElements(int [] arr) {
        for(int i : arr) {
            sum +=i;
        }

        return sum;
    }
}
