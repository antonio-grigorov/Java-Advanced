package src.OOP.Polymorphism.Shape;

public abstract class Shape {

    private Double perimeter;
    private Double area;

    protected abstract Double calculatePerimeter();

    protected abstract Double calculateArea();

    public Double getArea() {
        if(this.area==null){
            this.area=calculateArea();
        }
        return this.area;
    }

    public Double getPerimeter() {
        if(this.perimeter==null){
            this.perimeter=this.calculatePerimeter();
        }
        return this.perimeter;
    }
}
