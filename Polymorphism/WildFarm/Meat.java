package src.OOP.Polymorphism.WildFarm;

public class Meat extends Food{
    protected Meat(int quantity) {
        super(quantity);
    }

    @Override
    public String getType() {
        return "Meat";
    }
}
