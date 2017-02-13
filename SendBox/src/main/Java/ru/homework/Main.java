package ru.homework;

public class Main {
    public static void main(String[] args) {
        Point P1 = new Point();
        Point P2 = new Point();

        P1.x = 0;
        P1.y = 1;
        P2.x = 5;
        P2.y = 3;
        distance(P1, P2);
        System.out.println( "Расстояние между двумя точками" + " = " + distance(P1, P2));

    }

    public static double distance(Point P1, Point P2){

        return Math.sqrt((P1.x - P2.x)*(P1.x - P2.x) + (P1.y - P2.y)*(P1.y - P2.y));

    }
}
