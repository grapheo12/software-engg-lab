package point;

import java.util.Random;

public class Point {
    private double x;
    private double y;

    public Point(){
        Random rng = new Random();
        this.x = rng.nextDouble() * 200 - 100;
        this.y = rng.nextDouble() * 200 - 100;
        // rng returns in [0, 1] which is mapped to [-100, 100]
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getDistance(Point other){
        return Math.sqrt(
                (other.getX() - this.x) * (other.getX() - this.x) +
                (other.getY() - this.y) * (other.getY() - this.y)
        );
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


}
