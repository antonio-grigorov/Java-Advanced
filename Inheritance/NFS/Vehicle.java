package src.OOP.Inheritance.NFS;

public class Vehicle {
    private static final double DEFAULT_FUEL_CONSUMPTION = 1.25;
    private double fuelComsumption;
    private double fuel;
    private int horsePower;

    public Vehicle(double fuel, int horsePower) {
        fuelComsumption = DEFAULT_FUEL_CONSUMPTION;
    }

    public void drive(double kilometres) {
        double fuelNeeded = kilometres * fuelComsumption;
        if (fuelNeeded <= fuel) {
            fuel -= fuelNeeded;
        }
    }

    public static double getDefaultFuelConsumption() {
        return DEFAULT_FUEL_CONSUMPTION;
    }

    public double getFuelComsumption() {
        return fuelComsumption;
    }

    public void setFuelComsumption(double fuelComsumption) {
        this.fuelComsumption = fuelComsumption;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
