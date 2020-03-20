package helper;

import java.io.File;
import java.util.Scanner;

public class DataHelper {
    String filePath  =  "C:\\Users\\cbadea\\OneDrive - ENDAVA\\Desktop\\Lab Pao\\Lab3\\ex2\\src\\helper\\data.txt";

    public int [] getDataAsArray() throws Exception{
        Scanner scanner = new Scanner(new File(filePath));
        int [] dataArray = new int [0];
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            System.out.println(line);
            String [] splitData = line.split(",");
            for(String i : splitData) {
                dataArray = addFromLineToArray(dataArray,Integer.parseInt(i));
            }
        }
        return dataArray;
    }

    public int [] addFromLineToArray(int [] initialArray, int currentElement){
        int [] tmp = new int[initialArray.length + 1];
        System.arraycopy(initialArray,0, tmp,0,initialArray.length);
        tmp[tmp.length - 1] = currentElement;
        return tmp;
    }
}
