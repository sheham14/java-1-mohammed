package ca.nl.cna.sheham.assignments.Spring2024.assignment1;

import org.junit.Assert;
import org.junit.Test;

public class TestClass {

    @Test
    public void circleTest() {
        try {
            Circle circle = new Circle(-10.0);
            Assert.assertEquals("314.16", String.format("%.2f", circle.area()));
        } catch (InvalidShapeParameterException e) {
            // Handle the exception (optional)
            System.out.println("Rectangle parameters not valid!");
        }
    }

    @Test
    public void rectangleTest() {
        try {
            Rectangle rectangle = new Rectangle(-5.0, 10.0);
            Assert.assertEquals(50, rectangle.area(), 0.0);
        } catch (InvalidShapeParameterException e) {
            // Handle the exception (optional)
            System.out.println("Rectangle parameters not valid!");
        }
    }
}
