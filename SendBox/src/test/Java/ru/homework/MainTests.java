package ru.homework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTests {
        @Test
        public void testMain() {
                Point P1 = new Point(0, 1);
                Point P2 = new Point(1, 1);

                Assert.assertEquals(P1.distance(P2), 1.0);

        }
}
