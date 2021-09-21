package src.OOP.Inheritance.NFS;

public class RaceMotorcycle extends Motorcycle{

    final static double FUEL_CONSUMPTION=8;
    public RaceMotorcycle(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelComsumption(FUEL_CONSUMPTION);



    }
}
