package circle;

import point.Point;

public class Circle {
    private Point center;
    private Point circumference;

    public Point getCenter() {
        return center;
    }

    public Point getCircumference() {
        return circumference;
    }

    public Circle(){
        //Randomly select origin and center
        this.center = new Point();
        this.circumference = new Point();
    }

    public double getRadius(){
        return this.center.getDistance(this.circumference);
    }

    public boolean isInside(Circle other){
        double distanceBetweenCenter = this.center.getDistance(other.getCenter());
        double diffRadius = other.getRadius() - this.getRadius();

        return (diffRadius >= distanceBetweenCenter);
    }
}
