import model.DogSerializable;
import model.DogExternalizable;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath  = "C:\\Users\\cbadea\\OneDrive - ENDAVA\\Desktop\\Lab Pao\\lab9-lab10\\ex2\\src\\repo\\data.txt";

        List<DogSerializable> dogListSerializable = Arrays.asList(
            new DogSerializable("Catel1","rosu","15"),
            new DogSerializable("Catel2","alb","25")
        );

        List<DogExternalizable> dogListExternalizable = Arrays.asList(
                new DogExternalizable("Catel1","rosu","15"),
                new DogExternalizable("Catel2","alb","25")
        );

        try(FileInputStream fileInputStream = new FileInputStream(filePath);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)
        ){
            //scriere obiecte in fisier
            dogListExternalizable.forEach(dog -> {
                try {
                    objectOutputStream.writeObject(dog);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            //citire obiecte din fisier
           Object object;
           while ((object = objectInputStream.readObject()) != null){
               if(object instanceof DogExternalizable) {
                   System.out.println(object);
               }
           }

        }catch (IOException | ClassNotFoundException e){
            if( e instanceof EOFException){
                System.out.println("End of file reached!!!");
            }else {
                e.printStackTrace();
            }
        }
    }
}
