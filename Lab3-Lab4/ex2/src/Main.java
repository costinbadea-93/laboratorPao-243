import helper.DataHelper;
import service.CalculatorServiceImp;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception{
        DataHelper dataHelper = new DataHelper();
        int [] data = dataHelper.getDataAsArray();
        CalculatorServiceImp calculatorServiceImp = new CalculatorServiceImp();

        System.out.println("Suma elementelor din fisier :" + calculatorServiceImp.sum(data));
        System.out.println("Produsul elementelor din fisier :" + calculatorServiceImp.multiply(data));
    }
}
