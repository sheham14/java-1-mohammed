package ca.nl.cna.sheham.assignments.Spring2024.review;

import org.junit.Assert;
import org.junit.Test;

public class TestClass {

    @Test
    public void circleTest(){
        Circle circle = new Circle(10.0);
        Assert.assertEquals("314.16", String.format("%.2f", circle.area()));
    }

    public void rectangleTest(){
        Rectangle rectangle = new Rectangle(5.0,10.0);
        Assert.assertEquals(50, rectangle.area(), 0.0);
    }
}
