package src.OOP.Polymorphism.WildFarm;

public class Tiger extends Felime {

    public Tiger(String name, String type, Double weight, String livingRegion) {
        super(name, type, weight, livingRegion);
    }

    @Override
    public void eat(Food food){
        if(!food.getType().equals("Meat")){
            throw new IllegalStateException("Tigers are not eating that type of food!");
        }
        this.incrementFood(food.getQuantity());
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!");
    }

    @Override
    public String toString() {
        return "Tiger" + super.toString();
    }
}
