package service;

public class CalculatorServiceImp extends CalculatorService {
    @Override
    public int sum(int[] myArray) {
        int sum = 0;
        for (int i : myArray) {
            sum += i;
        }
        return sum;
    }

    @Override
    public int multiply(int[] myArray) {
        int prod = 1;
        for (int i : myArray) {
            prod *= i;
        }
        return prod;
    }
}
