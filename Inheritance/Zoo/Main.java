package src.OOP.Inheritance.Zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals=new ArrayList<>();

        animals.add(new Snake("Python"));
        animals.add(new Lizard("Black"));
        animals.add(new Gorilla("King Kong"));
        animals.add(new Bear("Winnie"));

        for (Animal animal : animals) {
            animal.feedAnimal();
        }




    }
}
