package src.OOP.Polymorphism.Shape.Main;

import src.OOP.Polymorphism.Shape.Circle;
import src.OOP.Polymorphism.Shape.Rectangle;
import src.OOP.Polymorphism.Shape.Shape;

public class Main {
    public static void main(String[] args) {


        Shape rectangle = new Rectangle(3.0, 5.0);
        Shape circle = new Circle( 5.0);


        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
    }
}