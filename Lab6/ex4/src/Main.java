import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.APPEND;

public class Main {
    public static void main(String[] args) {
        //method1
//        System.out.println("===============method1=================");
        String filePath = "C:\\Users\\cbadea\\OneDrive - ENDAVA\\Desktop\\Lab Pao\\Lab6\\ex4\\src\\data.txt";
//        //try with resources
//        try (Scanner scanner = new Scanner(new File(filePath))) {
//            while (scanner.hasNext()) {
//                System.out.println(scanner.nextLine());
//            }
//        } catch (FileNotFoundException ex) {
//            ex.printStackTrace();
//        }
//
//        //method2
//        System.out.println("===============method2=================");
//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//
//        //method3
//        System.out.println("===============method3=================");
//        int i;
//        try (FileReader fileReader = new FileReader(filePath)) {
//            while ((i = fileReader.read()) != -1) {
//                System.out.print((char) i);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        //method4
//        System.out.println("===============method4=================");
//        int j;
//        try (RandomAccessFile randomAccessFile = new RandomAccessFile(filePath, "rw")) {
//            while ((j = randomAccessFile.read()) != -1) {
//                System.out.print((char) j);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        //method5
//        int k;
//        System.out.println("===============method5=================");
//        try(FileInputStream fileInputStream = new FileInputStream(new File(filePath))){
//            while ((k = fileInputStream.read()) != -1) {
//                System.out.print((char) k);
//            }
//        }catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        //method6
//        System.out.println("===============method6=================");
//        try{
//            Files.lines(Paths.get(filePath)).forEach(System.out::println);
//        }catch (IOException e) {
//            e.printStackTrace();
//        }

        String line = "Adding a new line!!!";

        //method1
//        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true))){
//            bufferedWriter.write("\n");
//            bufferedWriter.write(line);
//       }catch (IOException e) {
//           e.printStackTrace();
//       }

        //method2
//      try(FileWriter fileWriter = new FileWriter(filePath, true)){
//          fileWriter.write("\n");
//          fileWriter.write(line);
//      }catch (IOException e) {
//          e.printStackTrace();
//      }
      //method3
//        try(RandomAccessFile randomAccessFile = new RandomAccessFile(filePath,"rw")){
//            File file = new File(filePath);
//            randomAccessFile.seek(file.length());
//            randomAccessFile.write("\n".getBytes());
//            randomAccessFile.write(line.getBytes());
//        }catch (IOException e) {
//            e.printStackTrace();
//        }
        //method4
//        try(FileOutputStream fileOutputStream = new FileOutputStream(new File(filePath),true)) {
//            fileOutputStream.write("\n".getBytes());
//            fileOutputStream.write(line.getBytes());
//        }catch (IOException e) {
//            e.printStackTrace();
//        }
//
        //method5
        try{
            Files.write(Paths.get(filePath),("\n" + line).getBytes(),APPEND);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
