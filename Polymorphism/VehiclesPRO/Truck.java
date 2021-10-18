package src.OOP.Polymorphism.VehiclesPRO;

public class Truck extends Vehicle {
    private static final double AIR_CONDITION_CONS=1.6;

    public Truck(double fuel, double fuelConsumption,double capacity) {
        super(fuel, fuelConsumption+AIR_CONDITION_CONS, capacity);
    }

    @Override
    public void refuel(double quantity) {
        super.refuel(quantity * 0.95);
    }

    @Override
    public String drive(double distance){
        return "Truck" + super.drive(distance);
    }
    @Override
    public String toString(){
        return "Truck" + super.toString();
    }
}
