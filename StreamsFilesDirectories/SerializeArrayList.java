package StreamsFilesDirecories;

import java.io.*;
import java.util.ArrayList;



public class SerializeArrayList {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path="";

        ArrayList<Integer> numbers= new ArrayList<>();


        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("SAL.ser"));
        outputStream.writeObject(numbers);

        ObjectInputStream inputStream= new ObjectInputStream(new FileInputStream("SAL.ser"));

            ArrayList<Integer> numbersTwo=(ArrayList<Integer>) inputStream.readObject();

        for (int i = 0; i < numbersTwo.size(); i++) {
            System.out.println(numbersTwo.get(i));

        }
    }
}
