package src.OOP.Inheritance.Animals;

import java.util.Locale;

public class Tomcat extends Cat{
    private static final String GENDER=Gender.MALE.toString();
    public Tomcat(String name, int age) {
        super(name, age, GENDER);
    }
    @Override
    public String produceSound() {
        return "MEOW";
    }
}
