package src.OOP.Polymorphism.VehiclesPRO;

public class Bus extends Vehicle{


    protected Bus(double fuel, double fuelConsumption, double capacity) {
        super(fuel, fuelConsumption, capacity);
    }

    @Override
    public String drive(double distance){
        return "Bus" + super.drive(distance);
    }


    public String driveWithPassenger(double distance){
        super.increaseConsumption(1.4);
        String result=this.drive(distance);
        super.decreaseConsumption(1.4);
        return result;
    }

    @Override
    public String toString(){
        return "Bus" + super.toString();
    }
}
