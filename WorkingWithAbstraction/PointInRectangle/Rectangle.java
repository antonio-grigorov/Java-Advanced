package src.WorkingWithAbstraction.PointInRectangle;

public class Rectangle {


        private Point bottomLeft;
        private Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public boolean contains(Point point){
        boolean withinX = bottomLeft.getX() <= point.getX()
                && point.getX() <= topRight.getX();
        boolean withinY = bottomLeft.getY() <= point.getY()
                && point.getY() <= topRight.getY();
        return withinX && withinY;




    }



}

