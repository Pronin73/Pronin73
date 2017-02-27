package ru.prog;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EquationTest {

    @Test
    public void test0() {
        Equiation e = new Equiation(1,1,1);
        Assert.assertEquals(e.rootNumber(), 0);
    }
    @Test
    public void test1() {
        Equiation e = new Equiation(1,2,1);
        Assert.assertEquals(e.rootNumber(), 1);
    }
    @Test
    public void test2() {
        Equiation e = new Equiation(1, 5, 6);
        Assert.assertEquals(e.rootNumber(), 2);
    }
    @Test
    public void testLinear() {
        Equiation e = new Equiation(0, 1, 1);
        Assert.assertEquals(e.rootNumber(), 1);
    }
    @Test
    public void testConstant() {
        Equiation e = new Equiation(0, 0, 1);
        Assert.assertEquals(e.rootNumber(), 0);
    }
    @Test
    public void testZero() {
        Equiation e = new Equiation(0, 0, 0);
        Assert.assertEquals(e.rootNumber(), -1);
    }
}
