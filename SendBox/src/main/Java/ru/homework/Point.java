package ru.homework;

/**
 * Created by Вася on 13.02.2017.
 */
public class Point {

    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point P2) {
        double d;
        d = Math.sqrt((this.x - P2.x) * (this.x - P2.x) + (this.y - P2.y) * (this.y - P2.y));
        return d;

    }

}

