package ru.homework;

public class Main {
    public static void main(String[] args) {
        Point P1 = new Point(0, 1);
        Point P2 = new Point(1, 1);

       /* P1.x = 0;
        P1.y = 1;
        P2.x = 5;
        P2.y = 3;
       */

        System.out.println( "Расстояние между двумя точками" + " = " + P1.distance(P2));

    }

   /* public static double distance(Point P1, Point P2){

        return Math.sqrt((P1.x - P2.x)*(P1.x - P2.x) + (P1.y - P2.y)*(P1.y - P2.y));

    }*/
}
