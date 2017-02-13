package ru.homework;

public class Point {
    public static void main(String[] args) {

        double x1 = 0;
        double y1 = 1;
        double x2 = 5;
        double y2 = 3;
        distance( x1,  y1,  x2,  y2);
        System.out.println( "Расстояние между двумя точками" + " = " + distance(x1, y1, x2, y2));

    }

    public static double distance(double x1, double y1, double x2, double y2){
     double d = 0;
     d = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
     return d;
    }
}
