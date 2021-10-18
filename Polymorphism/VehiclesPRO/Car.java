package src.OOP.Polymorphism.VehiclesPRO;

public class Car extends Vehicle {
    private static final double AIR_CONDITION_CONS=0.9;

    public Car(double fuel, double fuelConsumption, double capacity) {
        super(fuel, fuelConsumption+AIR_CONDITION_CONS, capacity);
    }

    @Override
    public String toString(){
        return "Car" + super.toString();
    }

    @Override
    public String drive(double distance){
        return "Car" + super.drive(distance);
    }
}
