package src.OOP.Inheritance.NFS;

public class Car extends Vehicle {
    final static double FUEL_CONSUMPTION = 3;

    public Car(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelComsumption(FUEL_CONSUMPTION);
    }
}
