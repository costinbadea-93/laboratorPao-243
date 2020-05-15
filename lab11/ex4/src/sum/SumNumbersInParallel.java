package sum;

public class SumNumbersInParallel extends Thread{

    int [] arr;
    int sum = 0;

    public SumNumbersInParallel(int [] arr) {
        this.arr = arr;
    }

    public SumNumbersInParallel(){}

    @Override
    public void run() {
        sumElements(arr);
    }

    public int sumElements(int [] arr) {
        for(int i : arr) {
            sum +=i;
        }

        return sum;
    }

    public int getSum() {
        return sum;
    }
}
