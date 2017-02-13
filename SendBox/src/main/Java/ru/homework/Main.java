package ru.homework;

public class Main {
    public static void main(String[] args) {
        Point P1 = new Point();
        Point P2 = new Point();

        double x1 = 0;
        double y1 = 1;
        double x2 = 5;
        double y2 = 3;
        distance( x1,  y1,  x2,  y2);
        System.out.println( "Расстояние между двумя точками" + " = " + distance(x1, y1, x2, y2));

    }

    public static double distance(Point P1, Point P2){
     double d = 0;
     d = Math.sqrt((P1.x - P2.x)*(P1.x - P2.x) + (P1.y - P2.y)*(P1.y - P2.y));
     return d;
    }
}
