package src.OOP.Polymorphism.WildFarm;

public abstract class Food {
    private int quantity;

    protected Food(int quantity){
        this.quantity=quantity;
    }

    public int getQuantity() {
        return quantity;
    }

   public abstract String getType();
}
