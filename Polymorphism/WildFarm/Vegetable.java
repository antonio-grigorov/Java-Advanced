package src.OOP.Polymorphism.WildFarm;

public class Vegetable extends Food{
    protected Vegetable(int quantity) {
        super(quantity);
    }

    @Override
    public String getType() {
        return "Vegetable";
    }
}
