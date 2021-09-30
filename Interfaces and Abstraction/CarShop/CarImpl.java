package src.CarShop;

public class CarImpl implements Car {

    private final String model;
    private String color;
    private Integer horsePower;
    private String countryProduced;

    private static final long serialVersionUTD = 1L;

    public CarImpl(String model,
                String color,
                Integer horsePower,
                String countryProduced) {
        this.model=model;
        this.color = color;
        this.horsePower=horsePower;
        this.countryProduced=color;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Integer getHorsePower() {
        return this.horsePower;
    }

    @Override
    public String countryProduced() {
        return this.countryProduced;
    }

    @Override
    public String toString(){
        return String.format("This is %s produced in %s and have %d tires",
                this.getModel(),this.countryProduced,Car.TIRES);
    }
}
