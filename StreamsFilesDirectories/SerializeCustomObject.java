package StreamsFilesDirecories;

import java.io.*;
import java.util.ArrayList;

public class SerializeCustomObject {


    public static class Course implements Serializable{
        private String name;
        private int students;

        public Course(String name, int students) {
            this.name = name;
            this.students = students;
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Course course = new Course("Java-Advanced", 100000);

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("SCO.ser"));

        outputStream.writeObject(course);

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("SCO.ser"));

        Course courseTwo = (Course) inputStream.readObject();

        System.out.println(courseTwo.name);
        System.out.println(courseTwo.students);
    }
}
