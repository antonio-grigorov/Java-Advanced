package src.OOP.Inheritance.NFS;

public class SportCar extends Car{
   final static double FUEL_CONSUMPTION=10;
    public SportCar(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelComsumption(FUEL_CONSUMPTION);
    }
}
