package src.OOP.Inheritance.RandomArrayList;

import java.util.Random;

public class Main {
    public static void main(String[] args) {


        RandomArrayList randomArrayList = new RandomArrayList(
                new Random());

        System.out.println(randomArrayList.getRandomElement());
    }
}
