package ru.homework;
import org.testng.Assert;
import org.testng.annotations.Test;



public class MainTests2 {
    @Test
    public void testMain() {
        Point P1 = new Point(0, 1);
        Point P2 = new Point(3, 1);

        Assert.assertEquals(P1.distance(P2), 3.0);

    }
}