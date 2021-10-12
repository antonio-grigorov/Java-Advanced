package src.OOP.Polymorphism.Animals;

import src.OOP.Polymorphism.Animals.Animal;

public class Cat extends Animal {


    public Cat(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        return super.explainBase();
    }
}
