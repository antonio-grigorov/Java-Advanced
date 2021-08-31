package src.Iterators.StrategyPattern;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

public class Person<Person>  {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }


}
